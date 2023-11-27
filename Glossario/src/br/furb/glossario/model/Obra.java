/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.furb.glossario.model;

import java.io.Serializable;

/**
 *
 * @author anaj2
 */
public class Obra implements Serializable {

    private String titulo;
    private int anoLancamento;
    private EnumCategoria categoria;

    /**
     * Cria um novo termo de obra
     * @param titulo (String) Titulo da obra
     * @param anoLancamento (int) Ano em que a obra foi lancada
     * @param categoria (EnumCategoria) Categoria em que a obra se encaixa
     * @throws IllegalArgumentException Lanca uma excessao a ser tratada
     */
    public Obra(String titulo, int anoLancamento, EnumCategoria categoria) throws IllegalArgumentException {
        setTitulo(titulo);
        setAnoLancamento(anoLancamento);
        setCategoria(categoria);
    }

    /**
     * Adiciona o titulo da obra
     * @param titulo (String) entrada para o titulo da obra
     * @throws IllegalArgumentException Lanca uma excessao a ser tratada
     */
    public void setTitulo(String titulo) throws IllegalArgumentException {
        if (titulo.isBlank()) {
            throw new IllegalArgumentException("Entrada para titulo "
                    + "invalida.");
        }
        this.titulo = titulo;
    }

    /**
     * Adiciona o ano em que a obra foi lancada
     * @param anoLancamento (int) Entrada para o ano de lancamento da obra
     * @throws IllegalArgumentException Lanca uma excessao a ser tratada
     */
    public void setAnoLancamento(int anoLancamento) throws IllegalArgumentException {
        if (anoLancamento >= 0) {
            throw new IllegalArgumentException("Entrada para ano de "
                    + "lancamento invalida.");
        }
        this.anoLancamento = anoLancamento;
    }

    /**
     * Adiciona a categoria que a obra pertence
     * @param categoria Entrada para a categoria da obra
     */
    public void setCategoria(EnumCategoria categoria) {
        this.categoria = categoria;
    }

    /**
     * Retorna o titulo da obra
     * @return (String)
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Retorna o ano de lancamento da obra
     * @return (int)
     */
    public int getAnoLancamento() {
        return anoLancamento;
    }

    /**
     * Retorna a categoria da obra
     * @return (EnumCategoria)
     */
    public EnumCategoria getCategoria() {
        return categoria;
    }
    
    @Override
    public String toString() {
        return titulo + " - " + anoLancamento + " - " + categoria.toString().toLowerCase();
    }
}
