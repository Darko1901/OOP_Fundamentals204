package Practica9;

import javax.swing.JOptionPane;

public class cuenta {
    private int num_cuenta;
    private String titular;
    private int edad;
    private Double saldo;


    public cuenta(int num_cuenta, String titular, int edad) {
        this.num_cuenta = num_cuenta;
        this.titular = titular;
        this.edad = edad;
    }

    public cuenta(Double saldo) {
        this.saldo = saldo;
    }

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

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
