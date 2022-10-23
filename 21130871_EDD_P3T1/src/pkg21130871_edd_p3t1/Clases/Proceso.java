/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21130871_edd_p3t1.Clases;

import java.util.Random;
import javax.swing.JTable;

/**
 *
 * @author migue
 */
public class Proceso {
    private int numeroDeProceso;
    private String tipoDeProceso;
    private double tiempoDeEjecucion;
    private int prioridad;

    public Proceso(int numeroDeProceso, String tipoDeProceso, double tiempoDeEjecucion, int prioridad) {
        this.numeroDeProceso = numeroDeProceso;
        this.tipoDeProceso = tipoDeProceso;
        this.tiempoDeEjecucion = tiempoDeEjecucion;
        this.prioridad = prioridad;
    }

    public Proceso() {
        this.numeroDeProceso = 0;
        this.tipoDeProceso = "";
        this.tiempoDeEjecucion = 0.0;
        this.prioridad = 0;
    }
    
    public enum TiposDeProceso{
        MEMORIA,
        CPU,
        APP
    }

    public String getTipoDeProceso() {
        return tipoDeProceso;
    }

    public void setTipoDeProceso(String tipoDeProceso) {
        this.tipoDeProceso = tipoDeProceso;
    }
    
    public int getNumeroDeProceso() {
        return numeroDeProceso;
    }

    public void setNumeroDeProceso(int numeroDeProceso) {
        this.numeroDeProceso = numeroDeProceso;
    }

    public double getTiempoDeEjecucion() {
        return tiempoDeEjecucion;
    }

    public void setTiempoDeEjecucion(double tiempoDeEjecucion) {
        this.tiempoDeEjecucion = tiempoDeEjecucion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    public void crearAleatorio(JTable tabla){
        Random random = new Random();
        
        tabla.setValueAt(random.nextInt(400) + "", 0, 0);
        tabla.setValueAt(TiposDeProceso.values()[random.nextInt(3)] + "", 0, 1);
        tabla.setValueAt(random.nextInt(20) + random.nextDouble() + "", 0, 2);
        tabla.setValueAt(random.nextInt(10) + "", 0, 3);
    }
    
     public void obtenerProcesoTabla(JTable tabla){
        this.numeroDeProceso = Integer.parseInt(tabla.getValueAt(0, 0).toString());
        this.tipoDeProceso = tabla.getValueAt(0, 1).toString();
    }
     
    @Override
    public String toString(){
        String cadena = "Numero de Proceso: " + this.numeroDeProceso + "     " +
                "Nombre Del Proceso:  " + this.tipoDeProceso + "   " + 
                "Tiempo de ejecución: " + this.tiempoDeEjecucion + "    " +
                "Prioridad: " + this.prioridad;
        
        return cadena;
    }
}
