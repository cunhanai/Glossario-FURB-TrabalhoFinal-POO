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
public class Glossario implements Serializable {

    private ArrayList<Termo> termos = new ArrayList<>();

    public Glossario() {
    }

    public void incluirTermo(String nome, String descricao, ArrayList<Obra> obras) {
        Termo termo = new Termo(nome, descricao, obras);
        termos.add(termo);
    }

    public void incluirTermo(String nome, String descricao, ArrayList<Obra> obras, String caracteristica, String feitos, ArrayList<String> atores) {
        Personagem personagem = new Personagem(nome, descricao, obras, caracteristica, feitos, atores);
        termos.add(personagem);
    }

    public void incluirTermo(String nome, String descricao, ArrayList<Obra> obras, String historia) {
        Local local = new Local(nome, descricao, obras, historia);
        termos.add(local);
    }
    
    public ArrayList<Termo> getTermos() {
        return termos; 
    }
    
    public void addTermos(ArrayList<Termo> termos) {
        termos.addAll(termos);
    } 
}