/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 2022122760265
 */
public class Time {
    private String nome;
    private String nascionalidade;
    
    private List<Atleta> atletas;
    private EsporteColetivo esporte;
    private List<TorneioColetivo> torneios;

    public Time(String nome, String nascionalidade, <any> atletas, EsporteColetivo esporte, <any> torneios) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.atletas = atletas;
        this.esporte = esporte;
        this.torneios = torneios;
    }

    public String getNome() {
        return nome;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public <any> getAtletas() {
        return atletas;
    }

    public EsporteColetivo getEsporte() {
        return esporte;
    }

    public <any> getTorneios() {
        return torneios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public void setAtletas(<any> atletas) {
        this.atletas = atletas;
    }

    public void setEsporte(EsporteColetivo esporte) {
        this.esporte = esporte;
    }

    public void setTorneios(<any> torneios) {
        this.torneios = torneios;
    }
    
    
}
