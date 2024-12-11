package control;

import Model.Atleta;
import Model.Time;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class TimeTableModel extends AbstractTableModel {
    private List<Time> listaTimes = new ArrayList();
    
    @Override
    public int getRowCount(){
        return listaTimes.size();
    }
    
    @Override
    public int getColumnCount(){
        return 3;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Time item = listaTimes.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return item.getNome();
            case 1: return item.getNacionalidade();
            case 2: return item.getAtletas();
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        String nomeColunas[] = {"Nome", "Nacionalidade", "Atletas"};
        return nomeColunas[column]; 
    }

    public void setLista(List<Time> novaLista) {
        
        if ( novaLista == null || novaLista.isEmpty()) {
            if ( !listaTimes.isEmpty() ) {
                listaTimes.clear();
                fireTableRowsDeleted(0,0);
            }
            System.out.println("Lista vazia");
        } else {
            listaTimes = novaLista;
            fireTableRowsInserted( 0, listaTimes.size() - 1);
        }    
    }
    
    public Time getTime(int linha) {
        return listaTimes.get(linha);
    }
    
     public void remover (int indice) {        
        listaTimes.remove(indice);
        fireTableRowsDeleted( indice, indice );   
    }

    public List<Time> getListaTimes() {
        return listaTimes;
    }
}
