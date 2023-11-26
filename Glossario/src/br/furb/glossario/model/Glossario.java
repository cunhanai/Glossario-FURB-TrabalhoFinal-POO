/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.furb.glossario.model;

import br.furb.glossario.model.data.IO;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 *
 * @author anaj2
 */
public class Glossario implements Serializable {

    private ArrayList<Termo> termos = new ArrayList<>();
    private final String caminho = Path.of("").toAbsolutePath().toString() + "\\src\\br\\furb\\glossario\\model\\data\\glossario.dat";

    public Glossario() {
    }

    public boolean incluirTermo(String nome, String descricao, ArrayList<Obra> obras) {
        Termo termo = new Termo(nome, descricao, obras);
        termos.add(termo);
        return salvarTermo(termo);
    }

    public boolean incluirTermo(String nome, String descricao, ArrayList<Obra> obras, String caracteristica, String feitos, ArrayList<String> atores) {
        Personagem personagem = new Personagem(nome, descricao, obras, caracteristica, feitos, atores);
        termos.add(personagem);
        return salvarTermo(personagem);
    }

    public boolean incluirTermo(String nome, String descricao, ArrayList<Obra> obras, String historia) {
        Local local = new Local(nome, descricao, obras, historia);
        termos.add(local);
        return salvarTermo(local);
    }
    
    private boolean salvarTermo(Termo termo) {
        try {
            IO.saveData(termo.toString(), caminho);
            return true;
        }
        catch (IOException e) {
            System.out.println("Ocorreu um erro no salvamento do arquivo" + e.getMessage());
            return false;
        }
    }
}