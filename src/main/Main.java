package main;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){

      Scanner teclado = new Scanner(System.in);

        System.out.println("Listado de Numeros");

        int numero;
        int i;

        System.out.println("Ingrese un numero:");
        numero = teclado.nextInt();

        for(i = 1; i <= numero; i++){

            System.out.println(i);
        }

    }
}
