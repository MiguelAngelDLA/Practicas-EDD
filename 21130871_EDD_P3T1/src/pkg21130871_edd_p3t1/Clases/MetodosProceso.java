/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21130871_edd_p3t1.Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author migue
 */
public class MetodosProceso {
    
    ArrayList<Proceso> arrProceso;
    
    private static MetodosProceso instance;
    
    public static MetodosProceso getInstance(){
        if(instance == null)
            instance = new MetodosProceso();
        return instance;
    }

    public MetodosProceso() {
        arrProceso = new ArrayList();
    }
    
    public MetodosProceso(ArrayList<Proceso> arrProceso){
        this.arrProceso = arrProceso;
    }

    public ArrayList<Proceso> getArrProceso() {
        return arrProceso;
    }

    public void setArrProceso(ArrayList<Proceso> arrProceso) {
        this.arrProceso = arrProceso;
    }
    
    
    public void Guardar(Proceso newProceso){
        arrProceso.add(newProceso);
    }
    
    public void modificar(int indice, Proceso modProceso){
        arrProceso.set(indice, modProceso);
    }
    
    public void eliminar(int indice){
        arrProceso.remove(indice);
    }
    
    public void eliminar(Proceso proceso){
        arrProceso.remove(proceso);
    }
    
    public void mostrar(JTable jTable){
        DefaultTableModel modelo = (DefaultTableModel)jTable.getModel();
        for(int i = 0; i < arrProceso.size(); i++){
            modelo.setRowCount(i + 1);
            jTable.setValueAt(arrProceso.get(i).getNumeroDeProceso(), i, 0);
            jTable.setValueAt(arrProceso.get(i).getTipoDeProceso(), i, 1);
            jTable.setValueAt(arrProceso.get(i).getTiempoDeEjecucion(), i, 2);
            jTable.setValueAt(arrProceso.get(i).getPrioridad(), i, 3);
        }
    }
    
    public void mostrar(JTable jTable, Proceso proceso){
        jTable.setValueAt(proceso.getNumeroDeProceso(), 0, 0);
        jTable.setValueAt(proceso.getTipoDeProceso(), 0, 1);
        jTable.setValueAt(proceso.getTiempoDeEjecucion(), 0, 2);
        jTable.setValueAt(proceso.getPrioridad(), 0, 3);
    }
    
    public Proceso buscarProceso(int identificador){
        for(int i = 0; i < arrProceso.size(); i++){
            if(identificador == arrProceso.get(i).getNumeroDeProceso()){
                JOptionPane.showMessageDialog(null, "El objeto fue encontrado en la " + i + " \n posición!");
                return arrProceso.get(i);
            }
        }
        return null;
    }
    
    public int buscarPosicionProceso(int indentificador){
        for(int i = 0; i < arrProceso.size(); i++){
            if(indentificador == arrProceso.get(i).getNumeroDeProceso()){
                return i;
            }
        }
        return -1;
    }
    
    public void mostrarIgualPrioridad(JList lista, int prioridad){
        DefaultListModel modeloLista = new DefaultListModel();
        for(int i = 0; i < arrProceso.size(); i++){
            if(arrProceso.get(i).getPrioridad() == prioridad)
                modeloLista.addElement(arrProceso.get(i));
        }
        lista.setModel(modeloLista);
    } 
    
    public void mostrarTiposDeProceso(JList lista, String tipoProceso){
        DefaultListModel modeloLista = new DefaultListModel();
        for(int i = 0; i < arrProceso.size(); i++){
            if(arrProceso.get(i).getTipoDeProceso().equals(tipoProceso))
                modeloLista.addElement(arrProceso.get(i));
        }
        lista.setModel(modeloLista);
    }
    /*
    public Map<Proceso, Number> buscarProceso(int identificador) throws NullPointerException {
    Map<Proceso, Number> datos = new HashMap<>();
    Proceso procesoBuscado = null;
    int i = 0;
    for(i = 0; i < arrProceso.size(); i++){
            if(identificador == arrProceso.get(i).getNumeroDeProceso()){
                procesoBuscado = arrProceso.get(i);
                JOptionPane.showMessageDialog(null, "El objeto fue encontrado en la " + i + " \n posición!");
            }
    }
    if(procesoBuscado == null) throw new NullPointerException();
    
    datos.put(procesoBuscado, i);
    return datos;
}
*/
    public void mostrarPrioridad(JList jListPrioridad){
        
    }
}
