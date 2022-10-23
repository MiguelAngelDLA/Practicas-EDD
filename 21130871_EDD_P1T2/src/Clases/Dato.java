/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JTable;

/**
 *
 * @author migue
 */
public class Dato {
    private int numero;
    private String nombre;
    private double prioridad;

    public Dato(int numero, String nombre, double prioridad) {
        this.numero = numero;
        this.nombre = nombre;
        this.prioridad = prioridad;
    }
    
    public Dato(){
        this.numero = 0;
        this.nombre = "";
        this.prioridad = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getprioridad() {
        return prioridad;
    }

    public void setprioridad(double prioridad) {
        this.prioridad = prioridad;
    }
    
    public void generarDatosAleatorios(JTable tabla){
        Random random = new Random();
        String[] nombre = {"Mouse", "Laptop", "Teclado", "Monitor", "CPU", "DD"
                , "RAM", "Caché"};
        
        tabla.setValueAt(random.nextInt(), 0, 0);
        tabla.setValueAt(nombre[random.nextInt(nombre.length)], 0, 1);
        DecimalFormat df = new DecimalFormat("#.#");
        tabla.setValueAt(df.format(random.nextInt(10000)), 0, 2);
        
    }
    
    public void mostrarDato(JTable tabla, int renglon){
        tabla.setValueAt(this.numero, renglon, 0);
        tabla.setValueAt(this.nombre, renglon, 1);
        tabla.setValueAt(this.prioridad, renglon, 2);
    }
    
}
