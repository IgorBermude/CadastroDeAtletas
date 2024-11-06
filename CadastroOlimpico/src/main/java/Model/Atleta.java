/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 2022122760265
 */
public class Atleta {
    private String nome;
    private String cpf;
    private String celular;
    private String email;
    private String sexo;
    private String nacionalidae;
    private String sobre;
    private int ouro;
    private int prata;
    private int bronze;
    private byte[] foto;
    
    private List<Esporte> esportes;
    private List<Time> times;
    private List<TorneioIndividual> torneios;

    public Atleta(String nome, String cpf, String celular, String email, String sexo, String nacionalidae, String sobre, int ouro, int prata, int bronze, byte[] foto) {
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

    public <any> getEsportes() {
        return esportes;
    }

    public <any> getTimes() {
        return times;
    }

    public <any> getTorneios() {
        return torneios;
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

    public void setEsportes(<any> esportes) {
        this.esportes = esportes;
    }

    public void setTimes(<any> times) {
        this.times = times;
    }

    public void setTorneios(<any> torneios) {
        this.torneios = torneios;
    }
    
    
}
