import java.util.*;

public class nums_reversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero entero positivo: ");
        int n = sc.nextInt();
        
        for (int i = n; i >= 0; i--) {
            if (i >= 0) {
                System.out.print(i + " ,");
            }
        }
    }
}
