/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.EsporteColetivo;
import Model.Time;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Usuario
 */
public class TimeDAO {
    public List<Time> listarTimesPorEsporte(EsporteColetivo esporte) {
        List<Time> times = null;

        try (Session session = ConexaoHibernate.getSessionFactory().openSession()) {
            // Criar consulta HQL para buscar times com base no esporte
            String hql = "SELECT DISTINCT t FROM Time t LEFT JOIN FETCH t.atletas WHERE t.esporteColetivo = :esporte";
            times = session.createQuery(hql, Time.class)
                           .setParameter("esporte", esporte)
                           .getResultList();
        } catch (HibernateException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar times: " + e.getMessage(),
                                          "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        return times;
    }
}
