/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21130871_p2t1.Clases;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author migue
 */
public class Escuela {
    private int numeroDeEscuela;
    private String nombreDeLaEscuela;
    private int numeroDeAlumnos;
    private char tipoDeEscuela;

    public Escuela(int numeroDeEscuela, String nombreDeLaEscuela, int numeroDeAlumnos, char tipoDeEscuela) {
        this.numeroDeEscuela = numeroDeEscuela;
        this.nombreDeLaEscuela = nombreDeLaEscuela;
        this.numeroDeAlumnos = numeroDeAlumnos;
        this.tipoDeEscuela = tipoDeEscuela;
    }
    
    public Escuela(){
        this.numeroDeEscuela = 0;
        this.nombreDeLaEscuela = "";
        this.numeroDeAlumnos = 0;
        this.tipoDeEscuela = ' ';
    }

    public int getNumeroDeEscuela() {
        return numeroDeEscuela;
    }

    public void setNumeroDeEscuela(int numeroDeEscuela) {
        this.numeroDeEscuela = numeroDeEscuela;
    }

    public String getNombreDeLaEscuela() {
        return nombreDeLaEscuela;
    }

    public void setNombreDeLaEscuela(String nombreDeLaEscuela) {
        this.nombreDeLaEscuela = nombreDeLaEscuela;
    }

    public int getNumeroDeAlumnos() {
        return numeroDeAlumnos;
    }

    public void setNumeroDeAlumnos(int numeroDeAlumnos) {
        this.numeroDeAlumnos = numeroDeAlumnos;
    }

    public char getTipoDeEscuela() {
        return tipoDeEscuela;
    }

    public void setTipoDeEscuela(char tipoDeEscuela) {
        this.tipoDeEscuela = tipoDeEscuela;
    }
    
    
    public void generarEscuelaAleatoria(JTable tabla){
        
        Random random = new Random();
        
        String[] nombres = {"Primero de Mayo", "Anexo", "Benito Juarez", "Guadalupe Victoria", "Mijares", "America", "Borregos", "Sanford", "Luzac"};
        char[] tiposDeEscuela = {'B', 'V'};
        
        tabla.setValueAt(String.valueOf(random.nextInt(50)+ 1), 0, 0);
        tabla.setValueAt(nombres[random.nextInt(nombres.length)], 0, 1);
        tabla.setValueAt(String.valueOf(random.nextInt(1400)), 0, 2);
        tabla.setValueAt(String.valueOf(tiposDeEscuela[random.nextInt(tiposDeEscuela.length)]), 0, 3);
    } 
    
    @Override
    public String toString(){
        String cadena;
        cadena = "Numero: " + getNumeroDeEscuela() +
                    "  \tNombre: " + getNombreDeLaEscuela() +
                    "  \tTotal de Alumnos: " + getNumeroDeAlumnos() + 
                    "  \tTipo: " + getTipoDeEscuela();
        return cadena;
    }
}
