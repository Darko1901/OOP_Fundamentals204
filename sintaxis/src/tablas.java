import java.util.*;

public class tablas {
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tabla;

        for (int i = 1; i <= 10; i++) {
            tabla = n * i;
            System.out.println(n + " x " + i + " = " + tabla);
        }
    }
}
