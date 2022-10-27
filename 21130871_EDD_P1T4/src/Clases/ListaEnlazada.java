/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author migue
 */
public class ListaEnlazada<T> {
    private Nodo primero;
    private Nodo ultimo;
    
    public ListaEnlazada(){
        this.primero = null;
        this.ultimo = null;
    }
    
    public boolean listaVacia(){
        if(this.primero == null)
            return true;
        else
            return false;
    }
    
    public void insertarAlInicio(T dato){
        if(listaVacia()){
            Nodo nuevo = new Nodo(dato);
            this.primero = nuevo;
            this.ultimo = nuevo;
        }else{
            Nodo nuevo = new Nodo(dato, this.primero);
            primero = nuevo;
        }
    }
    
    public void insAlFinal(T dato){
        if(listaVacia()){
            Nodo nuevo = new Nodo(dato);
            this.primero = nuevo;
            this.ultimo = nuevo;
        }else{
            Nodo nuevo = new Nodo(dato);
            ultimo.setSig(nuevo);
            ultimo = nuevo;
        }
    }
    
    public T elimAlInicio(){
        T retorno = null;
        if(!this.listaVacia())
            if(primero==ultimo){
                retorno = (T)primero.getDato();
                primero = null;
                ultimo = null;
            }else{
                retorno = (T)primero.getDato();
                primero = primero.getSig();
            }
        else
            JOptionPane.showMessageDialog(null, "La lista está vacia");
        
        return (T)retorno;
    }
    
    public T elimAlFin(){
        Object retorno = null;
        if(!this.listaVacia())
            if(primero==ultimo){
                retorno = primero.getDato();
                primero = null;
                ultimo = null;
            }else{
                Nodo aux = primero;
                retorno = ultimo.getDato();
                while(aux.getSig() != ultimo){
                    aux = aux.getSig();
                }
                ultimo = aux;
                aux.setSig(null);
            }
        else
            JOptionPane.showMessageDialog(null, "La lista está vacia");
        
        return (T)retorno;
    }
    
    public int contNodos(){
        int cont = 0;
        Nodo aux;
        
        if(!listaVacia()){
            aux = this.primero;
            
            while(aux != null){
                cont++;
                aux = aux.getSig();
            }
        }
        return cont;
    }
    
    
    public void invertirConPila(){
        if(this.contNodos() >= 2){
            Stack<T> pila = new Stack<>();
            
            while(!this.listaVacia()){
                pila.push(this.elimAlInicio());
            }
            
            while(!pila.isEmpty()){
                this.insAlFinal(pila.pop());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Error en Invertir cola");
        }
    }
    
    public void invertirConLista(){
        if(this.contNodos() >= 2){
            ListaEnlazada<T> aux = new ListaEnlazada();
            
            while(!this.listaVacia()){
                aux.insertarAlInicio(this.elimAlFin());
            }
            
            while(!aux.listaVacia()){
                this.insertarAlInicio(aux.elimAlInicio());
            }
        }
    }
    
    public void intercambiarElemento(int pos1, int pos2){
        T elem1 = null;
        T elem2 = null;
        
        Queue<T> aux = new LinkedList();
        
        int contador = 1;
        while(!this.listaVacia()){
            if(contador != pos1 && contador != pos2)
                aux.add(this.elimAlInicio());
            if(contador == pos1){
                elem1 = this.elimAlInicio();
            }
            if(contador == pos2){
                elem2 = this.elimAlInicio();
            }
            
            contador++;
        }
        contador = 1;
        while(!aux.isEmpty()){
            if(contador != pos1 && contador != pos2)
                this.insAlFinal(aux.remove());
            if(contador == pos1)
                this.insAlFinal(elem2);
            else if(contador == pos2)
                this.insAlFinal(elem1);
            contador++;
        }
    }
}
