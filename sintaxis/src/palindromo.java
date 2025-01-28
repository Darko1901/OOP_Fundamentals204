import java.util.*;

public class palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una palabra: ");
        String cadena = sc.nextLine();

        cadena = cadena.toLowerCase(); //Hago esto para que compare la cadena en minuscula

        String invertida = new StringBuilder(cadena).reverse().toString();

        if (invertida.equals(cadena)) {
            System.out.println("Tu palabra es un palindromo");
        }else{
            System.out.println("Tu palabra NO es palindromo");
        }

    }
}
