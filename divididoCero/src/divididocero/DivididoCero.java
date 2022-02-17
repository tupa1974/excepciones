package divididocero;

import java.util.Scanner;

public class DivididoCero {

    /*
     Realizar un programa que permita el ingreso de dos números por teclado para
     ser divididos entre sí. Tomar como precaución la utilización del try y el
     catch por si el segundo número ingresado para dividir se trata de un cero.
     Mostrar un mensaje adecuado en caso de que se produzca la excepción.
     */
    public static void main(String[] args) {

        int num1, num2;
        double resultado;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el dividendo: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el divisor: ");
        num2 = teclado.nextInt();

        try {
            resultado = num1 / num2;

            System.out.println("El resultado es " + resultado);

        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("\nNo se puede dividir por cero.");
        }

    }

}
