/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.furb.glossario.model;

import java.util.ArrayList;
import java.io.Serializable;

/**
 *
 * @author anaj2
 */
public class Termo implements Serializable {

    private String nome;
    private String descricao;
    private ArrayList<Obra> obras = new ArrayList<>();

    /**
     * Cria um novo termo na data base
     *
     * @param nome (String) Nome do termo
     * @param descricao (String) Descricao do termo
     * @param obras (ArrayList<Obra>) Lista de obras onde esse termo aparece
     */
    protected Termo(String nome, String descricao, ArrayList<Obra> obras) throws IllegalArgumentException {
        setNome(nome);
        setDescricao(descricao);
        this.obras = obras;
    }

    /**
     * Adiciona um nome para o termo
     *
     * @param nome (String) Entrada para o nome do termo
     */
    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Entrada para nome "
                    + "invalida.");
        }
        this.nome = nome;
    }

    /**
     * Adiciona uma descricao para o temo
     *
     * @param descricao (String) Entrada para descricao do termo
     */
    public void setDescricao(String descricao) throws IllegalArgumentException {
        if (descricao.isBlank()) {
            throw new IllegalArgumentException("Entrada para descricao "
                    + "invalida.");
        }
        this.descricao = descricao;
    }

    /**
     * Adiciona as obras em que esse termo aparece
     *
     * @param obra (ArrayList<Obra>)
     */
    public void addObras(Obra obra) {
        obras.add(obra);
    }

    /**
     * Retorna o nome do termo
     *
     * @return (String)
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retonrna a descricao do termo
     *
     * @return (String)
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Retorna uma lista das obras em que esse termo aparece
     *
     * @return (ArrayList<Obra>)
     */
    public ArrayList<Obra> getObras() {
        return obras;
    }

    /**
     * retorna o tipo de termo desse termo
     *
     * @return (String)
     */
    public String getTipoTermoString() {
        if (this instanceof Personagem) {
            return "Personagem";
        } else if (this instanceof Local) {
            return "Local";
        }
        return "Termo";
    }
}
