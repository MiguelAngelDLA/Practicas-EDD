/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Objects;

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
    
    public String fibonacciI(int pos){
       String cad = "0, 1";
       int n2 = 1;
       int n1 = 0;
       int aux = 0;
       
       if(pos == 1 || pos == 2)
           return cad;
       
       else
           for(int i = 2; i <= pos; i++){
               aux = n1 + n2;
               cad += ", "+ aux;
               n1 = n2;
               n2 = aux;
           }
       return cad;
    }
    
     public double expresion(double x, double n){
         while(n != 0){
             x = Math.pow(x, n);
             n--;
         }
         return x;
    }
     
    public double expresionR(double x, double n){
        if(n == 1)
            return x;
        else
            return x;
    }
    
    public double sumatoriaCuriosa(double x, double potencia){
        double sumatoria = 0;
        double pot = 0;
        for(double i = 0; i < potencia; i++){
            sumatoria += Math.pow(x, pot);
            pot += 0.5;
        }
        return sumatoria;
    }
    
    public double sumatoriaCuriosa2(double x, double act, double rep, double sum){
        if(rep == act)
            return sum;
        else
            return sumatoriaCuriosa2(x, act + 0.5, rep - 0.5, sum + Math.pow(x, act));
    }

    
    //Numeros perfectos
    public boolean paresAmigos(int n1, int n2){
        int sum1 = 0;
        int sum2 = 0;
        //Buscar divisores n1
        for(int i = 1; i <= n1; i++){
            if(n1 % i == 0)
                sum1 += i;
        }
        //Buscar divisores n2
        for(int i = 1; i <= n2; i++){
            if(n2 % i == 0)
                sum2 += i;
        }
        //Checar si son o no
        if(sum2 == sum1) return true;
        else return false;
    }
    
    public boolean paresAmigosR(int n1, int n2, int sumDiv1, int sumDiv2, int cont, boolean estadoaCT){
        if(sumDiv1 == sumDiv2){
            return true;
        }
        else{
            if(n1 % cont == 0)
                sumDiv1 += cont;
            if(n2 % cont == 0)
                sumDiv2 += cont;
            
            return paresAmigosR(n1, n2, sumDiv1, sumDiv2, cont + 1, sumDiv1 == sumDiv2);
        }
    }
    
    public int sumaArreglo(int[] arreglo){
        int suma = 0;
        for(int i = 0; i < arreglo.length; i++){
            suma += arreglo[i];
        }
        return suma;
    }
    
    public int sumaArregloR(int[] arreglo, int i, int suma){
        if(i == -1)
            return suma;
        else
            return sumaArregloR(arreglo, i-1, suma + arreglo[i]);
    }
    
    
    public String getMayorYMenorIterativo(int[] arreglo){
        int mayor = 0;
        int menor = 0;
        
        for(int i = 0; i < arreglo.length; i++){
            if(mayor > arreglo[i])
                mayor = arreglo[i];
            
            if(menor < arreglo[i])
                menor = arreglo[i];
        }
        return "Mayor: " + mayor + "Menor: " + menor;
    }
    
    public String fibonacciR(int n, int n1, int n2, String aux){
        if(n == 1)
            return "0";
        else if(n == 2)
            return aux;
        else{
            return fibonacciR(n-1,n2,n1+n2,aux+=", "+(n1+n2));
        }
    }
    
    public String decimABin(int n){
        String cad = "";
        
        while(n!=0){
            cad = n%2+cad;
            n = n/2;
        }
        
        return cad;
    }
    
    public String decimABinR(int n, String cad){
        if(n==0)
            return cad;
        else
            return decimABinR(n/2, (n%2)+cad);
        
    }
    
    
    public String maxMin(int []arreglo){
        int max = arreglo[0];
        int min = arreglo[0];
        
        for(int i=0; i<arreglo.length; i++){
            if(min > arreglo[i])
                min = arreglo[i];
            if(max < arreglo[i])
                max = arreglo[i];
        }
        
        return "Maximo = "+max+" Minimo = "+min;
    }
    
    public String maxMinR(int []arreglo, int max, int min, int i){
        if(i==-1)
            return "Maximo = "+max+" Minimo = "+min;
        else{
            if(min > arreglo[i])
                min = arreglo[i];
            if(max < arreglo[i])
                max = arreglo[i];
            return maxMinR(arreglo, max, min, i-1);
        }
        
    }



    
    public String getMayorYMenorRecursivo(int[] arreglo, int menor, int mayor, int i){
        if(i == arreglo.length)
            return "Mayor: " + mayor + "Menor: " + menor;
        else{
            if(arreglo[i] > mayor)
                mayor = arreglo[i];
            if(arreglo[i] < menor)
                menor = arreglo[i];
            return getMayorYMenorRecursivo(arreglo, mayor, menor,i+1);
        }
    }
    
}
