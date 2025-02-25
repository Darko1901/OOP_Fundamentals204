package Practica10;

import java.util.Random;
import javax.swing.JOptionPane;

public class Password {
    private String pass;

    public Password(String pass) {
        this.pass = pass;
    }

    // Añadir un constructor por default
    public Password() {
        this.pass = "";
    }

    public String generarPassword(int longitud, boolean incluirMayusculas, boolean incluirEspeciales, boolean incluirNumeros) {
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String especiales = "!@#$%^&*()-_=+[]{}|;:,.<>?";

        String caracteres = minusculas;
        if (incluirMayusculas) {
            caracteres += mayusculas;
        }
        if (incluirEspeciales) {
            caracteres += especiales;
        }
        if (incluirNumeros) {
            caracteres += numeros;
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            password.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }

        return password.toString();
    }

    public void comprobarFortaleza(String password) {
        boolean tieneMayuscula = !password.equals(password.toLowerCase());
        boolean tieneMinuscula = !password.equals(password.toUpperCase());
        boolean tieneNumeros = password.matches(".*[0-9].*");
        boolean tieneEspeciales = password.matches(".*[!@#$%^&*()\\-_=+\\[\\]{}|;:,.<>?].*");
        boolean longitudSuficiente = password.length() > 7;

        if (tieneMayuscula && tieneMinuscula && tieneNumeros && tieneEspeciales && longitudSuficiente) {
            JOptionPane.showMessageDialog(null, "La contraseña es fuerte.");
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña no es fuerte.");
        }
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}