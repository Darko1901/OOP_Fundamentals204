package Examen_Primer_Parcial;

import java.util.*;
public class ej2 {
    public static void main(String[] args) {
        System.out.println("Ingresa cualquier número entero: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Usé un while en vez de el For para que se pueda ver el 1 al final
        while(n != 1){
            if(n % 2 == 0){
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
            System.out.print(n + " ,");
        }
    }
}
