package control;

import Model.Atleta;
import Model.Time;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.AbstractTableModel;
import org.hibernate.Hibernate;

/**
 *
 * @author Usuario
 */
public class TorneioColetivoTableModel extends AbstractTableModel {

    private Map<Time, Integer> lista = new HashMap<>();

    @Override
    public int getRowCount() {
        return lista.size(); // Número de linhas será o tamanho do HashMap
    }

    @Override
    public int getColumnCount() {
        return 2; // O número de colunas permanece o mesmo (Colocação, Atletas, Times)
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // Obtém o time correspondente à linha        
        Time time = (Time) lista.keySet().toArray()[rowIndex]; // Obtemos o time pela chave
        Integer colocacao = lista.get(time); // Obtém a colocação do time

        switch (columnIndex) {
            case 0:
                // Mostrar a colocação do time (ex: 1º, 2º, 3º, etc.)
                return colocacao + "º"; // Exibe a colocação com o símbolo "º"
            case 1:
                // Exibir o nome do time
                return time.getNome();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        // Define os nomes das colunas
        String nomeColunas[] = {"Colocação", "Times"};
        return nomeColunas[column];
    }

    public void setLista(Map<Time, Integer> novaLista) {
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

    public Time getTime(int linha) {
        // Obtém o time correspondente à linha
        return (Time) lista.keySet().toArray()[linha];
    }

    public void remover(int indice) {
        // Remove o time no índice fornecido
        Time time = (Time) lista.keySet().toArray()[indice];
        lista.remove(time);
        fireTableRowsDeleted(indice, indice); // Notifica que a linha foi removida
    }

    public Map<Time, Integer> getListaTorneioColetivo() {
        return lista; // Retorna o HashMap de times e colocações
    }
}
