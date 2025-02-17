package Practica9;

import javax.swing.JOptionPane;

public class clase_principal {
    public static void main(String[] args) {
        cuenta miCuenta = new cuenta();

        // Solicitar datos
        String titular = JOptionPane.showInputDialog("Ingrese el nombre del titular:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del titular:"));
        int num_cuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta:"));

        miCuenta.titular = titular;
        miCuenta.edad = edad;
        miCuenta.num_cuenta = num_cuenta;
        miCuenta.saldo = 500.0;

        // Mostrar el saldo inicial
        miCuenta.consultarSaldo();

        // Menu
        String[] opciones = {"Consultar saldo", "Ingresar efectivo", "Depositar a otra cuenta", "Salir"};
        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    miCuenta.consultarSaldo();
                    break;
                case 1:
                    Double montoIngreso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a ingresar:"));
                    miCuenta.ingresarEfectivo(montoIngreso);
                    break;
                case 2:
                    int cuentaDestino = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta destino:"));
                    Double montoDeposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));
                    miCuenta.depositar(cuentaDestino, montoDeposito);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        } while (opcion != 3);
    }
}
