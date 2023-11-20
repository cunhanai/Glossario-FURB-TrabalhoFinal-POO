/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.furb.glossario.model;

import java.util.ArrayList;

/**
 *
 * @author anaj2
 */
public class Personagem extends Termo {
    
    private ArrayList<String> caracteristica = new ArrayList<>();
    private ArrayList<String> atores = new ArrayList<>();
    private ArrayList<String> feitos = new ArrayList<>();
    
    protected Personagem(String nome, String descricao) {
        super(nome, descricao);
    }
//------------------------------------------------------------------------------
    public void addCaracteristica(String entrada) {
        if (entrada.isBlank()){
            throw new IllegalArgumentException("Entrada invalida.");
        }
        caracteristica.add(entrada);
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
        feitos.add(entrada);
    }
    
    public ArrayList<String> getCaracteristica() {
        return caracteristica;
    }
    
    public ArrayList<String> getAtores (){
        return atores;
    }
    
    public ArrayList<String> getFeitos (){
        return feitos;
    }
}
