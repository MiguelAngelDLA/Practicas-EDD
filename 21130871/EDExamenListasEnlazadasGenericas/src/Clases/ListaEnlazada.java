/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author krodr
 * @param <T>
 */
public class ListaEnlazada <T> {
    //Atributos
    private Nodo primero;
    private Nodo ultimo;
    
    //Constructor
    public ListaEnlazada(){
        this.primero=null;
        this.ultimo=null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }
    
    //Métodos
    public boolean listaVacia(){
        if(primero==null)
            return true;
        else
            return false;
    }
    
    
    //Insertar al inicio
    
    public void insAlIni(T dato){
        
        if(listaVacia()){
           Nodo nuevo = new Nodo(dato); 
           primero=nuevo;
           ultimo=nuevo;
        }else{
            Nodo nuevo = new Nodo(dato,primero);
            primero=nuevo;
        }
        
    }
    
    public Nodo getNodo(int pos){
        Nodo aux = this.primero;
       

            for(int i = 0; i < pos; i++)
                aux = aux.getSig();
        
        return aux;
    }
    
    
    public void insAlFin(T dato){
        if(listaVacia()){
           Nodo nuevo = new Nodo(dato); 
           primero=nuevo;
           ultimo=nuevo;
        }else{
           Nodo nuevo = new Nodo(dato);           
           ultimo.setSig(nuevo);
           ultimo=nuevo;
        }
        
    }    
    
    public T elimAlIni(){
        T retorno = null;
        
        if(!listaVacia()){
            if(primero==ultimo){
                retorno = (T) primero.getDato();
                primero=null;
                ultimo=null;
            }else{
                retorno= (T)primero.getDato();
                primero=primero.getSig();
            }          
        }else
            JOptionPane.showMessageDialog(null,"La lista esta "
                    + "vacía.");
        
        return retorno;   
    }
    
    
    public T elimAlFin(){        
        T retorno = null;        
        if(!listaVacia()){
            if(primero==ultimo){
                retorno = (T) primero.getDato();
                primero=null;
                ultimo=null;
            }else{
                Nodo aux = primero;
                retorno = (T)ultimo.getDato();
                while(aux.getSig()!=ultimo){
                 aux=aux.getSig();
                }
                ultimo=aux;
                aux.setSig(null);                 
            }                
        }else
            JOptionPane.showMessageDialog(null,"La lista esta "
                    + "vacía.");
        
        return retorno;           
    }
    
    public void eliminarEnPosicion(int posicion){
        if(posicion== 0)
            this.elimAlIni();
        if(posicion == this.contNodos() - 1)
            this.elimAlFin();
        else{
            Nodo nodoAnt, nodoPosterior;
            nodoAnt = this.getNodo(posicion - 1);
            nodoPosterior = this.getNodo(posicion + 1);
        
            nodoAnt.setSig(nodoPosterior);
        }
    }
    
    public int contNodos(){
        int cont=0;
        
        if(!listaVacia()){
            Nodo aux=this.primero;
            
            while(aux!=null){
               cont++;
               aux=aux.getSig();               
            }            
        }
        
        return cont;
    }   
    
    
    
}
