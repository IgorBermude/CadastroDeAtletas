/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Model.Atleta;
import Model.Esporte;
import dao.AtletaDAO;
import dao.ConexaoHibernate;
import dao.EsporteDAO;
import dao.GenericDAO;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import org.hibernate.HibernateException;

/**
 *
 * @author Usuario
 */
public class GerenciadorDominio {
    
    private GenericDAO genDAO;
    private AtletaDAO atlDAO;
    private EsporteDAO espDAO;
    
    public GerenciadorDominio() throws ExceptionInInitializerError, HibernateException {
        // CONEXAO com o BD
        ConexaoHibernate.getSessionFactory().openSession();
        
        genDAO = new GenericDAO();
        atlDAO = new AtletaDAO();
        espDAO = new EsporteDAO();
    }
    
    // ######################    
    //  Métodos GENÉRICOS
    // ######################
    
    public List listar(Class classe) throws HibernateException {
        return genDAO.listar( classe);
    }

    public void excluir(Object obj) throws HibernateException {
        genDAO.excluir(obj);            
    }
    
    // ###############################
    
    public int inserirAtleta(String nome, String cpf, String celular, String email, String sexo, String nacionalidae, String sobre, int ouro, int prata, int bronze, Icon foto, String nascimento, List<Esporte> esportes) throws HibernateException  {

        Atleta atl = new Atleta( nome, cpf, celular, email, sexo, nacionalidae, sobre, ouro, prata, bronze, FuncoesUteis.IconToBytes(foto), nascimento, esportes);
                
        atlDAO.inserir(atl);
        
        return atl.getIdAtleta();
        
    }
    
    public void alterarAtleta(String nome, String cpf, String celular, String email, String sexo, String nacionalidae, String sobre, int ouro, int prata, int bronze, Icon foto, String nascimento, List<Esporte> esportes) throws HibernateException  {

        Atleta atl = new Atleta( nome, cpf, celular, email, sexo, nacionalidae, sobre, ouro, prata, bronze, FuncoesUteis.IconToBytes(foto), nascimento, esportes);
        
        atlDAO.alterar(atl);            

    }
    
    public int inserirEsporte(Icon foto, String nome, String descricao, String tipo) throws HibernateException  {

        Esporte esp = new Esporte( FuncoesUteis.IconToBytes(foto), nome, descricao, tipo);
                
        espDAO.inserir(esp);
        
        return esp.getIdEsporte();
        
    }
    
    public void alterarEsporte(Icon foto, String nome, String descricao, String tipo) throws HibernateException  {

        Esporte esp = new Esporte( FuncoesUteis.IconToBytes(foto), nome, descricao, tipo);
        
        espDAO.alterar(esp);            

    }
    
    public List<Atleta> pesquisarAtleta(String pesq) throws HibernateException {
        return atlDAO.pesquisarPorNome(pesq);
    }
}
