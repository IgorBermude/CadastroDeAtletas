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
    private List<Atleta> listaAtletas = new ArrayList();
    
    @Override
    public int getRowCount(){
        return listaAtletas.size();
    }
    
    @Override
    public int getColumnCount(){
        return 6;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Atleta item = listaAtletas.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return item.getNome();
            case 1: return item.getEsportes().toString();
            case 2: return item.getOuro();
            case 3: return item.getPrata();
            case 4: return item.getBronze();
            case 5: return item.getNacionalidae();
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        String nomeColunas[] = {"Atleta", "Esporte", "Ouro", "Prata", "Bronze", "Nacionalidade"};
        return nomeColunas[column]; 
    }

    public void setLista(List<Atleta> novaLista) {
        
        if ( novaLista == null || novaLista.isEmpty()) {
            if ( !listaAtletas.isEmpty() ) {
                listaAtletas.clear();
                fireTableRowsDeleted(0,0);
            }
            System.out.println("Lista vazia");
        } else {
            listaAtletas = novaLista;
            fireTableRowsInserted( 0, listaAtletas.size() - 1);
        }    
    }
    
    public Atleta getAtleta(int linha) {
        return listaAtletas.get(linha);
    }
    
     public void remover (int indice) {        
        listaAtletas.remove(indice);
        fireTableRowsDeleted( indice, indice );   
    }
}
