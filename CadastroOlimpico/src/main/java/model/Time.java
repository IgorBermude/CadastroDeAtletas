/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author 2022122760265
 */

@Entity
public class Time implements Serializable{
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idTime;
    
    @Column (name = "nomeTime", nullable = false )
    private String nome;
    
    @Column(name = "nacionalidadeTime", nullable = false)
    private String nacionalidade;
    
    @OneToMany(mappedBy = "time")
    private List<Atleta> atletas;
    
    @ManyToOne
    @JoinColumn(name = "esporte_coletivo_id")
    private EsporteColetivo esporteColetivo;
    
    @ManyToMany
    @JoinTable(
        name = "time_torneio_coletivo",
        joinColumns = @JoinColumn(name = "time_id"),
        inverseJoinColumns = @JoinColumn(name = "torneio_coletivo_id")
    )
    private List<TorneioColetivo> torneios;

    public Time(String nome, String nacionalidade, List<Atleta> atletas, EsporteColetivo esporteColetivo, List<TorneioColetivo> torneios) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.atletas = atletas;
        this.esporteColetivo = esporteColetivo;
        this.torneios = torneios;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public EsporteColetivo getEsporte() {
        return esporteColetivo;
    }

    public List<TorneioColetivo> getTorneios() {
        return torneios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nacionalidade = nascionalidade;
    }

    public void setAtletas(List<Atleta> atletas) {
        this.atletas = atletas;
    }

    public void setEsporte(EsporteColetivo esporteColetivo) {
        this.esporteColetivo = esporteColetivo;
    }

    public void setTorneios(List<TorneioColetivo> torneios) {
        this.torneios = torneios;
    }
    
    
}
