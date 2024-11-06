/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 2022122760265
 */
public class EsporteColetivo extends Esporte {
    private List<Time> times;
    private List<TorneioColetivo> torneios;

    public EsporteColetivo(<any> times, <any> torneios) {
        this.times = times;
        this.torneios = torneios;
    }

    public <any> getTimes() {
        return times;
    }

    public <any> getTorneios() {
        return torneios;
    }

    public void setTimes(<any> times) {
        this.times = times;
    }

    public void setTorneios(<any> torneios) {
        this.torneios = torneios;
    }
    
    
}
