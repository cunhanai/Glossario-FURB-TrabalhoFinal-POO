/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.furb.glossario.model;

/**
 *
 * @author anaj2
 */
public class Obra {
    
    private String titulo;
    private int anoLancamento;
    private EnumCategoria categotia;
    
    protected Obra(String titulo, int anoLancamento, EnumCategoria categoria) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.categotia = categoria;
    }
}
