/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.furb.glossario.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author bielc
 */
public class Manipulador {

    public void copiarDados(String base, String envio) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        if (base == null || base.isBlank()
                || envio == null || envio.isBlank()) {
            throw new IllegalArgumentException("base ou envio invalidos");
        }

        File baseDados = new File(base);

        if (!baseDados.exists()
                || !baseDados.isFile()) {
            throw new IllegalArgumentException("base de dados invalida ou nn existe");
        }

        Path pathEnvio = Paths.get(envio);

        if (!Files.exists(pathEnvio)) {
            if (!Files.exists(pathEnvio.getParent())) {
                Files.createDirectories(pathEnvio.getParent());
            }
            Files.createFile(pathEnvio);
        }

        File fileEnvio = pathEnvio.toFile();

        // Faz a copia do conteudo
        try (PrintWriter impressora = new PrintWriter(fileEnvio, "UTF-8"); Scanner scanner = new Scanner(baseDados, "UTF-8")) {
            while (scanner.hasNext()) {
                impressora.println(scanner.nextLine());

            }

        }
    }

}
