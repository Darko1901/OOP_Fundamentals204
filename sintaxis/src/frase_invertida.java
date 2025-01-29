import java.util.*;

public class frase_invertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        String frase = sc.nextLine();

        StringBuilder stringBuilder = new StringBuilder(frase);
        String string_inv = stringBuilder.reverse().toString();
        System.out.println("Frase invertida: " + string_inv);
    }
}
