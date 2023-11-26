/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.furb.glossario.model.data;

import br.furb.glossario.model.Glossario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;

/**
 *
 * @author bielc
 */
public class IO {

    private static final String caminho = Path.of("").toAbsolutePath().toString() + "\\src\\br\\furb\\glossario\\model\\data\\glossario.dat";

    private IO() {
    }

    public static void saveData(Glossario termos) throws IOException {
        File dataBase = new File(caminho);

        try {
            FileOutputStream file = new FileOutputStream(dataBase);
            ObjectOutputStream oos = new ObjectOutputStream(file);

            oos.writeObject(termos);
            oos.flush();
            
            oos.close();
            file.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Object readData() throws IOException {
        File dataBase = new File(caminho);
        
        Object object = null;
        
        try {
            FileInputStream file = new FileInputStream(dataBase);
            ObjectInputStream ois = new ObjectInputStream(file);
            
            object = ois.readObject();
            
            ois.close();
            file.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }   
        
        return object;
    }
}
