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
    
    /**
     * Cria um novo termo de personagem na data base
     * @param nome (String) Nome da personagem
     * @param descricao (String) Descricao da personagem
     * @param obras (ArrayList<Obra>) Lista das obras onde a personagem aparece
     * @param caracteristica (String) Caracteristicas da personagem
     * @param feitos (String) Feitos da personagem
     * @param atores (ArrayList<String>) Atores(as) que interpretaram essa personagem
     */
    protected Personagem(String nome, String descricao, ArrayList<Obra> obras, String caracteristica, String feitos, ArrayList<String> atores) {
        super(nome, descricao, obras);
        this.caracteristica = caracteristica;
        this.feitos = feitos;
        this.atores = atores;
    }

    /**
     * Adiciona as caracteristicas a personagem
     * @param entrada (String) Entrada para caracteristicas da personagem
     */
    public void addCaracteristica(String entrada) {
        if (entrada.isBlank()){
            throw new IllegalArgumentException("Entrada invalida.");
        }
        caracteristica = entrada;
    }
        
    /**
     * Adiciona os atores(as) que interpretaram essa personagem
     * @param entrada (String) Entrada para os(as) atores(as) que interpretaram essa personagem
     */
    public void addAtores(String entrada) {
        if (entrada.isBlank()){
            throw new IllegalArgumentException("Entrada invalida.");
        }
        atores.add(entrada);
    }
    
    /**
     * Adiciona os feitos dessa personagem
     * @param entrada (String) Entrada para os feitos dessa personagem
     */
    public void addFeitos(String entrada) {
        if (entrada.isBlank()){
            throw new IllegalArgumentException("Entrada invalida.");
        }
        feitos = entrada;
    }
    
    /**
     * Retorna as caracteristicas da personagem
     * @return (String)
     */
    public String getCaracteristica() {
        return caracteristica;
    }
    
    /**
     * Retorna uma lista dos atores(as) que interpretaram essa personagem
     * @return (ArrayList<String>)
     */
    public ArrayList<String> getAtores (){
        return atores;
    }
    
    /**
     * Retorna os feitos dessa personagem
     * @return (String)
     */
    public String getFeitos (){
        return feitos;
    }
}
