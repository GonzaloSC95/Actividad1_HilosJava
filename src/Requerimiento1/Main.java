package Requerimiento1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Programa que pide 4 números por pantalla y determinará cuál de ellos es primo y cual no
        //4 objetos de tipo Numero
        //Numero n1, n2, n3, n4;
        ArrayList<Numero> numeros = new ArrayList<>();
        //4 variables de tipo int para asignarselas al los objetos Numero
        int[] valorNum = new int[4];
        //Variable de tipo boolean para controlar el bucle de excepciones
        boolean repetir;
        //Objeto Scanner para introducir valores por teclado
        Scanner tc = new Scanner(System.in);
        //-----------INTRODUCIMOS DATOS POR TECLADO Y CONTROLAMOS EXCEPCIONES----------------
        for (int i = 0; i < valorNum.length; i++) {
            do {
                repetir = false;
                try {
                    System.out.print("Introduce el " + (i + 1) + "º número entero: ");
                    valorNum[i] = tc.nextInt();

                } catch (InputMismatchException e) {
                    System.err.println("\nERROR: Valor no válido, debes introducir un número entero :(\n");
                    tc.nextLine();
                    repetir = true;
                }
            } while (repetir);
        }
        //Insertamos los números introducidos por teclado en 4 objetos Número, que guardaremos en un arrayList
        for (int i = 0; i < valorNum.length; i++) {
            numeros.add(new Numero(valorNum[i]));
        }
        //---------------------------------------------------------------------------

        //---------------------------------------------------------------------------
        System.out.println("\n////////////////RESULTADO/////////////////////////\n");
        //-------ARRANCAMOS LOS 4 HILOS--------
        for (Numero n : numeros) {
            //System.out.println(n.toString());
            n.start();
        }
        //------------FIN-------------------------
    }

}
