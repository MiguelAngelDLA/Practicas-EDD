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
    
}
