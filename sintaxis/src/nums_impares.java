import java.util.*;

public class nums_impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero positivo: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i%2 !=0) {
                System.out.print(i + " ,");
            }
        }
    }
}
