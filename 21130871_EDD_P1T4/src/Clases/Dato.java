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
   //Atributos
    private int numero;
    private String nombre;
    private double costo;
    
    public Dato (){
        this.numero=0;
        this.nombre="";
        this.costo=0.0;
    }
    
    public Dato(int numero, String nombre, double costo){
        this.numero=numero;
        this.nombre=nombre;
        this.costo=costo;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero=numero;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public double getCosto(){
        return costo;
    }
    
    public void setCosto(double costo){
        this.costo=costo;
    }
    
    public void aleatorio(JTable tabla){
        
                
        Random rnd=new Random();
        String []nombre={"Mouse","LapTop","Teclado","Monitor","CPU","Ram"};
        
        tabla.setValueAt(rnd.nextInt(100)+1, 0, 0);
        tabla.setValueAt(nombre[rnd.nextInt(nombre.length)], 0, 1);
        DecimalFormat df=new DecimalFormat("#.#");
        tabla.setValueAt(df.format(rnd.nextInt(10000)+rnd.nextDouble()), 0, 2);
    }
    
    public void mostrarDato(JTable tabla, int col){
        tabla.setValueAt(numero,0,  col);
        tabla.setValueAt(nombre,1, col);
        tabla.setValueAt(costo,2, col);
    }
       
}
