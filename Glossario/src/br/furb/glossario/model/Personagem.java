/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.furb.glossario.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author anaj2
 */
public class Personagem extends Termo implements Serializable {
    
    private String caracteristica;
    private String feitos;
    private ArrayList<String> atores = new ArrayList<>();
    
    protected Personagem(String nome, String descricao, ArrayList<Obra> obras, String caracteristica, String feitos, ArrayList<String> atores) {
        super(nome, descricao, obras);
        this.caracteristica = caracteristica;
        this.feitos = feitos;
        this.atores = atores;
    }
//------------------------------------------------------------------------------
    public void addCaracteristica(String entrada) {
        if (entrada.isBlank()){
            throw new IllegalArgumentException("Entrada invalida.");
        }
        caracteristica = entrada;
    }
    
    public void addAtores(String entrada) {
        if (entrada.isBlank()){
            throw new IllegalArgumentException("Entrada invalida.");
        }
        atores.add(entrada);
    }
    
    public void addFeitos(String entrada) {
        if (entrada.isBlank()){
            throw new IllegalArgumentException("Entrada invalida.");
        }
        feitos = entrada;
    }
    
    public String getCaracteristica() {
        return caracteristica;
    }
    
    public ArrayList<String> getAtores (){
        return atores;
    }
    
    public String getFeitos (){
        return feitos;
    }
}
