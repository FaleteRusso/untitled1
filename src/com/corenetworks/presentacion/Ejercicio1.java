package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //declarar variables
       Scanner sc =new Scanner(System.in);
        System.out.println("escriba una frase:");
        String frase = sc.nextLine();
        String nombreFichero = "salidaEj.txt";

        try {
            FileWriter fSalida = new FileWriter(nombreFichero);
            fSalida.write(frase);
            fSalida.flush();
            fSalida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
