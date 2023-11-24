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
    
    protected Termo(String nome, String descricao, ArrayList<Obra> obras) {
        this.nome = nome;
        this.descricao = descricao;
        this.obras = obras;
    }

//------------------------------------------------------------------------------
    public void setNome(String nome) {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Entrada para nome "
                    + "invalida.");
        }
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.isBlank()) {
            throw new IllegalArgumentException("Entrada para descricao "
                    + "invalida.");
        }
        this.descricao = descricao;
    }
    
    public void addObras(Obra obra) {
        obras.add(obra);
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public ArrayList<Obra> getObras() {
        return obras;
    }
}
