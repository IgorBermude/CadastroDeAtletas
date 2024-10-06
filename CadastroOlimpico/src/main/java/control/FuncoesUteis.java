/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author 2022122760265
 */
public class FuncoesUteis {
    
    public static void mostrarFoto(JLabel lbl, Icon ic) {
        
        // Redimensionar
        ImageIcon imagem = (ImageIcon) ic;
        imagem.setImage(imagem.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        
        lbl.setText("");                
        lbl.setIcon(imagem);
    } 
    
    public static void aplicarTemaEscuro() {
        try {
            // Define o tema escuro do FlatLaf
            UIManager.setLookAndFeel(new FlatDarkLaf());
            
            // Atualizar o visual dos componentes existentes
            SwingUtilities.updateComponentTreeUI(JFrame.getFrames()[0]);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void aplicarTemaClaro() {
        try {
            // Define o tema escuro do FlatLaf
            UIManager.setLookAndFeel(new FlatLightLaf());
            
            // Atualizar o visual dos componentes existentes
            SwingUtilities.updateComponentTreeUI(JFrame.getFrames()[0]);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
