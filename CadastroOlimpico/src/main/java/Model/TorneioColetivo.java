/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 2022122760265
 */
public class TorneioColetivo extends Torneio{
    private EsporteColetivo esporte;
    private Date data;
    private String local;
    
    private List<Time> times;
    
    private Map<Time, Integer> Resultado;
}
