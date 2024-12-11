/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author 2022122760265
 */
@Entity
public class TorneioColetivo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTorneioColetivo;

    @Column(name = "dataTorneioColetivo", nullable = false)
    private String data;

    @Column(name = "localTorneioColetivo", nullable = false)
    private String local;

    @ManyToOne
    @JoinColumn(name = "esporte_coletivo_id")
    private EsporteColetivo esporteColetivo;

    @ManyToMany
    @JoinTable(
            name = "torneio_coletivo_time",
            joinColumns = @JoinColumn(name = "torneio_coletivo_id"),
            inverseJoinColumns = @JoinColumn(name = "time_id")
    )
    private List<Time> times;

    @ElementCollection
    @CollectionTable(name = "resultado_coletivo", joinColumns = @JoinColumn(name = "torneio_coletivo_id"))
    @MapKeyJoinColumn(name = "time_id")
    @Column(name = "pontuacao")
    private Map<Time, Integer> Resultado;

    public TorneioColetivo() {
    }

    public int getIdTorneioColetivo() {
        return idTorneioColetivo;
    }

    public TorneioColetivo(EsporteColetivo esporteColetivo, String data, String local, List<Time> times, Map<Time, Integer> Resultado) {
        this.esporteColetivo = esporteColetivo;
        this.data = data;
        this.local = local;
        this.times = times;
        this.Resultado = Resultado;
    }

    public EsporteColetivo getEsporte() {
        return esporteColetivo;
    }

    public String getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public List<Time> getTimes() {
        return times;
    }

    public Map<Time, Integer> getResultado() {
        return Resultado;
    }

    public void setEsporte(EsporteColetivo esporteColetivo) {
        this.esporteColetivo = esporteColetivo;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setTimes(List<Time> times) {
        this.times = times;
    }

    public void setResultado(Map<Time, Integer> Resultado) {
        this.Resultado = Resultado;
    }

}
