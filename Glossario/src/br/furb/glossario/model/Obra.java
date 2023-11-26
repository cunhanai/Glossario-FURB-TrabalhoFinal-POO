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
    private EnumCategoria categoria;

    public Obra(String titulo, int anoLancamento, EnumCategoria categoria) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.categoria = categoria;
    }

//------------------------------------------------------------------------------
    public void setTitulo(String titulo) {
        if (titulo.isBlank()) {
            throw new IllegalArgumentException("Entrada para titulo "
                    + "invalida.");
        }
        this.titulo = titulo;
    }

    public void setAnoLancamento(int anoLancamento) {
        if (anoLancamento >= 0) {
            throw new IllegalArgumentException("Entrada para ano de "
                    + "lancamento invalida.");
        }
        this.anoLancamento = anoLancamento;
    }

    public void setCategoria(EnumCategoria categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public EnumCategoria getCategoria() {
        return categoria;
    }
    
    protected String getDelimitador() {
        return ";od;";
    }
    
    @Override
    public String toString() {
        return titulo + getDelimitador() + anoLancamento + getDelimitador() + categoria;
    }
}
