/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Vale
 */
public class ColaGenerica  <T> {
    //Atributos
    private int primero;
    private int ultimo;
    private T arreglo[];
    
    //constructores
    //default
    public ColaGenerica(){
        this.primero=-1;
        this.ultimo=-1;
        this.arreglo=null;      
    }
    
    //parametrizado
    public ColaGenerica(int dim){
        this.primero=-1;
        this.ultimo=-1;
        arreglo=(T[]) new Object[dim];
    }
    
    //Métodos get y set

    public int getPrimero() {
        return primero;
    }

    public void setPrimero(int primero) {
        this.primero = primero;
    }

    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }
    
    //Metodos
    public boolean colaVacia(){
        if(primero==-1)
            return true;
        else
            return false;             
    }
    
    public boolean colaLlena(){
        if(primero==0 && ultimo==arreglo.length-1)
            return true;
        else if(primero==ultimo+1)
                return true;
            else
                return false;
    }
    
    public void insertar(T objT){//insertar ovjeto generico no es push 
        if(!colaLlena()){
            if(colaVacia()){
                arreglo[++ultimo]=objT;
                primero++;
                
            }else if(ultimo==arreglo.length-1){//circular
                ultimo=0;
                arreglo[ultimo]=objT;
            }else//cola simple
                arreglo[++ultimo]=objT;
                
        }else
            JOptionPane.showMessageDialog(null, "No hay espacio para insertar otro elemento");
        
    }
    
    public T eliminar(){
        T objRet=null;
        if(!colaVacia()){
            if(primero==ultimo){
                objRet=arreglo[primero];
                primero =-1;
                ultimo=-1;
            }else if(primero==arreglo.length-1){//circulas
                objRet= arreglo[primero];
                primero=0;
            }else
                objRet=arreglo[primero++];
        }else
            JOptionPane.showMessageDialog(null, "No hay elementos para eliminar");
        
        return objRet;
    }
    
    public int numElementos(){
        if(!colaVacia()){
            
            if(ultimo<primero)
                return ((ultimo + arreglo.length)-primero)+1;
            else
                return(ultimo-primero)+1;
            
        }else{
            JOptionPane.showMessageDialog(null, "No hay elementos en la cola)");
            return 0;
                    
        }           
    }
    
    public void inveritrCola(){
        if(this.numElementos()>=2){
            
        }else
            JOptionPane.showMessageDialog(null, "Se necesitan al menos 2 elementos en la cola)");
            
    }
            
}
