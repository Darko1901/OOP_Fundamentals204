import java.util.*;

public class n_letras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce solo tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("<" + nombre.toUpperCase() + "> tiene " + nombre.length() + " letras");
    }
}
