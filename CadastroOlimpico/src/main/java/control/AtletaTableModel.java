/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Model.Atleta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 2022122760265
 */
public class AtletaTableModel extends AbstractTableModel{
    private ArrayList<Atleta> listaAtletas = new ArrayList();
    
    // Lista de OBJETOS
    private List<Atleta> listaItens = new ArrayList();
    
    @Override
    public int getRowCount(){
        return listaAtletas.size();
    }
    
    @Override
    public int getColumnCount(){
        return 1;
    }
    
    /*@Override
    public Object getValueAt(int rowIndex, int columnIndex){
        try{
            Atleta item = listaAtletas.get(rowIndex);
        }
    }
    
    @Override
    public String getColumnName(int column){
        String nomeColunas[] = "Atleta", "Esporte", "Rank", "Ouro", "Prata", "Bronze";
    }*/

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void setLista(List<Atleta> novaLista) {
        
        if ( novaLista == null || novaLista.isEmpty()) {
            if ( !listaItens.isEmpty() ) {
                listaItens.clear();
                fireTableRowsDeleted(0,0);
            }
        } else {
            listaItens = novaLista;
            fireTableRowsInserted( 0, listaItens.size() - 1);
        }
                
    }
    
    public Atleta getAtleta(int linha) {
        return listaItens.get(linha);
    }
    
     public void remover (int indice) {        
        listaItens.remove(indice);
        fireTableRowsDeleted( indice, indice );   
    }
}
