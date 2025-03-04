package Practica13;

import javax.swing.JOptionPane;

public class Entregas {
    private int numeroGuia;
    private String estado;

    // Constructor
    public Entregas(int numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "pendiente";
    }

    // Metodo para actualizar estado
    public void actualizarEstado() {
        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En tránsito o Entregado):");
        if (nuevoEstado.equals("En tránsito") || nuevoEstado.equals("Entregado")) {
            this.estado = nuevoEstado;
            JOptionPane.showMessageDialog(null, "Estado actualizado a: " + nuevoEstado);
        } else {
            JOptionPane.showMessageDialog(null, "Estado no válido. Solo se permite 'En tránsito' o 'Entregado'.");
        }
    }

    // Get y Set
    public int getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(int numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
