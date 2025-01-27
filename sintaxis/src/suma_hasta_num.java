import java.util.*;

public class suma_hasta_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero x: ");

        int x = sc.nextInt();
        int suma = 1;

        for (int i = 2; i <= x; i++) {
            suma = suma + i;
        }
        System.out.println("Suma de todos los numeros desde 1 hasta: " + x + " = " + suma);
    }
}
