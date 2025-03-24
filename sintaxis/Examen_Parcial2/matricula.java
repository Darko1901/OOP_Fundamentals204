package Examen_Parcial2;

import java.util.Random;
import javax.swing.JOptionPane;

public class matricula {
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String strNacimiento;
    public StringBuilder StrMat;
    private String carrera;

    public void solicitarDatos(){
        nombre = JOptionPane.showInputDialog(null,"Ingresa tu nombre");
        aPaterno = JOptionPane.showInputDialog(null, "Ingresa tu apellido paterno");
        aMaterno = JOptionPane.showInputDialog(null,"Ingresa tu apellido materno");
        strNacimiento = JOptionPane.showInputDialog(null, "Ingresa tu fecha de nacimiento");
        carrera = JOptionPane.showInputDialog(null, "Ingresa el nombre de tu carrera");
    }

    public void crearMatricula(){
        //StringBuilder para toda la matricula
        StrMat.append(nombre.substring(0,1));
        StrMat.append(aPaterno.substring(0,2).toUpperCase());
        StrMat.append(aMaterno.substring(0,2).toUpperCase());
        StrMat.append(strNacimiento.substring(2));
        StrMat.append("25");
        StrMat.append(carrera.substring(0,3).toUpperCase());
        //Numeros aleatorios
        Random rand = new Random();
        //Generar dos digitos aleatorios entre 0 y 99
        int randoms = rand.nextInt(100);
        StrMat.append(randoms); 
        StrMat.append(randoms);
    }

    public void mostrarMatricula(){
        System.out.println(StrMat);
        JOptionPane.showMessageDialog(null, StrMat);
    }

    //Constructor
    public matricula(String nombre, String aPaterno, String aMaterno, String strNacimiento, StringBuilder StrMat, String carrera) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.strNacimiento = strNacimiento;
        this.StrMat = StrMat;
        this.carrera = carrera;
    }

    // Metodos GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getStrNacimiento() {
        return strNacimiento;
    }

    public void setStrNacimiento(String strNacimiento) {
        this.strNacimiento = strNacimiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public StringBuilder getStrMat() {
        return StrMat;
    }

    public void setStrMat(StringBuilder StrMat) {
        this.StrMat = StrMat;
    }
}
