import java.util.*;

public class contrasenia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contra = "hola123";

        System.out.println("Introduce la contraseña: ");
        String contra_vaildate = sc.nextLine();

        if(contra_vaildate.equals(contra)){
            System.out.println("Contraseña correcta");
        }else{
            System.out.println("Contraseña incorrecta");
        }
    }
}
