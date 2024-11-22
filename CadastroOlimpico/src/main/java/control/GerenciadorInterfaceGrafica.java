/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package control;

import Model.Atleta;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import view.DlgBuscar;
import view.DlgGerAtleta;
import view.DlgCadEsporte;
import view.DlgCadTorneio;
import view.DlgConfiguracoes;
import view.DlgListarCadastros;
import view.DlgPesqAtleta;
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
    private static GerenciadorInterfaceGrafica myInstance = new GerenciadorInterfaceGrafica ();
    
    private GerenciadorInterfaceGrafica() {
        try {
            gerDom = new GerenciadorDominio();
        } catch ( ExceptionInInitializerError | HibernateException ex) {
            JOptionPane.showMessageDialog(princ, "ERRO ao abrir a conexão com o banco de dados.", "Abrir conexão:\n", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
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
        if (dlg == null){     
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class).newInstance(parent,true);                
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName() + ". " + ex.getMessage() );
            } 
        }       
        dlg.setVisible(true); 
        
        return dlg;
    }
    
    //Metodos para abrir as janelas:
    public void abrirPrincipal(){
        FrmPrincipal princ = new FrmPrincipal();
        princ.setVisible(true);
    }
    
    public void abrirCadastroAtleta(){
        abrirJanela(princ, cadAtl,  DlgGerAtleta.class );
    }
    
    public void abrirCadastroEsporte(){
        abrirJanela(princ, cadEsp,  DlgCadEsporte.class );
    }
    
    public void abrirConfiguracoes(){
        abrirJanela(princ, conf,  DlgConfiguracoes.class );
    }
    
    public void abrirListarCadastros(){
        abrirJanela(princ, listCad,  DlgListarCadastros.class );
    }
    
    public void abrirCadastroTorneio(){
        abrirJanela(princ, cadTor, DlgCadTorneio.class);
    }
    
    public void abrirResultado(){
        abrirJanela(princ, res, DlgResultado.class);
    }
    
    public void abrirVerTimes(){
        abrirJanela(princ, tim, DlgTimes.class);
    }
    
    public Atleta abrirPesqAtleta() {
        pesqAtl = (DlgPesqAtleta) abrirJanela(princ, pesqAtl, DlgPesqAtleta.class );
        return pesqAtl.getCliSelecionado();
    }
}
