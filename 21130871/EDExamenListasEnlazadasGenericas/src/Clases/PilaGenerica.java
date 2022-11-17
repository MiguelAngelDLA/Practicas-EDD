/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author krodr
 */
public class PilaGenerica <T> {
    //Atributos
    private int tope;
    private T arreglo[];
    
    //Constructores
    public PilaGenerica(){
        this.tope=0;
        this.arreglo=null;
    }
    
    public PilaGenerica(int dimension){
        this.tope=0;
        arreglo = (T[]) new Object[dimension];
    }
    
    //Metodos get
    public int getTope() {
        return tope;
    }
    
    //Métodos 
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
            JOptionPane.showMessageDialog(null,"La pila esta llena.");
    }    
    
    public T pop(){
        T objG = null;
        if(!pilaVacia())
            objG=arreglo[--tope];
        else
            JOptionPane.showMessageDialog(null,"La pila esta vacía.");
        
        return objG;
    }
}