/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Atleta;
import java.util.List;

/**
 *
 * @author 2022122760265
 */
public class AtletaDAO extends GenericDAO{
    
    
    private List<Atleta> pesquisar(String pesq, int tipo)  {
        
        // SOMENTE PARA TESTE
        return this.listar( Atleta.class);
        
        /*
        List<Cliente> lista = new ArrayList();
      
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // OPERAÇÃO

            sessao.getTransaction().commit();
            sessao.close();
        } catch ( HibernateException erro) {
            if ( sessao != null ) {
                sessao.getTransaction().rollback();
            }
            throw new HibernateException(erro);            
        }        
      
        
        return null; 
          */       
    }
    
    public List<Atleta> pesquisarPorNome(String pesq)  {
        return pesquisar(pesq, 1);
    }
    
    public List<Atleta> pesquisarPorBairro(String pesq)  {
        return pesquisar(pesq, 2);
    }
    
    public List<Atleta> pesquisarPorMes(String pesq)  {
        return pesquisar(pesq, 3);
    }
}
