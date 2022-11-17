
package Clases;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class Recursividad {

    //Metodo para calcular el factorial de un numero;
    public int factorial(int n){
        int res = 1;
        
        for(int i=n; i>0; i--){
            res *= i;
        }
        
        return res;
    }
    
    public int factorialR(int n){
        if(n==1)//Paso Base
            return 1;
        else//Paso recursivo
            return factorialR(n-1)*n;
    }
    
    //Metodo para obtener el maximo comun divisor de 2 numeros con el algoritmo de Euclides
    public int mcd(int n1, int n2){
        int aux;
        
        while(n1%n2!=0){
            aux=n2;
            n2=n1%n2;
            n1=aux;
        }
        
        return n2;
        
    }
    
    public int mcdR(int n1, int n2){
        //Paso base:
        if(n1%n2==0)
            return n2;
        else
            return mcdR(n2,n1%n2);
    }
    
    //Metodo de la multiplicacion rusa XD wtf?:
    public int multiplicacionRusa(int n1, int n2){
        int suma = 0;
        while(n1 > 0){
            if(n1%2!=0)
                suma += n2;
            
            n1/=2;
            n2*=2;
            
        }
        return suma;
    }
    
    public int multiplicacionRusaR(int n1, int n2, int suma){
        if(n1 == 1)
            return suma + n2;
        else if(n1%2 !=0)
                suma+=n2;
        return multiplicacionRusaR(n1/2,n2*2,suma);
        
    }
    
    //Serie de fibonacci
    public String finobacci(int n){
        String cad = "0, 1";
        int n1=0;
        int n2=1;
        int aux;
        
        if(n==1)
            cad = "0";
        else if(n==2)
            cad = "0,1";
        else{
            for(int i=2; i<=n; i++){
                aux = n1+n2;
                cad += ", "+aux;
                n1 = n2;
                n2 = aux;
            }
        }
        
        return cad;
                    
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
    
    public double expresion(double x, int n){
        
        for(int i=1; i<=n; i++){
            
            x = Math.pow(x, i);
          
        }
         
        return x;
    }
    
    //Tarea recursivo
    public double expresionR(double x, int n){
        
        if(n==1)
            return x;
        else
            return expresionR(Math.pow(x, n),n-1);
        
    }
    
    //Convertir decimal a binario iterativamente
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
    
    //Metodo de la sumatoria iterativa de ananashe (el exonente empieza desde 0 y las posiciones pares van de raiz y en cada pos el exponente +1)
    public double sumatoria(double x, double n){
        
        double suma = 0;
        double xd = 0;
        double cont = 0;
        
        while(cont != n){
            suma += Math.pow(x, xd);
            xd += 0.5;
            cont++;
        }
       
        return suma;
    }
    
    public double sumatoriaR(double x, double n, double aux, double suma){
        
        if(aux*2==n)
            return suma+x;
        else
            return sumatoriaR(Math.pow(x, aux),n,aux+0.5,suma+x);
        
    }
    
    //Metodo de numeros perfectos por amigos: 
    public boolean paresAmig(int n1, int n2){
        int suma = 0;
        
        for(int i=1; i<n1; i++){
            if(n1%i==0)
                suma += i;
        }
        
        if(suma==n2){
            suma = 0;
            for(int i=1; i<n2; i++){
                if(n2%i==0)
                    suma += i;
            }
            if(suma==n1)
                return true;
            else
                return false;
        }else
            return false;
    }
    
    public boolean paresAmigR(int n1, int n2){
        return false;
    }
    
    //sumatoria Arreglo
    public int sumaArreglo(int []arreglo){
        
        int suma = 0;
        try{
        for(int i=0; i<arreglo.length; i++){
            suma += arreglo[i];
        }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        return suma;
        
        
    }
    
    public int sumaArregloR(int []arreglo, int i, int suma){
        if(i==-1)
            return suma;
        else
            return sumaArregloR(arreglo, i-1, suma+= arreglo[i]);
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
    
    public boolean palindromo(String cadOr, String stringAct,int i,  boolean estado){
        if((cadOr == null ? stringAct == null : cadOr.equals(stringAct)) && i < 0)
            return true;
        if(i < 0){
            JOptionPane.showMessageDialog(null, stringAct);
            return false;
        }
        else{
            stringAct += (cadOr.charAt(i) + "");
            return palindromo(cadOr, stringAct, i-1, estado);
        }
    }
    
}
