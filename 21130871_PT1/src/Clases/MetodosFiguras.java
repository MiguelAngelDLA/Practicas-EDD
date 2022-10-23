/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.FiguraGeometrica.tiposDeFiguras;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author migue
 */
public class MetodosFiguras {
    
    private static MetodosFiguras instance;
    private ArrayList<FiguraGeometrica> arrayFiguras;
    
    public static MetodosFiguras getInstance(){
        if(instance == null)
            instance = new MetodosFiguras();
        return instance;
    }
    
    public MetodosFiguras(){
        arrayFiguras = new ArrayList();
    }

    public ArrayList<FiguraGeometrica> getArrayFiguras() {
        return arrayFiguras;
    }

    public void setArrayFiguras(ArrayList<FiguraGeometrica> arrayFiguras) {
        this.arrayFiguras = arrayFiguras;
    }
    
    public void guardar(FiguraGeometrica figura){
        arrayFiguras.add(figura);
    }
    
    public void eliminar(){
        arrayFiguras.remove(arrayFiguras.size());
    }
    
    public void eliminar(int indice){
        arrayFiguras.remove(indice);
    }
    
    public void modificar(int indice, FiguraGeometrica nueva){
        arrayFiguras.set(indice, nueva);
    }
    
    public void mostrar(JTable tablaMostrar){
        DefaultTableModel modelo = (DefaultTableModel)tablaMostrar.getModel();
        for(int i = 0; i < arrayFiguras.size(); i++){
            modelo.setRowCount(i + 1);
            tablaMostrar.setValueAt(arrayFiguras.get(i).getNumeroDeFigura(), i, 0);
            tablaMostrar.setValueAt(arrayFiguras.get(i).getNombreDeFigura(), i, 1);
        }
    }
    
    public void mostrar(JTable tablaMostrar,JPanel panel, String tipoDeFigura){
        limpiarPanel(panel);
        DefaultTableModel modelo = (DefaultTableModel)tablaMostrar.getModel();
        modelo.setRowCount(0);
        int contador = 1;
        for(int i = 0; i < arrayFiguras.size(); i++){
            if(arrayFiguras.get(i).getNombreDeFigura().equals(tipoDeFigura)){
                modelo.setRowCount(contador);
                tablaMostrar.setValueAt(arrayFiguras.get(i).getNumeroDeFigura(), contador - 1, 0);
                tablaMostrar.setValueAt(arrayFiguras.get(i).getNombreDeFigura(), contador - 1, 1);
                
                mostrarConjunto(panel, i);

                contador++;
            }
        }
    }
    
    public void mostrarConjunto(JPanel panel, int indice){
        Graphics2D graphics = (Graphics2D)panel.getGraphics();
        graphics.draw(arrayFiguras.get(indice).getFigura());
    }
    
    public void mostrarDibujo(JPanel panel, int indice){
        Graphics2D graphics = (Graphics2D)panel.getGraphics();
        limpiarPanel(panel);
        graphics.draw(arrayFiguras.get(indice).getFigura());
    }
    
    public void limpiarPanel(JPanel panel){
        Graphics2D graphics = (Graphics2D)panel.getGraphics();
        graphics.setColor(panel.getBackground());
        panel.paint(graphics);

    }
}
