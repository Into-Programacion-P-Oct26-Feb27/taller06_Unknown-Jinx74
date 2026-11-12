/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String name;
        double avaluo;
        double base = 0;
        double porcentaje;
        String tipo;
        String tipoprint = "";
        double recargo = 0;
        double total = 0;
        boolean valido = true;

        System.out.println("Introduzca el nombre del titular");
        name = entrada.nextLine();

        System.out.println("Introduzca el tipo de vehiculo (1, 2, 3 o 4)");
        tipo = entrada.nextLine();

        System.out.println("Introduzca el avalúo de su vehiculo");
        avaluo = entrada.nextDouble();
        entrada.nextLine();

        switch (tipo) {
            case "1":
                tipoprint = "Vehículo liviano particular";
                porcentaje = 0.0001;
                base = 2 + (avaluo * porcentaje);
                if (avaluo > 30000) {
                    recargo = 1.50;
                }
                total = base + recargo;
                break;

            case "2":
                tipoprint = "Vehículo grande particular";
                porcentaje = 0.0002;
                base = 2.5 + (avaluo * porcentaje);
                if (avaluo > 30000) {
                    recargo = 1.50;
                }
                total = base + recargo;
                break;

            case "3":
                tipoprint = "Taxi";
                porcentaje = 0.0004;
                base = 1.5 + (avaluo * porcentaje);
                total = base;
                break;

            case "4":
                tipoprint = "Bus urbano";
                porcentaje = 0.0005;
                base = 2.2 + (avaluo * porcentaje);
                total = base;
                break;

            default:
                System.out.println("Tipo de vehículo no válido.");
                valido = false;
                break;
        }

        if (valido) {
            System.out.printf("Peaje \"Buena Vía\"\n"
                    + "Propietario: %s\n"
                    + "Tipo: %s\n"
                    + "    Avalúo: $%.2f\n"
                    + "    Valor base del peaje: $%.2f\n"
                    + "    Recargo: $%.2f\n"
                    + "\n"
                    + "    Total a cancelar: $%.2f\n", name, tipoprint, avaluo, base,
                    recargo, total);
        }
    }

}
