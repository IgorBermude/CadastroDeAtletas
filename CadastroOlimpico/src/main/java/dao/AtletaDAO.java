/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Atleta;
import Model.Esporte;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author 2022122760265
 */
public class AtletaDAO extends GenericDAO{
    
    
    private List<Atleta> pesquisar(String pesq, int tipo) {
        List<Atleta> lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Criação do CriteriaBuilder e CriteriaQuery
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery<Atleta> consulta = builder.createQuery(Atleta.class);
            Root<Atleta> tabela = consulta.from(Atleta.class);

            Predicate restricoes = null;

            switch (tipo) {
                case 1: 
                    // Pesquisar por nome do atleta
                    restricoes = builder.like(tabela.get("nome"), pesq + "%");
                    break;

                case 2:
                    // Pesquisar por nome do esporte
                    Join<Atleta, Esporte> joinEsportes = tabela.join("esportes");
                    restricoes = builder.like(joinEsportes.get("nome"), pesq + "%");
                    break;

                case 3:                   
                    // Pesquisar por quantidade de medalhas de ouro
                    restricoes = builder.equal(tabela.get("ouro"), Integer.parseInt(pesq));                  
                    break;  

                case 4:                   
                    // Pesquisar por quantidade de medalhas de prata
                    restricoes = builder.equal(tabela.get("prata"), Integer.parseInt(pesq));                  
                    break;                            

                case 5:                   
                    // Pesquisar por quantidade de medalhas de bronze
                    restricoes = builder.equal(tabela.get("bronze"), Integer.parseInt(pesq));                  
                    break;      

                case 6:                   
                    // Pesquisar por nacionalidade do atleta
                    restricoes = builder.like(tabela.get("nacionalidade"), pesq + "%");                  
                    break;

                default:
                    throw new IllegalArgumentException("Tipo de pesquisa inválido: " + tipo);
            }

            // Aplicar as restrições na consulta
            consulta.where(restricoes);

            // Executar a consulta
            lista = sessao.createQuery(consulta).getResultList();

            sessao.getTransaction().commit();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
            }
            throw new HibernateException("Erro ao pesquisar atletas", ex);
        } finally {
            if (sessao != null) {
                sessao.close();
            }
        }
        return lista;
    }

    
    public List<Atleta> pesquisarPorNome(String pesq)  {
        return pesquisar(pesq, 1);
    }
    
    public List<Atleta> pesquisarPorEsporte(String pesq)  {
        return pesquisar(pesq, 2);
    }
    
    public List<Atleta> pesquisarPorOuro(String pesq)  {
        return pesquisar(pesq, 3);
    } 
    
    public List<Atleta> pesquisarPorPrata(String pesq)  {
        return pesquisar(pesq, 4);
    } 
    
    public List<Atleta> pesquisarPorBronze(String pesq)  {
        return pesquisar(pesq, 5);
    } 
    
    public List<Atleta> pesquisarPorNacionalidade(String pesq)  {
        return pesquisar(pesq, 6);
    } 
    
    public List<Atleta> listarAtletas(Class classe) throws HibernateException {
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Consultar Atletas e carregar as coleções relacionadas
            String hql = "SELECT a FROM Atleta a LEFT JOIN FETCH a.esportes";
            List<Atleta> lista = sessao.createQuery(hql, Atleta.class).getResultList();

            sessao.getTransaction().commit();
            return lista;
        } catch (HibernateException e) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
            }
            throw new HibernateException("Erro ao listar Atletas", e);
        } finally {
            if (sessao != null) {
                sessao.close();
            }
        }
    }
    
    public void adicionarMedalha(int idAtleta, String tipoMedalha) throws HibernateException {
        Session sessao = null;
        try {
            // Abrir uma sessão
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Buscar o atleta pelo ID
            Atleta atleta = sessao.get(Atleta.class, idAtleta);
            if (atleta != null) {
                // Verificar o tipo da medalha e atualizar o respectivo contador
                switch (tipoMedalha.toLowerCase()) {
                    case "ouro":
                        atleta.setOuro(atleta.getOuro() + 1); // Incrementa medalha de ouro
                        break;
                    case "prata":
                        atleta.setPrata(atleta.getPrata() + 1); // Incrementa medalha de prata
                        break;
                    case "bronze":
                        atleta.setBronze(atleta.getBronze() + 1); // Incrementa medalha de bronze
                        break;
                    default:
                        throw new IllegalArgumentException("Tipo de medalha inválido: " + tipoMedalha);
                }

                // Salvar as alterações no banco de dados
                sessao.update(atleta);
            } else {
                throw new IllegalArgumentException("Atleta não encontrado com o ID: " + idAtleta);
            }

            // Commit da transação
            sessao.getTransaction().commit();
        } catch (HibernateException e) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
            }
            throw new HibernateException("Erro ao adicionar medalha ao atleta", e);
        } finally {
            if (sessao != null) {
                sessao.close();
            }
        }
    }

    
}
