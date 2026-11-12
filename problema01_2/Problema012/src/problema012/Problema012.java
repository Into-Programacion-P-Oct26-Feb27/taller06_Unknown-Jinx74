/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema012;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double num1;
        double num2;
        double total;
        String operacion;

        System.out.println("Ingrese el primer numero");
        num1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo número");
        num2 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Elija la operación que quiere realizar");
        operacion = entrada.nextLine();

        if (num1 > num2) {
            switch (operacion) {
                case "suma":
                    total = num1 + num2;
                    System.out.printf("%.2f\n", total);
                case "resta":
                    total = num1 - num2;
                    System.out.printf("%.2f\n", total);
                case "multiplicacion":
                    total = num1 * num2;
                    System.out.printf("%.2f\n", total);
                case "division":
                    total = num1 / num2;
                    System.out.printf("%.2f\n", total);
                case "modulo":
                    total = num1 % num2;
                    System.out.printf("%.2f\n", total);
                case "potencia":
                    total = Math.pow(num1, num2);
                    System.out.printf("%.2f\n", total);
                default:
                    System.out.println("num 1 debe ser mayor que num2");
            }
        }
    }

}
