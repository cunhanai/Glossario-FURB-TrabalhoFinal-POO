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
public class Glossario {
    
    private ArrayList<Termo> termos = new ArrayList<>();
    
    public Glossario() {
        
    }
    
    public void incluirTermo(String nome, String descricao, ArrayList<Obra> obras) {
        Termo termo = new Termo(nome, descricao); 
        termos.add(termo);
    }
}
