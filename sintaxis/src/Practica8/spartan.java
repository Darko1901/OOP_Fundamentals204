package Practica8;

public class spartan {
    public String nombre;
    public int salud;
    public int escudo;
    public String armaPrincipal;

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
}
