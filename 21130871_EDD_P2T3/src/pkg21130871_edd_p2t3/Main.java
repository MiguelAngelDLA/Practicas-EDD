/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21130871_edd_p2t3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author migue
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack();
        Queue<Integer> cola = new LinkedList();
        
        Random random = new Random();
        
        for(int i = 0; i < 100; i++){
            pila.push(random.nextInt(100));
        }
        
        System.out.println("El ultimo elemento de la pila es: " +pila.peek());
        System.out.println("El primer elemento de la pila es: " + pila.firstElement());
        System.out.println("Tamaño de la pila es: " + pila.size());
        
        for(int i = 0; i < 100; i++){
            cola.add(random.nextInt(100));
        }
        System.out.println("Primer elemento de la cola; " + cola.peek());
        System.out.println("Tamaño de la cola: " + cola.size());
        // TODO code application logic here
    }
    
}
