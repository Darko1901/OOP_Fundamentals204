package Practica8;

public class spartan {
    
    //Atributos del Spartan

    private String nombre;
    private int salud;
    private int escudo;
    private String armaPrincipal;

    //Constructor del Spartan

    public spartan(String armaPrincipal, int escudo, String nombre, int salud) {
        this.armaPrincipal = armaPrincipal;
        this.escudo = escudo;
        this.nombre = nombre;
        this.salud = salud;
    }

    //Metodos del spartan

    public void mostrarInfo(){
        System.out.println("-----------Informacion del Spartan------------");
        System.out.println("Nombre: " + nombre + ", salud: " + salud + ", escudo: " + escudo + ", arma principal: " + armaPrincipal);
    }
    public void atacar(String enemigo){
        System.out.println(nombre + " ha atacado a: " + enemigo + " con " + armaPrincipal);
    }

    public void recargarArma(int municion){
        int restante = 100;
        int total = restante + municion;
        System.out.println("Se ha recargado " + armaPrincipal + " municion actual: " + total);
    }

    public void correr(boolean Status){
        System.out.println("Status: " + Status);
        if (Status == true){
            System.out.println("El spartan esta corriendo");
        }else{
            System.out.println("El spartan no esta corriendo");
        }
    }

    private void consultarACortana(){
        System.out.println("Consultando a Cortana");
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }
}
