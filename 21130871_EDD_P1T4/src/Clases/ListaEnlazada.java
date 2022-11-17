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
    
    public Nodo getNodo(int posicion){
        Nodo aux = primero;
        if(this.contNodos() == 1)
            aux = this.primero;
        else{
            for(int i = 0; i < posicion; i++){
                aux = aux.getSig();
            }
        
        }
        return aux;
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
    
    public void paresPorImpares(){
        
        if(this.contNodos() % 2 == 0){
           this.insertarAlInicio(this.elimAlFin());
        }
        else{
            T elementoFinal = null;
            
            elementoFinal = this.elimAlFin();
            this.insertarAlInicio(this.elimAlFin());
            this.insAlFinal(elementoFinal);
        }
    }
    
    public void paresPorImparesRecargado(){
        Queue<T> lista = new LinkedList();
        
        T oPar = null;
        T oImpar = null;
        T fin = null;
        
        if(this.contNodos() % 2 != 0)
           fin = this.elimAlFin();
           
        if(this.contNodos() % 2 == 0){
           
           while(!this.listaVacia()){
               oImpar = this.elimAlInicio();
               oPar = this.elimAlInicio();
               lista.add(oPar);
               lista.add(oImpar);
           }
               
        }
          while(!lista.isEmpty())
               this.insAlFinal(lista.remove());
          if(fin != null)
            this.insAlFinal(fin);
    }
    
    public T getElemento(int posicion){
        Nodo aux = primero;
        if(this.contNodos() == 1)
            aux = this.primero;
        else{
            for(int i = 0; i < posicion; i++){
                aux = aux.getSig();
            }
        
        }
        return (T)aux.getDato();
    }
    
    public void añadirEnPosicion(int posicion, T elemento){
        Nodo aux = primero;
        Nodo añadir = new Nodo(elemento);
        Nodo aux2; 
        int tamaño = this.contNodos() + 1;
        if(posicion == 0)
            this.insertarAlInicio(elemento);
        
        else if(posicion == this.contNodos()){
            this.insAlFinal(elemento);
        }
        else{
            for(int i = 0; i < posicion - 1; i++){
                aux = aux.getSig();
            }
            aux2 = aux.getSig();
            aux.setSig(añadir);
            añadir.setSig(aux2);
            for(int i = posicion; i < tamaño; i++){
                if(aux.getSig() != null)
                    aux = aux.getSig();
            }
        }
    }
    
    public void eliminarPosicion(int posicion){
        Nodo aux = primero;
        if(posicion == 0)
            this.elimAlInicio();
        
        else if(posicion == this.contNodos()){
            this.elimAlFin();
        }
        else{
            for(int i = 0; i < posicion - 1; i++){
                aux = aux.getSig();
            }
            aux.setSig(aux.getSig().getSig());
        }
    }
    
    public void intercambiarElemento(int pos1, int pos2){
        T elem1 = null;
        T elem2 = null;
        
        Queue<T> aux = new LinkedList();
        int tamaño = this.contNodos();
        int contador = 0;
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
        contador = 0;
        while(!aux.isEmpty()){
            if(contador != pos1 && contador != pos2)
                this.insAlFinal(aux.remove());
            if(contador == pos1)
                this.insAlFinal(elem2);
            else if(contador == pos2)
                this.insAlFinal(elem1);
            
            contador++;
        }
        
        if(pos2 == tamaño - 1)
                this.insAlFinal(elem1);
    }
    
    public void intercambiarElementoSinEliminar(int pos1, int pos2){
        if(pos1 >= 0 && pos2 < this.contNodos()){            
            T elem1, elem2;
            
            elem1 = (T)this.getNodo(pos1).getDato();
            elem2 = (T)this.getNodo(pos2).getDato();
            
            this.getNodo(pos1).setDato(elem2);
            this.getNodo(pos2).setDato(elem1);
        }
    }
    
}
