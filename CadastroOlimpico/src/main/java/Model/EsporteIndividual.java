/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 2022122760265
 */
public class EsporteIndividual extends Esporte{
    private List<TorneioIndividual> torneios;

    public EsporteIndividual(<any> torneios) {
        this.torneios = torneios;
    }

    public <any> getTorneios() {
        return torneios;
    }

    public void setTorneios(<any> torneios) {
        this.torneios = torneios;
    }
    
    
}
