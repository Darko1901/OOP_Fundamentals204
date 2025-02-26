package Practica13;

import javax.swing.JOptionPane;

public class Conductor {
    private String nombre;
    private String licencia;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    // Metodo para crear una instancia de conductor
    public static Conductor crearConductor() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
        String licencia = JOptionPane.showInputDialog("Ingrese el número de licencia del conductor:");
        return new Conductor(nombre, licencia);
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
}
