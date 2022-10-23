/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21130871_p1t1.Clases;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author migue
 */
public class Ejecutable {
    
    private Persona[] arrPersonas;
    private int i;
    //Constructures

    public Ejecutable() {
        arrPersonas = null;
        i = 0;
    }
    
    public Ejecutable(int dimension){
        arrPersonas = new Persona[dimension];
        i = 0;
    }

    public Persona[] getArrPersonas() {
        return arrPersonas;
    }

    public void setArrPersonas(Persona[] arrPersonas) {
        this.arrPersonas = arrPersonas;
    }
    
    public void guardarPersona(Persona oPer){
        
        if(i < arrPersonas.length){
            arrPersonas[i] = oPer;
            i++;
        }
        else JOptionPane.showMessageDialog(null, "El arreglo no tiene espacios disponibles");
    }
    
    public void mostrarArreglo(JTable tabla){
        
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(i);
        for(int j = 0; j < i; j++){
            tabla.setValueAt(arrPersonas[j].getNombre(), j, 0);
            tabla.setValueAt(arrPersonas[j].getEdad(), j, 1);
            tabla.setValueAt(arrPersonas[j].getEstatura(), j, 2);
            tabla.setValueAt(arrPersonas[j].getOcupacion(), j, 3);
        }
        
    }
    
    public void modificarPersona(int index, Persona personaAModificar){
        arrPersonas[index] = personaAModificar;
    }
    
    public void eliminarPersona(int index, JTable tabla){
        
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        
        Persona[] copiaPersonas = new Persona[arrPersonas.length - 1];
        
        int k = 0;
        for (int j = 0; j < arrPersonas.length; j++) {
            if (j != index) {
                copiaPersonas[k] = arrPersonas[j];
                k++;
            }
        }
        arrPersonas = copiaPersonas;
        i = arrPersonas.length;
        modelo.removeRow(index);
    }
    
    public double promedioEdades(){
        double suma = 0;
        for (int j = 0; j < i; j++) {
            suma += arrPersonas[j].getEdad();
        }
        return suma / i;
    }
    
    public void mostrarPorOcupacion(String ocupacion, JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        
        modelo.setRowCount(0);
        for(int j = 0; j < i; j++){
            Object[] arrObject = new Object[4];
            
            if(arrPersonas[j].getOcupacion().equals(ocupacion)){
                arrObject[0] = arrPersonas[j].getNombre();
                arrObject[1] = arrPersonas[j].getEdad();
                arrObject[2] = arrPersonas[j].getEstatura();
                arrObject[3] = arrPersonas[j].getOcupacion();
                
                modelo.addRow(arrObject);
            }
        }
    }
}
