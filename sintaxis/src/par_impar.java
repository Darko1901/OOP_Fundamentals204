import java.util.*;

public class par_impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero entero: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Tu numero es par");
        }else{
            System.out.println("Tu numero es impar");
        }
    }
}
