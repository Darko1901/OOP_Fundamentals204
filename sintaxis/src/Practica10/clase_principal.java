package Practica10;

import javax.swing.JOptionPane;

public class clase_principal {
    public static void main(String[] args) {
        Password password = new Password();

        String[] opciones = {"Generar contraseña", "Comprobar fortaleza", "Salir"};
        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    mostrarMenuGenerarPassword(password);
                    break;
                case 1:
                    if (password.pass != null && !password.pass.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Contraseña a comprobar: " + password.pass);
                        password.comprobarFortaleza(password.pass);
                    } else {
                        String pass = JOptionPane.showInputDialog("Ingrese la contraseña a comprobar:");
                        JOptionPane.showMessageDialog(null, "Contraseña a comprobar: " + pass);
                        password.comprobarFortaleza(pass);
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        } while (opcion != 2);
    }

    private static void mostrarMenuGenerarPassword(Password password) {
        String input = JOptionPane.showInputDialog("Ingrese la longitud de la contraseña (mínimo 8 caracteres, por defecto 8):");
        int longitud = 8; // Valor por defecto
        if (input != null && !input.isEmpty()) {
            try {
                longitud = Integer.parseInt(input);
                if (longitud < 8) {
                    JOptionPane.showMessageDialog(null, "La longitud debe ser de al menos 8 caracteres. Se usará el valor por defecto de 8.");
                    longitud = 8;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida. Se usará el valor por defecto de 8.");
            }
        }

        boolean incluirMayusculas = false;
        boolean incluirEspeciales = false;
        boolean incluirNumeros = false;

        String[] opcionesGenerar = {"Incluir mayúsculas", "Incluir caracteres especiales", "Incluir números", "Generar contraseña"};
        int opcionGenerar;
        do {
            opcionGenerar = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Generar Contraseña",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesGenerar, opcionesGenerar[0]);

            switch (opcionGenerar) {
                case 0:
                    incluirMayusculas = true;
                    break;
                case 1:
                    incluirEspeciales = true;
                    break;
                case 2:
                    incluirNumeros = true;
                    break;
                case 3:
                    password.pass = password.generarPassword(longitud, incluirMayusculas, incluirEspeciales, incluirNumeros);
                    JOptionPane.showMessageDialog(null, "Contraseña generada: " + password.pass);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        } while (opcionGenerar != 3);
    }
}