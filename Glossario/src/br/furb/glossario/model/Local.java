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
public class Local extends Termo implements Serializable {

    private String historia;

    /**
     * Cria um novo termo de local na data base
     * @param nome (String) Nome do local
     * @param descricao (String) Descricao do local
     * @param obras (ArrayList<Obra>) Lista das obras que retratam/se passam nesse local
     * @param historia (String) A historia desse local
     * @throws IllegalArgumentException Lanca uma excessao a ser tratada
     */
    protected Local(String nome, String descricao, ArrayList<Obra> obras, String historia) throws IllegalArgumentException {
        super(nome, descricao, obras);
        setHistoria(historia);
    }

    /**
     * Adiciona a historia do local
     * @param historia (String) Entrada para a historia do local
     * @throws IllegalArgumentException Lanca uma excessao a ser tratada
     */
    public void setHistoria(String historia) throws IllegalArgumentException {
        if (historia.isBlank()) {
            throw new IllegalArgumentException("Entrada para historia "
                    + "invalida.");
        }
        this.historia = historia;
    }

    /**
     * Retorna a historia do local
     * @return (String)
     */
    public String getHistoria() {
        return historia;
    }
}
