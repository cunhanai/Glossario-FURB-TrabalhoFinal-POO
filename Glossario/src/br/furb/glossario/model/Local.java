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

    protected Local(String nome, String descricao, ArrayList<Obra> obras, String historia) throws IllegalArgumentException {
        super(nome, descricao, obras);
        setHistoria(historia);
    }

//------------------------------------------------------------------------------
    public void setHistoria(String historia) throws IllegalArgumentException {
        if (historia.isBlank()) {
            throw new IllegalArgumentException("Entrada para historia "
                    + "invalida.");
        }
        this.historia = historia;
    }

    public String getHistoria() {
        return historia;
    }
}
