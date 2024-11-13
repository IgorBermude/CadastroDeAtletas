/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Atleta;
import Model.Esporte;
import java.util.List;

/**
 *
 * @author 2022122760265
 */
public class EsporteDAO extends GenericDAO{
    private List<Esporte> pesquisar(String pesq, int tipo)  {
        
        // SOMENTE PARA TESTE
        return this.listar( Esporte.class);
        
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
    
    public List<Esporte> pesquisarPorNome(String pesq)  {
        return pesquisar(pesq, 1);
    }
    
    public List<Esporte> pesquisarPorBairro(String pesq)  {
        return pesquisar(pesq, 2);
    }
    
    public List<Esporte> pesquisarPorMes(String pesq)  {
        return pesquisar(pesq, 3);
    }
}
