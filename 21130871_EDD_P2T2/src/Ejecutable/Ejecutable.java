/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutable;

import Clases.PilaGenerica;
import java.util.Random;

/**
 *
 * @author migue
 */
public class Ejecutable {
    
    public static void main(String[] args) {
        PilaGenerica <Integer> pilaI= new PilaGenerica(10);
        
        Random rnd = new Random();
        
        while(!pilaI.pilaLlena())
            pilaI.push(rnd.nextInt(100));
        
        mostrarPilaEnteros(pilaI);  
    }
    
    public static void mostrarPilaEnteros(PilaGenerica <Integer> pilaO){
        if(!pilaO.pilaVacia()){
            PilaGenerica <Integer> auxPila =new PilaGenerica(pilaO.getTope());
            int num;
            
            while(!pilaO.pilaVacia()){
                num=pilaO.pop();
                System.out.println("Numero " + num);
                auxPila.push(num);
            }
            
            while(!auxPila.pilaVacia()){
                pilaO.push(auxPila.pop());
            }
        } else
            System.out.println("La pila no tiene elementos para mostrar");
    }
}
