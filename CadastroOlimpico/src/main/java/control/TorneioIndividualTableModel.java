package control;

import Model.Atleta;
import Model.TorneioIndividual;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario
 */
public class TorneioIndividualTableModel extends AbstractTableModel {

    private Map<Atleta, Integer> lista = new HashMap<>();

    @Override
    public int getRowCount() {
        return lista.size(); // O número de linhas será o tamanho do HashMap
    }

    @Override
    public int getColumnCount() {
        return 2; // Duas colunas: Colocação e Atleta
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Obter o Atleta no índice rowIndex
        Atleta atleta = (Atleta) lista.keySet().toArray()[rowIndex]; // Obtém o Atleta pela chave
        Integer colocacao = lista.get(atleta); // Obtém a colocação correspondente

        switch (columnIndex) {
            case 0:
                // Exibir apenas a colocação do atleta (ex: "1º", "2º")
                return colocacao + "º";
            case 1:
                // Exibir apenas o nome do atleta
                return atleta.getNome();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        // Define os nomes das colunas
        String nomeColunas[] = {"Colocação", "Atleta"};
        return nomeColunas[column];
    }

    public void setLista(Map<Atleta, Integer> novaLista) {
        // Atualiza o HashMap
        if (novaLista == null || novaLista.isEmpty()) {
            if (!lista.isEmpty()) {
                lista.clear();
                fireTableRowsDeleted(0, 0); // Notifica que a tabela foi limpa
            }
        } else {
            lista = novaLista;
            fireTableRowsInserted(0, lista.size() - 1); // Notifica que a tabela foi atualizada
        }
    }

    public Atleta getAtleta(int linha) {
        // Obtém o Atleta correspondente à linha selecionada no modelo de tabela
        return (Atleta) lista.keySet().toArray()[linha];
    }

    public void remover(int indice) {
        // Remove o Atleta no índice fornecido
        Atleta atleta = (Atleta) lista.keySet().toArray()[indice];
        lista.remove(atleta);
        fireTableRowsDeleted(indice, indice); // Notifica que a linha foi removida
    }

    public Map<Atleta, Integer> getListaTorneioIndividual() {
        return lista; // Retorna o HashMap de Atletas e suas colocações
    }
}
