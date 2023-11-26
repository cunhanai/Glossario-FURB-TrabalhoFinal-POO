/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.furb.glossario.model.data;

import br.furb.glossario.model.Glossario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bielc
 */
public class IO {

    private IO() {
    }

    public static void saveData(Glossario termos) throws IOException {
        File dataBase = new File("ect\\dataBase.dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dataBase))) {
            oos.writeObject(termos);
            oos.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static String readBufferedReader(String path) throws IOException {
        if (path == null || path.isBlank()) {
            throw new IllegalArgumentException("base null/vazia");
        }

        File fileBase = new File(path);

        if (!fileBase.exists()) {
            return null;
        } else if (!fileBase.isFile()) {
            throw new IllegalArgumentException("base nn existe ou nn eh arquivo");
        }
        ArrayList<String> lines = new ArrayList<>();
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileBase, Charset.forName("UTF-8")))) {
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        }
        return String.join("\n", lines);
    }

    public static String readScannerData(String base) throws IOException {
        if (base == null || base.isBlank()) {
            throw new IllegalArgumentException("base null/vazia");
        }

        File fileBase = new File(base);

        if (!fileBase.exists()) {
            return null;
        } else if (!fileBase.isFile()) {
            throw new IllegalArgumentException("base nn existe ou nn eh arquivo");
        }
        ArrayList<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(fileBase, "UTF-8")) {
            while (scanner.hasNext()) {
                lines.add(scanner.nextLine());
            }
        }
        return String.join("\n", lines);
    }
}
