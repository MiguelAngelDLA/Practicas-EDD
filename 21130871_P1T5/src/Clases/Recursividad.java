/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author migue
 */
public class Recursividad {
    
    public int factorial(int n){
        int res = 1;
        
        for(int i = n; i > 0; i--){
            res *= i;
        }
        
        return res;
    }
    
    public int factorialR(int n){
        if(n == 1) // Paso base
            return 1;
        else //Paso recursivo
            return factorialR(n - 1) * n;
    }
    
    public int mcd(int n1, int n2){
        int aux;
        while(n1 % n2 != 0){
            aux = n2;
            n2 = n1 % n2;
            n1 = aux;
        }
        
        return n2;
    }
    
    public int mcdR(int n1, int n2){
        if(n1 % n2 == 0)
            return n2;
        else
            return mcdR(n2, n1%n2);
    }
    
    public int multiplicacionRusa(int n1, int n2){
        int suma = 0;
        
        while(n1 > 0){
            if(n1%2 != 0)
                suma += n2;
            n1 = n1 / 2;
            n2 = n2 * 2;
        }
        
        return suma;
    }
    
    public int multiplicacionRusaR(int n1, int n2, int suma){
        if(n1 == 1)
            return suma + n2;
        else if (n1 % 2 != 0)
            suma += n2;
        
        return multiplicacionRusaR(n1 / 2, n2 * 2, suma);
        
    }
}
