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
@DiscriminatorValue("Individual")
public class EsporteIndividual extends Esporte implements Serializable{
    
    @OneToMany(mappedBy = "esporteIndividual")
    private List<TorneioIndividual> torneios;

    public EsporteIndividual() {
    }

    public EsporteIndividual(byte[] foto, String nome, String descricao, String tipo) {
        super(foto, nome, descricao, tipo);
    }

    public List<TorneioIndividual> getTorneios() {
        return torneios;
    }

    public void setTorneios(List<TorneioIndividual> torneios) {
        this.torneios = torneios;
    }
    
    
}
