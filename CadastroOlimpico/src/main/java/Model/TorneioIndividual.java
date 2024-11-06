/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 2022122760265
 */
public class TorneioIndividual extends Torneio{
    private EsporteIndividual esporte;    
    private Date data;
    private String local;
    
    private List<Atleta> atletas;
    
    private Map<Atleta, Integer> Resultado;

    public TorneioIndividual(EsporteIndividual esporte, Date data, String local, <any> atletas, <any> Resultado) {
        this.esporte = esporte;
        this.data = data;
        this.local = local;
        this.atletas = atletas;
        this.Resultado = Resultado;
    }

    public EsporteIndividual getEsporte() {
        return esporte;
    }

    public Date getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public <any> getAtletas() {
        return atletas;
    }

    public <any> getResultado() {
        return Resultado;
    }

    public void setEsporte(EsporteIndividual esporte) {
        this.esporte = esporte;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setAtletas(<any> atletas) {
        this.atletas = atletas;
    }

    public void setResultado(<any> Resultado) {
        this.Resultado = Resultado;
    }
    
    
}
