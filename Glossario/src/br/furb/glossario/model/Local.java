/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.furb.glossario.model;

import br.furb.glossario.model.utils.StringUtils;
import java.util.ArrayList;

/**
 *
 * @author anaj2
 */
public class Local extends Termo {

    private String historia;

    protected Local(String nome, String descricao, ArrayList<Obra> obras, String historia) {
        super(nome, descricao, obras);
        this.historia = historia;
    }

//------------------------------------------------------------------------------
    public void setHistoria(String historia) {
        if (historia.isBlank()) {
            throw new IllegalArgumentException("Entrada para historia "
                    + "invalida.");
        }
        this.historia = historia;
    }

    public String getHistoria() {
        return historia;
    }
    
    @Override
    public String toString() {
        return String.join(StringUtils.DELIMITER_ELEMENT, super.toString(), historia);
    }
}
