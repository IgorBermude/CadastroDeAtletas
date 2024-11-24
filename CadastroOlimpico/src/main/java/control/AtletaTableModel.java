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
        return 5;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Atleta item = listaItens.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return item.getNome();
            case 1: return item.getEsportes().toString();
            case 2: return item.getOuro();
            case 3: return item.getPrata();
            case 4: return item.getBronze();
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        String nomeColunas[] = {"Atleta", "Esporte", "Ouro", "Prata", "Bronze"};
        return nomeColunas[column]; 
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
