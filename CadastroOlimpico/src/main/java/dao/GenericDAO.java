/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Atleta;
import Model.Esporte;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author 1547816
 */
public class GenericDAO {
 
    public void inserir(Object obj) throws HibernateException  {
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            sessao.save(obj);

            sessao.getTransaction().commit();
            sessao.close();
        } catch ( HibernateException erro) {
            if ( sessao != null ) {
                sessao.getTransaction().rollback();
            }
            throw new HibernateException(erro);            
        }
        
    }
    
    
    public void alterar(Object obj )  {
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            sessao.update(obj);

            sessao.getTransaction().commit();
            sessao.close();
        } catch ( HibernateException erro) {
            if ( sessao != null ) {
                sessao.getTransaction().rollback();
            }
            throw new HibernateException(erro);            
        }
        
        
    }
    
    public void excluir(Object obj)  {
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            sessao.delete(obj);

            sessao.getTransaction().commit();
            sessao.close();
        } catch ( HibernateException erro) {
            if ( sessao != null ) {
                sessao.getTransaction().rollback();
            }
            throw new HibernateException(erro);            
        }  
    }   
    
    public List listar( Class classe )  {
        List lista = new ArrayList();
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO
            CriteriaQuery consulta = sessao.getCriteriaBuilder().createQuery(classe);
            consulta.from(classe );                        
            lista = sessao.createQuery(consulta).getResultList(); 
            
            sessao.getTransaction().commit();
            sessao.close();
        } catch ( HibernateException erro) {
            if ( sessao != null ) {
                sessao.getTransaction().rollback();
            }
            throw new HibernateException(erro);            
        }  
        
        return lista;
    }  
    
    public void limpar(Class classe) {
        Session sessao = null;
        try {
            // Abrindo uma nova sessão
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            String hql = "DELETE FROM " + classe.getSimpleName();  // Exclui todos os objetos de uma tabela

            // Executando a consulta
            sessao.createQuery(hql).executeUpdate();

            // Commit da transação
            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException erro) {
            // Se ocorrer algum erro, realiza o rollback da transação
            if (sessao != null) {
                sessao.getTransaction().rollback();
            }
            throw new HibernateException("Erro ao limpar lista de Atletas", erro);
        }
    }

    
    
}
