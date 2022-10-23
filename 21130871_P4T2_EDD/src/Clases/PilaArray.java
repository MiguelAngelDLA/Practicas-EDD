/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author migue
 */
public class PilaArray <T> {
    //atributos 
    private int tope;
    private ArrayList<T> arreglo;
    
    //Constructores 
    public PilaArray(){
        this.tope=0;
        this.arreglo=null;
    }
    
    public PilaArray(int dimension){
        this.tope=0;
        arreglo=new ArrayList();
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
        if(tope==arreglo.size())
            return true;
        else 
            return false;
    }
    
    public void push(T objG){
        if(!pilaLlena()){
            arreglo.add(objG);
            tope++;
        }
    
    }
    
    public int getTamañoArreglo(){
        return arreglo.size();
    }
    
    public void agregaElemento(int posicion, T info){
        PilaArray<T> auxPilaGenerica = new PilaArray(tope + 1);
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
        PilaArray<T> auxPilaGenerica = new PilaArray(tope-posicion);
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
        PilaArray<T> auxPilaGenerica = new PilaArray(tope-posicion);
        if( posicion > 0 && posicion <= tope){
            while(!auxPilaGenerica.pilaLlena())
                auxPilaGenerica.push(pop());
            
            pop();
            while(!auxPilaGenerica.pilaVacia())
                push(auxPilaGenerica.pop());
        }
    }
    
    public int buscarPosicion(T elemento){
        PilaArray<T> auxPilaGenerica = new PilaArray(tope);
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
        if(!pilaVacia()){
            objG=arreglo.get(tope);
            arreglo.remove(tope);
            tope--;
        }
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
        PilaArray<T> auxPilaGenerica = new PilaArray(tope + 1);
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
    
    public void popBottomElement(){
        if(tope >= 2){
            invertirStack();
            pop();
            invertirStack();
        }
        else JOptionPane.showMessageDialog(null, "Se necesitan minimo 2 elementos para hacer esta acción");
    }
    
    public void invertirStack(){
        if(!pilaVacia()){
            PilaArray<T> auxStack = new PilaArray(tope);
            PilaArray<T> auxStack1 = new PilaArray(tope);
            
            while(!pilaVacia())
                auxStack.push(pop());
            
            while(!auxStack.pilaVacia())
                auxStack1.push(auxStack.pop());
            
            while(!auxStack1.pilaVacia())
                push(auxStack1.pop());
        }
        else{
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
        }
    }
}
