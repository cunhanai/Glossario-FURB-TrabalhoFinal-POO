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
public class Termo {
    
    private String nome;
    private String descricao;
    private ArrayList<Obra> obras = new ArrayList<>();
    
    protected Termo(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
}
