import jdk.jshell.execution.Util;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU D'EXERCICIS" +
                "1. Mostrar els primers 20 numeros naturals. \n" +
                "2.Mostrar numeros pares entre el 1 y el 200.\n" +
                "3. Mostrar numeros entre 1 y 200.\n" +
                "4. Mostrar numeros desde 1 hasta N.\n" +
                "5. Mostrar el factorial de N.\n" +
                "6. Indicar si alguno de los numeros introducidos son nulos o no nulos.\n" +
                "7. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje" +
                " indicando cuántos son positivos y cuantos negativos\n" +
                "8. Realiza un programa que lea una secuencia de números no nulos hasta que se" +
                " introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos" +
                " positivos y cuantos negativos.\n" +
                "9. Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros" +
                " números naturales\n" +
                "10. Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10)" +
                " que termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.\n" +
                "11. Realiza un programa que sume independientemente los pares y los impares de los" +
                " números comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.\n" +
                "12. Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso del" +
                " operador de potencia (^), siendo A y B valores introducidos por teclado, y luego" +
                " muestre el resultado por pantalla.\n" +
                "13. Realiza un programa donde el usuario \"piensa\" un número del 1 al 100 y el" +
                " ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números una y" +
                " otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si es mayor," +
                " menor o igual al número que ha pensado).\n" +
                "14. Realiza un programa que dada una cantidad de euros que el usuario introduce por" +
                " teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para" +
                " alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que" +
                " indicar el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el" +
                " programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete" +
                " de 5 € (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el\n" +
                " mínimo número de billetes posible).\n" +
                "15. Salir.\n");


        int opcion = sc.nextInt();
        switch (opcion) {
            case 1 -> exercici1(sc);

            case 2 -> exercici2(sc);

            case 3 -> exercici3(sc);

            case 4 -> exercici4(sc);

            case 5 -> exercici5(sc);

            case 6 -> exercici6(sc);

            case 7 -> exercici7();

            case 8 -> exercici8();

            case 9 -> exercici9(sc);

            case 10 -> exercici10(sc);

            case 11 -> exercici11(sc);

            case 12 -> exercici12(sc);

            case 13 -> exercici13(sc);

            case 14 -> exercici14(sc);

            //case 15 -> break;
        }
    }

    public static void exercici1(Scanner sc) {
        //1. Realiza un programa que muestre por pantalla los 20 primeros números naturales
        //(1, 2, 3... 20).
        for (int i = 0; i <= 20; i++) {
            System.out.print(i);
        }
    }

    public static void exercici2(Scanner sc) {
        /*2. Realiza un programa que muestre los números pares comprendidos entre el 1 y el
        200. Para ello utiliza un contador y suma de 2 en 2.*/

        for (int i = 0; i <= 200; i += 2) {
            System.out.print(i);
        }
    }

    public static void exercici3(Scanner sc) {
        /*3. Realiza un programa que muestre los números pares comprendidos entre el 1 y el
        200. Esta vez utiliza un contador sumando de 1 en 1. */
        int contadorPar = 0;
        for (int i = 0; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                contadorPar++;
            }
        }
    }

    public static void exercici4(Scanner sc) {
       /* 4. Realiza un programa que muestre los números desde el 1 hasta un número N que se
        introducirá por teclado.*/
        int n;
        n = Utils.validaInt("Introdueix un valor: ");

        for (int i = 0; i <= n; i++) {
            System.out.print(i);
        }
    }

    public static void exercici5(Scanner sc) {
        /*5. Realiza un programa que lea un número positivo N y calcule y visualice su factorial
        N!
        Siendo el factorial:
        0! = 1
        1! = 1
        2! = 2 * 1
        3! = 3 * 2* 1
        N! = N * (N-1) * (N-2)........* 3*2*1
        */

        int n = 0;

        do {
            n = Utils.validaInt("Introdueix un número positiu: ");
        } while (n < 0);

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(n + "! = " + factorial);
    }

    public static void exercici6(Scanner sc) {
        /*6. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si
        ha leído algún número negativo o no.*/
        int contadorNeg = 0;
        int num;
        for (int i = 0; i <= 10; i++) {
            num = Utils.validaInt("Introdueix un numero: ");
            if (num < 0) {
                contadorNeg++;
            }
        }
        System.out.println("El numero de negatius es: " + contadorNeg);
    }

    public static void exercici7() {
        /*7. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
        indicando cuántos son positivos y cuantos negativos. */
        int num;
        int contadorNeg = 0;
        int contadorPos = 0;

        for (int i = 0; i <= 10; i++) {
            num = Utils.validaInt("Introdueix un numero: ");
            if (num < 0) {
                contadorNeg++;
            } else {
                contadorPos++;
            }
        }

    }

    public static void exercici8() {
    /*8. Realiza un programa que lea una secuencia de números no nulos hasta que se
    introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos
    positivos y cuantos negativos.*/
        int num, contadorNeg = 0, contadorPos = 0;

        do {
            num = Utils.validaInt("Introdueix un numero:");
            if (num < 0) {
                contadorNeg++;
            } else if (num > 0){
                contadorPos++;
            }
        } while (num == 0);

        if (contadorPos > 0) System.out.println("Ha leído " + contadorPos + " números positivos.");
        if (contadorNeg > 0) System.out.println("Ha leído " + contadorNeg + " números negativos.");
    }

    public static void exercici9(Scanner sc) {
    /*9. Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros
    números naturales*/
        int suma = 0;
        int producte = 1;

        for (int i = 1; i <= 10; i++) {
            suma = suma + i;
            producte = producte * i;
        }
        System.out.println("El valor de la suma es: " + suma + ". " + "El valor del producte: " + producte + ". ");
    }

    public static void exercici10(Scanner sc) {
    /*10. Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10)
    que termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.    */

        int nota;
        int contadorDiez = 0;

        do {
            nota = Utils.validaInt("Introdueix la teua nota:");
            if (nota >= 0 && nota <= 10) {
                if (nota == 10) {
                    contadorDiez++;
                }
            } else {
                System.out.print("Error, la nota no es valida. Introduix-la de nou:");
            }
        } while (nota != -1);

        System.out.println("El numero de 10 que has tret és: " + contadorDiez);
    }

    public static void exercici11(Scanner sc) {
    /*11. Realiza un programa que sume independientemente los pares y los impares de los
    números comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.*/
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0) {
                sumaPares = i++;
            } else {
                sumaImpares = i++;
            }
        }
        System.out.println("El valor de la suma dels numeros par es: " + sumaPares);
        System.out.println("El valor de la suma dels numeros impars es: " + sumaImpares);
    }

    public static void exercici12(Scanner sc) {
        /*12. Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso del
    operador de potencia (^), siendo A y B valores introducidos por teclado, y luego
    muestre el resultado por pantalla.*/
        int A = 0;
        int B = 0;
        int a = 1;
        int num = 0;

        A = Utils.validaInt("Introdueix un numero: ");
        B = Utils.validaInt("Introdueix altre numero: ");

        do {
            a = a * A;
            num++;
        } while (num != B);

        System.out.println("El valor final de la");
    }

    public static void exercici13(Scanner sc) {
        /*13. Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el
        ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números una y
        otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si es mayor,
        menor o igual al número que ha pensado).*/

        int min = 1;
        int max = 100;
        int respuesta = 0;

        System.out.println("Pensa un número de l'1 al 100.");

        do {
            int intento = (min + max) / 2;
            System.out.println("És el " + intento + "?");

            do {
                respuesta = Utils.validaInt("Indica: 1 si el teu número és major, 2 si és menor, 3 si he encertat: ");
            } while (respuesta < 1 || respuesta > 3);

            if (respuesta == 1) {
                min = intento + 1;
            } else if (respuesta == 2) {
                max = intento - 1;
            } else {
                System.out.println("He encertat el teu número!");
            }
        } while (respuesta != 3 && min <= max);

    }

    public static void exercici14(Scanner sc) {
        /*14. Realiza un programa que dada una cantidad de euros que el usuario introduce por
    teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para
    alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que
    indicar el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el
    programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete
    de 5 € (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el
    mínimo número de billetes posible).*/

        int cantidad = 0;

        do {
            cantidad = Utils.validaInt("Introdueix una quantitat en euros (múltiple de 5): ");
        } while (cantidad <= 0 || cantidad % 5 != 0);

        int[] billetes = {500, 200, 100, 50, 20, 10, 5};

        for (int i = 0; i < billetes.length; i++) {
            int numBilletes = cantidad / billetes[i];
            if (numBilletes > 0) {
                if (numBilletes == 1) {
                    System.out.println(numBilletes + " bitllet de " + billetes[i] + " €");
                } else {
                    System.out.println(numBilletes + " bitllets de " + billetes[i] + " €");
                }
                cantidad = cantidad % billetes[i];
            }
        }
    }
}