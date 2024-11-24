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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

/**
 *
 * @author 2022122760265
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Esporte implements Serializable {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idEsporte;
    
    @Lob
    private byte[] foto;
    
    @Column (name = "nomeEsporte", nullable = false )
    private String nome;
    
    @Column (name = "descricaoEsporte", nullable = false )
    private String descricao;
    
    @ManyToMany(mappedBy = "esportes")
    private List<Atleta> atletas;
    
    @Column (name = "tipoesporte", nullable = false, length = 20 )
    private String tipo;

    public Esporte(byte[] foto, String nome, String descricao, List<Atleta> atletas, String tipo) {
        this.foto = foto;
        this.nome = nome;
        this.descricao = descricao;
        this.atletas = atletas;
        this.tipo = tipo;
    }
    
    public Esporte(byte[] foto, String nome, String descricao, String tipo) {
        this.foto = foto;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Esporte() {
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAtletas(List<Atleta> atletas) {
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

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public int getIdEsporte() {
        return idEsporte;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
