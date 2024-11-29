/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Model.Esporte;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 2022122760265
 */
public class EsporteTableModel extends AbstractTableModel{
    private List<Esporte> listaEsportes = new ArrayList();
    
    @Override
    public int getRowCount(){
        return listaEsportes.size();
    }
    
    @Override
    public int getColumnCount(){
        return 1;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Esporte item = listaEsportes.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return item.getNome();
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        String nomeColunas[] = {"Esporte"};
        return nomeColunas[column]; 
    }

    public void setLista(List<Esporte> novaLista) {
        
        if ( novaLista == null || novaLista.isEmpty()) {
            if ( !listaEsportes.isEmpty() ) {
                listaEsportes.clear();
                fireTableRowsDeleted(0,0);
            }
            System.out.println("Lista vazia");
        } else {
            listaEsportes = novaLista;
            fireTableRowsInserted( 0, listaEsportes.size() - 1);
        }    
    }
    
    public Esporte getEsporte(int linha) {
        return listaEsportes.get(linha);
    }
    
     public void remover (int indice) {        
        listaEsportes.remove(indice);
        fireTableRowsDeleted( indice, indice );   
    }
}
