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

    /**
     * Inclui termos basicos na data base
     * @param nome (String) Nome do termo
     * @param descricao (String) Descricao do termo
     * @param obras (ArrayList<Obra>) Lista de obras onde esse termo aparece
     */
    public void incluirTermo(String nome, String descricao, ArrayList<Obra> obras) {
        Termo termo = new Termo(nome, descricao, obras);
        termos.add(termo);
    }

    /**
     * Inclui termos de personagens na data base
     * @param nome (String) Nome da personagem
     * @param descricao (String) Descricao da personagem
     * @param obras (ArrayList<Obra>) Lista das obras onde a personagem aparece
     * @param caracteristica (String) Caracteristicas da personagem
     * @param feitos (String) Feitos da personagem
     * @param atores (ArrayList<String>) Atores(as) que interpretaram essa personagem
     */
    public void incluirTermo(String nome, String descricao, ArrayList<Obra> obras, String caracteristica, String feitos, ArrayList<String> atores) {
        Personagem personagem = new Personagem(nome, descricao, obras, caracteristica, feitos, atores);
        termos.add(personagem);
    }

    /**
     * Inclui termos de locais na data base
     * @param nome (String) Nome do local
     * @param descricao (String) Descricao do local
     * @param obras (ArrayList<Obra>) Lista das obras que retratam/se passam nesse local
     * @param historia (String) A historia desse local
     */
    public void incluirTermo(String nome, String descricao, ArrayList<Obra> obras, String historia) {
        Local local = new Local(nome, descricao, obras, historia);
        termos.add(local);
    }
    
    /**
     * Retorna os termos da data base
     * @return (Termo)
     */
    public ArrayList<Termo> getTermos() {
        return termos; 
    }
    
    /**
     * Adiciona termos a data base
     * @param termos (Termo) Termos a serem adicionados
     */
    public void addTermos(ArrayList<Termo> termos) {
        termos.addAll(termos);
    } 
}