/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21130871_p2t1.Clases;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
/**
 *
 * @author migue
 */
public class Metodos {
    //Atributos 
    private ArrayList<Escuela> arrEscuela;

    public Metodos() {
        arrEscuela = new ArrayList();
    }

    public ArrayList<Escuela> getArrEscuela() {
        return arrEscuela;
    }

    public void setArrEscuela(ArrayList<Escuela> arrEscuela) {
        this.arrEscuela = arrEscuela;
    }
    
    public void guardar(Escuela oEsc){
        arrEscuela.add(oEsc);
    }
    
    public void mostrar(JList lista){
        DefaultListModel modelo = new DefaultListModel();
        String cadena;
        for(int i = 0; i < arrEscuela.size(); i++){
            
            modelo.addElement(arrEscuela.get(i));
        }
        lista.setModel(modelo);
    }
    
    public void modificar(int indice, Escuela oEsc){
        arrEscuela.set(indice, oEsc);
    }
    
    public void eliminar(int indice){
        arrEscuela.remove(indice);
    }
    
    public void totalPublicasPrivadas(JLabel etiquetaB, JLabel etiquetaV){
        int contB = 0;
        int contV = 0;
        
        for(int i= 0; i < arrEscuela.size(); i++){
            if(arrEscuela.get(i).getTipoDeEscuela() == 'B') contB++;
            else contV++;
        }
        etiquetaB.setText("" + contB);
        etiquetaV.setText("" + contV);
    }
    
    /*
    public int buscar(int numEsc, JTable tabla){
        int indice;
        for(int i = 0; i < arrEscuela.size(); i++){
            if(numEsc == arr)
            indice = i;
            tabla.setValueAt(arrEscuela.get(i).getNumeroDeEscuela(), 0, 0);
            tabla.setValueAt(arrEscuela.get(i).getNombreDeLaEscuela(), 0, 1);
            tabla.setValueAt(arrEscuela.get(i).getNumeroDeAlumnos(), 0, 2);
            tabla.setValueAt(arrEscuela.get(i).getTipoDeEscuela(), 0, 3);
            break;
        }
    }
*/
}
