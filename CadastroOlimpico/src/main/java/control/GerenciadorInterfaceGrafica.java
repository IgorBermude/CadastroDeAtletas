/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package control;

import Model.Atleta;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import view.DlgGerAtleta;
import view.DlgCadEsporte;
import view.DlgCadTorneio;
import view.DlgConfiguracoes;
import view.DlgListarCadastros;
import view.DlgResultado;
import view.DlgTimes;
import view.FrmPrincipal;

/**
 *
 * @author 2022122760265
 */
public class GerenciadorInterfaceGrafica {

    //Declaração de janelas:
    private FrmPrincipal princ = null;
    private DlgGerAtleta cadAtl = null;
    private DlgCadEsporte cadEsp = null;
    private DlgConfiguracoes conf = null;
    private DlgListarCadastros listCad = null;
    private DlgCadTorneio cadTor = null;
    private DlgResultado res = null;
    private DlgTimes tim = null;

    GerenciadorDominio gerDom;
    // SINGLETON
    private static GerenciadorInterfaceGrafica myInstance = new GerenciadorInterfaceGrafica();

    private GerenciadorInterfaceGrafica() {
        try {
            gerDom = new GerenciadorDominio();
        } catch (ExceptionInInitializerError | HibernateException ex) {
            JOptionPane.showMessageDialog(princ, "ERRO ao abrir a conexão com o banco de dados.", "Abrir conexão:\n", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    public GerenciadorDominio getGerDom() {
        return gerDom;
    }

    public static GerenciadorInterfaceGrafica getMyInstance() {
        return myInstance;
    }

    public static void main(String[] args) {
        FuncoesUteis.aplicarTemaClaro();
        GerenciadorInterfaceGrafica.getMyInstance().abrirPrincipal();
        JOptionPane.showMessageDialog(null, "Este trabalho esta em desenvolvimento.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }

    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null) {
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class).newInstance(parent, true);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() + ". " + ex);
            }
        }
        dlg.setVisible(true);

        return dlg;
    }

    public void carregarCombo(JComboBox combo, Class classe) {

        try {
            List lista = gerDom.listar(classe);
            combo.setModel(new DefaultComboBoxModel(lista.toArray()));
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(princ, ex, "ERRO ao carregar combobox.", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void carregarList(JList lista, Class classe) {
        try {
            // Obtém a lista de objetos do banco de dados
            List dados = gerDom.listar(classe);

            // Define o modelo da JList
            lista.setModel(new DefaultListModel() {
                {
                    // Adiciona cada elemento ao modelo da JList
                    for (Object obj : dados) {
                        addElement(obj);
                    }
                }
            });
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(
                    princ,
                    ex,
                    "ERRO ao carregar lista.",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    //Metodos para abrir as janelas:
    public void abrirPrincipal() {
        FrmPrincipal princ = new FrmPrincipal();
        princ.setVisible(true);
    }

    public void abrirCadastroAtleta() {
        abrirJanela(princ, cadAtl, DlgGerAtleta.class);
    }

    public void abrirCadastroEsporte() {
        abrirJanela(princ, cadEsp, DlgCadEsporte.class);
    }

    public void abrirConfiguracoes() {
        abrirJanela(princ, conf, DlgConfiguracoes.class);
    }

    public void abrirListarCadastros() {
        abrirJanela(princ, listCad, DlgListarCadastros.class);
    }

    public void abrirCadastroTorneio() {
        abrirJanela(princ, cadTor, DlgCadTorneio.class);
    }

    public void abrirResultado() {
        abrirJanela(princ, res, DlgResultado.class);
    }

    public void abrirVerTimes() {
        abrirJanela(princ, tim, DlgTimes.class);
    }

    public Atleta abrirPesqAtleta() {
        listCad = (DlgListarCadastros) abrirJanela(princ, listCad, DlgListarCadastros.class);
        return listCad.getAtlSelecionado();
    }
}
