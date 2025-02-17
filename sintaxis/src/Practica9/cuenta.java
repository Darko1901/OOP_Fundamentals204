package Practica9;

import javax.swing.JOptionPane;

public class cuenta {
    public int num_cuenta;
    public String titular;
    public int edad;
    public Double saldo;

    public void consultarSaldo(){
        JOptionPane.showMessageDialog(null, "Saldo del titular de la cuenta: " + saldo);
    }
    public void ingresarEfectivo(Double monto){
        //Aqui se aumenta la cantidad de la cuenta en base a lo que se ingreso
        if (monto < 0) {
            JOptionPane.showMessageDialog(null, "Error: No se puede ingresar una cantidad negativa.");
        } else {
            saldo += monto;
            JOptionPane.showMessageDialog(null, "Cantidad ingresada: " + monto);
        }
    }
    public void depositar(int cuentaDestino, Double monto){
        if (monto < 0) {
            JOptionPane.showMessageDialog(null, "Error: No se puede depositar una cantidad negativa.");
        } else if (monto > saldo) {
            JOptionPane.showMessageDialog(null, "Error: Saldo insuficiente para realizar el depósito.");
        } else {
            saldo -= monto;
            JOptionPane.showMessageDialog(null, "Se ha depositado " + monto + " a la cuenta " + cuentaDestino);
        }
    }
}
