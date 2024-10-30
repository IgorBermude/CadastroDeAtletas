/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package control;

import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import view.DlgBuscar;
import view.DlgCadAtleta;
import view.DlgCadEsporte;
import view.DlgCadTorneio;
import view.DlgConfiguracoes;
import view.DlgListarCadastros;
import view.FrmPrincipal;

/**
 *
 * @author 2022122760265
 */
public class GerenciadorInterfaceGrafica {
    
    //Declaração de janelas:
    private FrmPrincipal princ = null;
    private DlgCadAtleta cadAtl = null;
    private DlgCadEsporte cadEsp = null;
    private DlgBuscar busc = null;
    private DlgConfiguracoes conf = null;
    private DlgListarCadastros listCad = null;
    private DlgCadTorneio cadTor = null;
    
    
    // SINGLETON
    private static GerenciadorInterfaceGrafica myInstance = new GerenciadorInterfaceGrafica ();

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
        abrirJanela(princ, cadAtl,  DlgCadAtleta.class );
    }
    
    public void abrirCadastroEsporte(){
        abrirJanela(princ, cadEsp,  DlgCadEsporte.class );
    }
    
    public void abrirBuscar(){
        abrirJanela(princ, busc,  DlgBuscar.class );
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
}
