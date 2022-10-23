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
    private T[] arreglo;
    
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
    
    public void agregaElemento(int posicion, T info){
        PilaGenerica<T> auxPilaGenerica = new PilaGenerica(tope + 1);
        int counter = tope + 1;
        if(!pilaLlena()){
            while(!auxPilaGenerica.pilaLlena()){
                if(posicion != counter)
                    auxPilaGenerica.push(pop());
                else
                    auxPilaGenerica.push(info);
                counter--;
            }
 
            while(!auxPilaGenerica.pilaVacia())
                push(auxPilaGenerica.pop());
            
        }
        else JOptionPane.showMessageDialog(null, "La pila está llena");
    }
    
    public T obtenerElemento(int posicion){
        PilaGenerica<T> auxPilaGenerica = new PilaGenerica(tope-posicion);
        T elemento = null;
        if( posicion > 0 && posicion <= tope){
            while(!auxPilaGenerica.pilaLlena())
                auxPilaGenerica.push(pop());
            
            elemento = pop();
            while(!auxPilaGenerica.pilaVacia())
                push(auxPilaGenerica.pop());
        }
        return elemento;
    }
    
    public void eliminarElemento(int posicion){
        PilaGenerica<T> auxPilaGenerica = new PilaGenerica(tope-posicion);
        if( posicion > 0 && posicion <= tope){
            while(!auxPilaGenerica.pilaLlena())
                auxPilaGenerica.push(pop());
            
            pop();
            while(!auxPilaGenerica.pilaVacia())
                push(auxPilaGenerica.pop());
        }
    }
    
    public int buscarPosicion(T elemento){
        PilaGenerica<T> auxPilaGenerica = new PilaGenerica(tope);
        int contador = 0;
        while(!auxPilaGenerica.pilaLlena()){
            T actual = pop();
            if(actual == elemento){
                auxPilaGenerica.push(actual);
                return contador;
            }else{
                auxPilaGenerica.push(actual);
                contador = contador + 1;
            }
        }
        
        while(!auxPilaGenerica.pilaVacia())
                push(auxPilaGenerica.pop());
        
        return -1;
    }
    
    public T pop(){
        T objG=null;
        if(!pilaVacia())
            objG=arreglo[--tope];
        else
            JOptionPane.showMessageDialog(null, "La pila esta vacía");
        
        return objG; 
    }
    /*
    public int indiceDe(Object o) {
        if (o == null) {
            for (int i = getTope()-1; i > 0; i--)
                if (arreglo[i]==null)
                    return i;
        } else {
            for (int i = getTope()-1; i > 0; i--)
                if (o.equals(arreglo[i]))
                    return i;
        }
        return -1;
    }
    */
    
    public int indiceDe(T t){
        PilaGenerica<T> auxPilaGenerica = new PilaGenerica(tope + 1);
        int counter = tope + 1;
        T actual = null;
        if(!pilaLlena()){
            while(!auxPilaGenerica.pilaLlena()){
                actual = pop();
                if(actual.equals(t)){
                    auxPilaGenerica.push(actual);
                    counter--;
                    return counter;
                }
                else{
                    auxPilaGenerica.push(actual);
                    counter--;
                }
                
            }
 
            while(!auxPilaGenerica.pilaVacia())
                push(auxPilaGenerica.pop());
            
        }
        return -1;
    }

    
}
