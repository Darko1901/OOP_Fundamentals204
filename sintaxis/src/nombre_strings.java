import java.util.*;

public class nombre_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingresa tu apellido paterno: ");
        String apellido_paterno = sc.nextLine();

        System.out.println("Ingresa tu apellido materno: ");
        String apellido_materno = sc.nextLine();

        System.out.println("Tu nombre en minusculas: " + nombre.toLowerCase() + " " + apellido_paterno.toLowerCase() + " " + apellido_materno.toLowerCase());
        System.out.println("Tu nombre en mayusculas: " + nombre.toUpperCase() + " " + apellido_paterno.toUpperCase() + " " + apellido_materno.toUpperCase());

        //String letra_nombre = nombre.substring(0).toUpperCase();

        char letra_nombre = nombre.charAt(0);
        char nombre_mayus = Character.toUpperCase(letra_nombre);
        char letra_paterno = apellido_paterno.charAt(0);
        char paterno_mayus = Character.toUpperCase(letra_paterno);
        char letra_materno = apellido_materno.charAt(0);
        char materno_mayus = Character.toUpperCase(letra_materno);

        System.out.print("Tu nombre completo es: ");
        System.out.println(nombre_mayus + paterno_mayus + apellido_paterno.substring(1,apellido_paterno.length()).toLowerCase() + " " + materno_mayus + apellido_materno.substring(1,apellido_materno.length()).toLowerCase());
    }
}
