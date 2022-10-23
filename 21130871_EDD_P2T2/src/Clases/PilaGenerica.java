/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author migue
 */
public class PilaGenerica <T> {
    //atributos 
    private int tope;
    private T [] arreglo;
    
    //Constructores 
    public PilaGenerica(){
        this.tope=0;
        this.arreglo=null;
    }
    
    public PilaGenerica(int dimension){
        this.tope=0;
        arreglo=(T[]) new Object[dimension];
    }
    
    //Metodos get

    public int getTope() {
        return tope;
    }

    
    public boolean pilaVacia(){
        if(tope==0)
            return true;
        else
            return false;      
    }
    
    public boolean pilaLlena(){
        if(tope==arreglo.length)
            return true;
        else 
            return false;
    }
    
    public void push(T objG){
        if(!pilaLlena())
            arreglo[tope++]=objG;
        else
            JOptionPane.showMessageDialog(null, "La pila esta llena");
    }
    
    public int getTamañoArreglo(){
        return arreglo.length;
    }
    
    public T pop(){
        T objG=null;
        if(!pilaVacia())
            objG=arreglo[--tope];
        else
            JOptionPane.showMessageDialog(null, "La pila esta vacía");
        
        return objG; 
    }
        
    
    
}
