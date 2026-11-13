/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String name;
        String tipoEmpleado;
        double servicio;
        double sueldoInit;
        double porcentaje = 0.15;
        double incremento;
        double bono = 0;
        double total;

        System.out.println("Introduzca su nombre:");
        name = entrada.nextLine();
        System.out.println("Introduzca el tipo de empleado (1, 2, 3, 4, 5)");
        tipoEmpleado = entrada.nextLine();
        System.out.println("Introduzca los años de servicio:");
        servicio = entrada.nextDouble();
        System.out.println("Introduzca su sueldo actual:");
        sueldoInit = entrada.nextDouble();

        switch (tipoEmpleado) {

            case "1":
                porcentaje = 0.05;
                break;

            case "2":
                porcentaje = 0.07;
                break;

            case "3":
                porcentaje = 0.09;
                break;

            case "4":
                porcentaje = 0.12;
                break;

            case "5":
                porcentaje = 0.15;
                break;

            default:
                porcentaje = 0.15;
                break;
        }

        if (servicio > 0 && servicio < 100) {
            if (servicio < 2) {
                bono = 0;
            } else if (servicio < 5) {
                bono = 30;
            } else if (servicio < 10) {
                bono = 60;
            } else if (servicio > 10) {
                bono = 100;
            }
        }

        incremento = (sueldoInit * porcentaje);
        total = (sueldoInit + incremento + bono);

        System.out.printf("REPORTE DE INCREMENTO SALARIAL\n"
                + "\n"
                + "Empleado: %s\n"
                + "Tipo de empleado: %s\n"
                + "Años de servicio: %.0f\n"
                + "\n"
                + "Sueldo inicial: $%.2f\n"
                + "Porcentaje de incremento: %.0f%%\n"
                + "Incremento salarial: $%.2f\n"
                + "Bonificación por antigüedad: $%.2f\n"
                + "\n"
                + "Nuevo sueldo: $%.2f", name, tipoEmpleado, servicio,
                sueldoInit, (porcentaje*100), incremento, bono, total);
    }

}
