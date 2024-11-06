/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 2022122760265
 */
public class Esporte {
    private byte[] foto;
    private String nome;
    private String descricao;
    
    private List<Atleta> atletas;

    public Esporte(byte[] foto, String nome, String descricao, <any> atletas) {
        this.foto = foto;
        this.nome = nome;
        this.descricao = descricao;
        this.atletas = atletas;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAtletas(<any> atletas) {
        this.atletas = atletas;
    }

    public byte[] getFoto() {
        return foto;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public <any> getAtletas() {
        return atletas;
    }

    
}
