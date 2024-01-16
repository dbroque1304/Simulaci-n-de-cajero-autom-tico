package org.iesvdm;
// Código del Cajero v1
import java.util.Scanner;

public class CajeroV1 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double saldo = 1000.00;
        int opcion;

        do {
            System.out.println("1- Retirar fondos");
            System.out.println("2- Ingresar fondos");
            System.out.println("0- Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    saldo = retiradaFondos(saldo);
                    break;
                case 2:
                    saldo = saldo + ingresoFondos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    }
    public static double retiradaFondos(double saldo){
        System.out.println("¿Cuánto quieres retirar?");
        double retirado = sc.nextDouble();
        if(saldo > retirado){
            System.out.println("Se han retirado " + (retirado) + " quedan " + (saldo - retirado) + "€ en la cuenta");
            return saldo - retirado;
        } else {
            System.out.println("Error, no puedes retirar más dinero del que hay en la cuenta");
            return saldo;
        }
    }

    public static double ingresoFondos(){
        System.out.println("¿Cuánto dinero quieres ingresar?");
        return sc.nextDouble();
    }
}