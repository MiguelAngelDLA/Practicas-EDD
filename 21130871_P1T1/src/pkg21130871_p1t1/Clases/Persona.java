/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21130871_p1t1.Clases;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JTextField;

/**
 *
 * @author migue
 */
public class Persona {
    private String nombre;
    private int edad;
    private double estatura;
    private String ocupacion;

    public Persona(String nombre, int edad, double estatura, String ocupacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.ocupacion = ocupacion;
    }
    
    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.estatura = 0;
        this.ocupacion = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    public void generarPersonasAleatorias(JTextField tfNombre, JTextField tfEdad, JTextField tfEstatura, JTextField tfOcupacion){
        
        Random random = new Random();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        
        String[] nombres = {"Jose", "Maria", "Luis", "Rosa", "Mario", "Melisa", "Juan", "Pilar"};
        String [] apellidos = {"Ramirez", "Lopez", "Casa", "Rios", "Pérez", "Martinez", "Rosas"};
        String[] ocupaciones = {"Empleado", "Estudiante", "Labores del hogar"};
        
        tfNombre.setText(nombres[random.nextInt(nombres.length)] + " " + apellidos[random.nextInt(apellidos.length)]);
        tfEdad.setText(String.valueOf(random.nextInt(100)+ 1));
        tfEstatura.setText(String.valueOf(decimalFormat.format(random.nextDouble() + 1)));
        tfOcupacion.setText(ocupaciones[random.nextInt(ocupaciones.length)]);
    }
}
