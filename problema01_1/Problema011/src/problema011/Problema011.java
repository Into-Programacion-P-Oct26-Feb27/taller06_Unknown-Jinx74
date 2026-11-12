/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema011;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema011 {

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
            if (operacion.equalsIgnoreCase("Suma")) {
                total = num1 + num2;
                System.out.printf("%.2f\n", total);
            } else {
                if (operacion.equalsIgnoreCase("Resta")) {
                    total = num1 - num2;
                    System.out.printf("%.2f\n", total);
                } else {
                    if (operacion.equalsIgnoreCase("Multiplicacion")) {
                        total = num1 * num2;
                        System.out.printf("%.2f\n", total);
                    } else {
                        if (operacion.equalsIgnoreCase("Division")) {
                            total = num1 / num2;
                            System.out.printf("%.2f\n", total);
                        } else {
                            if (operacion.equalsIgnoreCase("Modulo")) {
                                total = num1 % num2;
                                System.out.printf("%.2f\n", total);
                            } else {
                                if (operacion.equalsIgnoreCase("Potencia")) {
                                    total = Math.pow(num1, num2);
                                    System.out.printf("%.2f\n", total);
                                } else {
                                    System.out.println("Operación no válida");
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("El primer número debe ser mayor que el segundo");
        }
        
    }
    
}
