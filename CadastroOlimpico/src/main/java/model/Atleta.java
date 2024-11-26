/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author 2022122760265
 */

@Entity
public class Atleta implements Serializable {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idAtleta;
    
    @Column (name = "nomeAtleta", nullable = false )
    private String nome;
    
    @Column (name = "cpfAtleta", nullable = false )
    private String cpf;
    
    @Column (name = "celularAtleta", nullable = false )
    private String celular;
    
    @Column (name = "emailAtleta", nullable = false )
    private String email;
    
    @Column (name = "sexoAtleta", nullable = false )
    private String sexo;
    
    @Column (name = "nacionalidadeAtleta", nullable = false )
    private String nacionalidae;
    
    @Column (name = "sobreAtleta", nullable = false )
    private String sobre;
    
    @Column (name = "nascimentoAtleta", nullable = false )
    private Date nascimento;
    
    private int ouro;
    private int prata;
    private int bronze;
    
    @Lob
    private byte[] foto;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "atleta_esporte",
        joinColumns = @JoinColumn(name = "atleta_id"),
        inverseJoinColumns = @JoinColumn(name = "esporte_id")
    )
    private List<Esporte> esportes;
    
    @ManyToMany
    @JoinTable(
        name = "atleta_time",
        joinColumns = @JoinColumn(name = "atleta_id"),
        inverseJoinColumns = @JoinColumn(name = "time_id")
    )
    private List<Time> times;
    
    @ManyToMany(mappedBy = "atletas")
    private List<TorneioIndividual> torneiosIndividuais;
    
    @ManyToOne
    @JoinColumn(name = "time_id")
    private Time time;

    public Atleta() {
    }

    
    
    public Atleta(String nome, String cpf, String celular, String email, String sexo, String nacionalidae, String sobre, int ouro, int prata, int bronze, byte[] foto, Date nascimento, List<Esporte> esportes) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.email = email;
        this.sexo = sexo;
        this.nacionalidae = nacionalidae;
        this.sobre = sobre;
        this.ouro = ouro;
        this.prata = prata;
        this.bronze = bronze;
        this.foto = foto;
        this.nascimento = nascimento;
        this.esportes = esportes;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNacionalidae() {
        return nacionalidae;
    }

    public String getSobre() {
        return sobre;
    }

    public int getOuro() {
        return ouro;
    }

    public int getPrata() {
        return prata;
    }

    public int getBronze() {
        return bronze;
    }

    public byte[] getFoto() {
        return foto;
    }

    public List<Esporte> getEsportes() {
        return esportes;
    }

    public List<Time> getTimes() {
        return times;
    }

    public List<TorneioIndividual> getTorneios() {
        return torneiosIndividuais;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNacionalidae(String nacionalidae) {
        this.nacionalidae = nacionalidae;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public void setPrata(int prata) {
        this.prata = prata;
    }

    public void setBronze(int bronze) {
        this.bronze = bronze;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public void setEsportes(List<Esporte> esportes) {
        this.esportes = esportes;
    }

    public void setTimes(List<Time> times) {
        this.times = times;
    }

    public void setTorneios(List<TorneioIndividual> torneiosIndividuais) {
        this.torneiosIndividuais = torneiosIndividuais;
    }

    public int getIdAtleta() {
        return idAtleta;
    }
}
