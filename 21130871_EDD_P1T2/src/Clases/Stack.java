/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author migue
 */
public class Stack {
    //Atributos
    Dato[] arregloDatos;
    int tope;
    
    public Stack(){
        this.arregloDatos = null;
        this.tope = 0;
    }

    public Stack(int tamaño) {
        this.arregloDatos = new Dato[tamaño];
        this.tope = 0;
    }
    
    public boolean isStackEmpty(){
        if(tope == 0) return true;
        else return false;
    }
    
    public boolean isStackFull(){
        return tope == arregloDatos.length;
    }
    
    public void push(Dato dato){
        if(tope < arregloDatos.length) arregloDatos[tope++] = dato;
        else JOptionPane.showMessageDialog(null, "No hay espacio");
    }
    
    public Dato pop(){
        Dato oRet;
        if(!isStackEmpty()){
            oRet = arregloDatos[--tope];
        }
        else{ 
            oRet = null;
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
        }
        return oRet;
    }
    
    public void mostrar(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        if(!isStackEmpty()){
            int contador = tope;
            modelo.setRowCount(tope);
            Stack auxStack = new Stack(this.tope);
            Dato oDato = new Dato();
            
            for(int i = 0; i < contador; i++){
                oDato = this.pop();
                oDato.mostrarDato(tabla, i);
                auxStack.push(oDato);
            }
            
            while(!auxStack.isStackEmpty()){
                this.push(auxStack.pop());
            }
        }
        else{            
            modelo.setRowCount(0);
            JOptionPane.showMessageDialog(null, "No hay elementos para mostrar");
        }
    }
    
    public void invertirStack(){
        if(!isStackEmpty()){
            Stack auxStack = new Stack(tope);
            Stack auxStack1 = new Stack(tope);
            
            while(!isStackEmpty())
                auxStack.push(pop());
            
            while(!auxStack.isStackEmpty())
                auxStack1.push(auxStack.pop());
            
            while(!auxStack1.isStackEmpty())
                push(auxStack1.pop());
        }
        else{
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
        }
    }
    
    public void popBottomElement(){
        if(tope >= 2){
            invertirStack();
            pop();
            invertirStack();
        }
        else JOptionPane.showMessageDialog(null, "Se necesitan minimo 2 elementos para hacer esta acción");
    }
    
    public void eliminarElemento(int posicion){
        Stack auxStack = new Stack(tope-posicion);
        if( posicion > 0 && posicion <= tope){
            while(!auxStack.isStackFull())
                auxStack.push(pop());
            
            pop();
            while(!auxStack.isStackEmpty())
                push(auxStack.pop());
        }
    }
    
    public void agregaElemento(int posicion, Dato dato){
        Stack auxStack = new Stack(tope + 1);
        int counter = tope + 1;
        if(!isStackFull()){
            while(!auxStack.isStackFull()){
                if(posicion != counter)
                    auxStack.push(pop());
                else
                    auxStack.push(dato);
                counter--;
            }
 
            while(!auxStack.isStackEmpty())
                push(auxStack.pop());
            
        }
        else JOptionPane.showMessageDialog(null, "La pila está llena");
    }
}//72.5
