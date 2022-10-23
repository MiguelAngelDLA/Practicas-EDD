/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author migue
 */
public class FiguraGeometrica {
    private int numeroDeFigura;
    private String nombreDeFigura;
    private Shape figura;
    private Random random = new Random();

    public FiguraGeometrica(int numeroDeFigura, String nombreDeFigura) {
        this.numeroDeFigura = numeroDeFigura;
        this.nombreDeFigura = nombreDeFigura;
    }
    
    public FiguraGeometrica(){
        this.numeroDeFigura = 0;
        this.nombreDeFigura = "";
        this.figura = null;
    }
    
    public enum tiposDeFiguras{
        RECTANGULO,
        OVALO,
        CUADRADO,
        TRIANGULO;

    }

    public int getNumeroDeFigura() {
        return numeroDeFigura;
    }

    public void setNumeroDeFigura(int numeroDeFigura) {
        this.numeroDeFigura = numeroDeFigura;
    }

    public String getNombreDeFigura() {
        return nombreDeFigura;
    }

    public void setNombreDeFigura(String nombreDeFigura) {
        this.nombreDeFigura = nombreDeFigura;
    }

    public Shape getFigura() {
        return figura;
    }

    public void setFigura(Shape figura) {
        this.figura = figura;
    }

    public int[] valoresDeFigura(){
        int[] valores = {figura.getBounds().x, figura.getBounds().y, figura.getBounds().height, figura.getBounds().width};
        return valores;
    }
    public int llamarCoordenada(){
        return 50 + random.nextInt(90);
    }
    
    public void generarFiguraRandom(JTable tabla,JComboBox box, JPanel panel){
        tiposDeFiguras tipoFig = tiposDeFiguras.values()[random.nextInt(4)];
        String nombre = tipoFig.name();
        numeroDeFigura = random.nextInt(20);
        
        tabla.setValueAt(numeroDeFigura, 0, 0);
        tabla.setValueAt(nombre, 0, 1);        
        box.setSelectedIndex(tipoFig.ordinal());
        
        dibujarFiguraRandom(panel, tipoFig);
    }
    
    
    public void modificarFigura(JPanel panel,tiposDeFiguras tipoFig, int x, int y, int altura, int ancho){
        setNombreDeFigura(tipoFig.name());
        Graphics2D grafico = (Graphics2D)panel.getGraphics();
        grafico.setColor(panel.getBackground());
        panel.paint(grafico);
        if(figura != null) grafico.clearRect(figura.getBounds().x, figura.getBounds().y, figura.getBounds().height, figura.getBounds().width);
        switch(tipoFig){
            case RECTANGULO:
                figura = new Rectangle2D.Double(x, y, altura, ancho);
                break;
            
            case OVALO:
                figura = new Ellipse2D.Double(x, y, altura, ancho);
                break;
            case CUADRADO:
                figura = new Rectangle2D.Double(x, y, altura, altura);
                break;
            case TRIANGULO:
                int x1Points[] = {x, y, altura + 30};
                int y1Points[] = {x, y, ancho + 30};
                figura = new Polygon(x1Points, y1Points,3);
                        
                break;
        }
        grafico.draw(figura);
    }
    
    public void dibujarFiguraRandom(JPanel panel, tiposDeFiguras tipoFig){
        Graphics2D grafico = (Graphics2D)panel.getGraphics();
        grafico.setColor(panel.getBackground());
        int x = llamarCoordenada(), y = llamarCoordenada(), lado = llamarCoordenada(), altura = llamarCoordenada();        
        modificarFigura(panel, tipoFig, x, y, lado, altura);
    }
    
}
