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

    public void incluirTermo(String nome, String descricao, ArrayList<Obra> obras, String caracteristica, String feitos, ArrayList<String> atores) {
        Personagem personagem = new Personagem(nome, descricao, caracteristica, feitos, atores);
        termos.add(personagem);
    }

    public void incluirTermo(String nome, String descricao, ArrayList<Obra> obras, String historia) {
        Local local = new Local(nome, descricao, historia);
        termos.add(local);
    }

    /*public void incluirObra(String titulo, int anoLancamento, EnumCategoria categoria) {
        Obra obra = new Obra(titulo, anoLancamento, categoria);
        .add(obra);
    }*/
}