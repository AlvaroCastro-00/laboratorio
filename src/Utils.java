import java.util.Scanner;

public class Utils {
    static Scanner sc = new Scanner (System.in);

    public static double validaDouble(String mensaje){
        System.out.print(mensaje);
        while (!sc.hasNextDouble()){
            System.out.print("Eso no es un número! Introduce otro: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    public static String validaString(String mensaje){
        System.out.println(mensaje);
        return sc.nextLine();
    }

    public static int validaInt(String mensaje){
        System.out.println(mensaje);
        while (!sc.hasNextInt()){
            System.out.println("Eso no es un número!");
            sc.next();
        }
        return sc.nextInt();
    }
}
