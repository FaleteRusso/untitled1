package com.corenetworks.presentacion;

import java.io.*;
import java.util.Arrays;

public class Ej1Read { public static void main(String[] args) {
    //definir variables
  /*  char []buffer = new char[150];
    int caracterLeido;
    try {
        FileReader fEntrada = new FileReader("salidaEj.txt");
        caracterLeido= fEntrada.read(buffer);
        System.out.println("Caractere leidos ->"+ caracterLeido);
        System.out.println(Arrays.toString(buffer));
        while(caracterLeido!=-1){
            System.out.println("Entra el bucle");
            caracterLeido=fEntrada.read(buffer);
            System.out.println(Arrays.toString(buffer));
        }
        fEntrada.close();
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

   */
    try {
        //Declaración fichero y buffer de entrada
        FileReader fEntrada = new FileReader("salida.txt");
        BufferedReader bEntrada = new BufferedReader(fEntrada);
        //Declaración fichero y buffer de salida
        FileWriter fSalida = new FileWriter("salida1.txt");
        BufferedWriter bSalida = new BufferedWriter(fSalida);
        String linea=null;
        while(true){
            linea = bEntrada.readLine();
            System.out.println("Se ha leido -> " + linea);
            if (linea==null){
                break;
            }
            bSalida.write(linea+"\n");
        }
        bSalida.flush();
        bSalida.close();
        fSalida.close();
    } catch (FileNotFoundException e) {
        System.out.println(e.toString());
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

}

}

