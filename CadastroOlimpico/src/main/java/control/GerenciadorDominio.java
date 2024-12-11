/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Model.Atleta;
import Model.Esporte;
import Model.EsporteColetivo;
import Model.EsporteIndividual;
import Model.Time;
import Model.TorneioColetivo;
import Model.TorneioIndividual;
import dao.AtletaDAO;
import dao.ConexaoHibernate;
import dao.EsporteDAO;
import dao.GenericDAO;
import dao.TimeDAO;
import java.util.Date;
import java.util.List;
import java.util.Map;
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
    private TimeDAO timDAO;
    
    public GerenciadorDominio() throws ExceptionInInitializerError, HibernateException {
        // CONEXAO com o BD
        ConexaoHibernate.getSessionFactory().openSession();
        
        genDAO = new GenericDAO();
        atlDAO = new AtletaDAO();
        espDAO = new EsporteDAO();
        timDAO = new TimeDAO();
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
    public List listarAtletas(Class atleta)throws HibernateException {
        return atlDAO.listarAtletas(atleta);
    }
    
    public List listarTimes(EsporteColetivo classe) throws HibernateException {
        return timDAO.listarTimesPorEsporte( classe);
    }
    
    public int inserirTorneioColetivo(TorneioColetivo torneio){
        
        genDAO.inserir(torneio);
        
        return torneio.getIdTorneioColetivo();
    }
    
    public int inserirTorneioIndividual(TorneioIndividual torneio){
        
        genDAO.inserir(torneio);
        
        return torneio.getIdTorneioIndividual();
    }
    
    public int inserirAtleta(String nome, String cpf, String celular, String email, String sexo, String nacionalidae, String sobre, int ouro, int prata, int bronze, Icon foto, String nascimento, List<Esporte> esportes) throws HibernateException  {

        Atleta atl = new Atleta( nome, cpf, celular, email, sexo, nacionalidae, sobre, ouro, prata, bronze, FuncoesUteis.IconToBytes(foto), nascimento, esportes);
                
        atlDAO.inserir(atl);
        
        return atl.getIdAtleta();
        
    }
    
    public void alterarAtleta(int id, String nome, String cpf, String celular, String email, String sexo, String nacionalidae, String sobre, int ouro, int prata, int bronze, Icon foto, String nascimento, List<Esporte> esportes) throws HibernateException  {

        Atleta atl = new Atleta( id, nome, cpf, celular, email, sexo, nacionalidae, sobre, ouro, prata, bronze, FuncoesUteis.IconToBytes(foto), nascimento, esportes);
        
        atlDAO.alterar(atl);            

    }
    
    public int inserirTime(String nome, String nacionalidade, List<Atleta> atletas, EsporteColetivo esporteColetivo) throws HibernateException  {

        Time time = new Time( nome, nacionalidade, atletas, esporteColetivo);
                
        genDAO.inserir(time);
        
        return time.getIdTime();
        
    }
    
    public int inserirEsporte(Icon foto, String nome, String descricao, String tipo) throws HibernateException  {

        Esporte esp = new Esporte( FuncoesUteis.IconToBytes(foto), nome, descricao, tipo);
                
        espDAO.inserir(esp);
        
        return esp.getIdEsporte();
        
    }
    
    public int inserirEsporteColetivo(Icon foto, String nome, String descricao, String tipo) throws HibernateException  {

        Esporte esp = new EsporteColetivo( FuncoesUteis.IconToBytes(foto), nome, descricao, tipo);
                
        espDAO.inserir(esp);
        
        return esp.getIdEsporte();
        
    }
    
    public int inserirEsporteIndividual(Icon foto, String nome, String descricao, String tipo) throws HibernateException  {

        Esporte esp = new EsporteIndividual( FuncoesUteis.IconToBytes(foto), nome, descricao, tipo);
                
        espDAO.inserir(esp);
        
        return esp.getIdEsporte();
        
    }
    
    public void alterarEsporte(Icon foto, String nome, String descricao, String tipo) throws HibernateException  {

        Esporte esp = new Esporte( FuncoesUteis.IconToBytes(foto), nome, descricao, tipo);
        
        espDAO.alterar(esp);            

    }
    
    public List<Atleta> pesquisarAtleta(String pesq, int tipo) throws HibernateException {
        
        switch (tipo) {
            case 0: return atlDAO.pesquisarPorNome(pesq);
            case 1: return atlDAO.pesquisarPorEsporte(pesq);
            case 2: return atlDAO.pesquisarPorOuro(pesq);
            case 3: return atlDAO.pesquisarPorPrata(pesq);
            case 4: return atlDAO.pesquisarPorBronze(pesq);
            case 5: return atlDAO.pesquisarPorNacionalidade(pesq);
            default: return null;
        }
        
    }
    
    public void limpar(Class classe)throws HibernateException {
        genDAO.limpar(classe);
    }

    public void adicionarMedalha(int idAtleta, String tipoMedalha){
        atlDAO.adicionarMedalha(idAtleta, tipoMedalha);
    }
}
