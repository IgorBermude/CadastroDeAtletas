/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 2022122760265
 */
public class TorneioColetivo extends Torneio{
    private EsporteColetivo esporte;
    private Date data;
    private String local;
    
    private List<Time> times;
    
    private Map<Time, Integer> Resultado;

    public TorneioColetivo(EsporteColetivo esporte, Date data, String local, <any> times, <any> Resultado) {
        this.esporte = esporte;
        this.data = data;
        this.local = local;
        this.times = times;
        this.Resultado = Resultado;
    }

    public EsporteColetivo getEsporte() {
        return esporte;
    }

    public Date getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public <any> getTimes() {
        return times;
    }

    public <any> getResultado() {
        return Resultado;
    }

    public void setEsporte(EsporteColetivo esporte) {
        this.esporte = esporte;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setTimes(<any> times) {
        this.times = times;
    }

    public void setResultado(<any> Resultado) {
        this.Resultado = Resultado;
    }
    
    
}
