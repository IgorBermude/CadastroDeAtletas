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
public class TorneioIndividual implements Serializable{
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idTorneioIndividual;  
    
    @Temporal ( value = TemporalType.DATE)
    private Date data;
    
    @Column (name = "localTorneioIndividual", nullable = false )
    private String local;
    
    @ManyToOne
    @JoinColumn(name = "esporte_individual_id")
    private EsporteIndividual esporteIndividual;  
    
    @ManyToMany
    @JoinTable(
        name = "torneio_individual_atleta",
        joinColumns = @JoinColumn(name = "torneio_individual_id"),
        inverseJoinColumns = @JoinColumn(name = "atleta_id")
    )
    private List<Atleta> atletas;
    
    @ElementCollection
    @CollectionTable(name = "resultado_individual", joinColumns = @JoinColumn(name = "torneio_individual_id"))
    @MapKeyJoinColumn(name = "atleta_id")
    @Column(name = "pontuacao")
    private Map<Atleta, Integer> Resultado;

    public TorneioIndividual(EsporteIndividual esporteIndividual, Date data, String local, List<Atleta> atletas, Map<Atleta, Integer> Resultado) {
        this.esporteIndividual = esporteIndividual;
        this.data = data;
        this.local = local;
        this.atletas = atletas;
        this.Resultado = Resultado;
    }

    public EsporteIndividual getEsporte() {
        return esporteIndividual;
    }

    public Date getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public Map<Atleta, Integer> getResultado() {
        return Resultado;
    }

    public void setEsporte(EsporteIndividual esporteIndividual) {
        this.esporteIndividual = esporteIndividual;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setAtletas(List<Atleta> atletas) {
        this.atletas = atletas;
    }

    public void setResultado(Map<Atleta, Integer> Resultado) {
        this.Resultado = Resultado;
    }
    
    
}
