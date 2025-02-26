package Practica13;

import javax.swing.JOptionPane;

public class Envio {
    private String codigoEnvio;
    private String destino;
    private Double peso;

    // Constructor sobrecargado con peso por default
    public Envio(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = 0.0; // Peso por default
    }

    // Constructor para los atributos
    public Envio(String codigoEnvio, String destino, Double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso; //Peso que podra ingresar el usuario
    }

    //TODO

    // Metodo para crear una instancia de Envio
    public static Envio crearEnvio() {
        String codigoEnvio = JOptionPane.showInputDialog("Ingrese el código de envío:");
        String destino = JOptionPane.showInputDialog("Ingrese el destino:");
        Double peso = null;
        while (peso == null) {
            try {
                peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso:"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida. Por favor, ingrese un número para el peso.");
            }
        }

        Envio envio = new Envio(codigoEnvio, destino, peso);
        return envio;
    }

    // Get y Set
    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
