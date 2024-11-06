/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 2022122760265
 */
public class TorneioIndividual extends Torneio{
    private EsporteIndividual esporte;    
    private Date data;
    private String local;
    
    private List<Atleta> atletas;
    
    private Map<Atleta, Integer> Resultado;
}
