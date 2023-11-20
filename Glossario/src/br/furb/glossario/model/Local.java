/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.furb.glossario.model;

/**
 *
 * @author anaj2
 */
public class Local extends Termo {

    private String historia;

    protected Local(String nome, String descricao, String historia) {
        super(nome, descricao);
        this.historia = historia;
    }

//------------------------------------------------------------------------------
    public void setHistoria(String historia) {
        if (historia.isBlank() || historia == null) {
            throw new IllegalArgumentException("Entrada para historia "
                    + "invalida.");
        }
        this.historia = historia;
    }

    public String getHistoria() {
        return historia;
    }
}
