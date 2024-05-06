
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Mavenproject1 {

    public static void main(String[] args) throws IOException {
        File file = new File("./archivo.txt");
        
        if(!file.exists()){
        
        
        file.createNewFile();
            System.out.println("Archivo creado");
    }else{
            System.out.println("El archivo ya existe");
        }
        FileReader reader = new FileReader(file, Charset.forName("UTF8"));
        System.out.println(reader.getEncoding());
        
        //Acceder caracter a caracter
        
        char[] data = new char[50];
        
        System.out.println(data);
        
        System.out.println(data[3]);
        //reader.close();
        
        //Acceder linea a linea
        BufferedReader buffer = new BufferedReader(reader);
        
        String line;
        while((line=buffer.readLine()) != null){
            System.out.println("Line: " + line);
        }
        reader.close();
    }
}
