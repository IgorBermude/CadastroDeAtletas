/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ConexaoHibernate;
import org.hibernate.HibernateException;

/**
 *
 * @author Usuario
 */
public class GerenciadorDominio {
    
    public GerenciadorDominio() throws ExceptionInInitializerError, HibernateException {
        // CONEXAO com o BD
        ConexaoHibernate.getSessionFactory().openSession();
    }
}
