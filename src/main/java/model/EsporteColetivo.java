/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author 2022122760265
 */

@Entity
@DiscriminatorValue("coletivo")
public class EsporteColetivo extends Esporte implements Serializable{
    
    @OneToMany(mappedBy = "esporteColetivo")
    private List<Time> times;
    
    @OneToMany(mappedBy = "esporteColetivo")
    private List<TorneioColetivo> torneios;

    public EsporteColetivo(List<Time> times, List<TorneioColetivo> torneios, byte[] foto, String nome, String descricao, List<Atleta> atletas) {
        super(foto, nome, descricao, atletas);
        this.times = times;
        this.torneios = torneios;
    }

    public List<Time> getTimes() {
        return times;
    }

    public List<TorneioColetivo> getTorneios() {
        return torneios;
    }

    public void setTimes(List<Time> times) {
        this.times = times;
    }

    public void setTorneios(List<TorneioColetivo> torneios) {
        this.torneios = torneios;
    }
    
    
}
