//jhonatan Vanegas
//16/03/2021

package com.mycompany.measuretime;

import java.util.Scanner;

public class AnalisisEmpirico {

    static int numeroDeIteraciones, total = 0, suma = 0;
    static Scanner leer = new Scanner(System.in);
    static int SumaRecursivaDeNaM;
    static int halfNum = 0;
    public static String op = "";
    public static boolean salir = false;

    public static void main(String[] args) {
        int inicio, fin;
        System.out.println("Ingrese un numero para hacer de las operaciones\n"
                + "1. para hacerlo de forma iterativa\n"
                + "2. para hacerlo de forma recursiva\n"
                + "3. para salir");
        op = leer.next();
        do {
            switch (op) {
                case "1": {
                    InterativeWay();
                    break;
                }
                case "2": {
                    inicio = 1;
                    fin = 50;
                    System.out.println("La suma recursiva de " + inicio + " hasta " + fin + " es " + SumOfInt(inicio, fin));
                    System.out.println("Comprobación con la fórmula: n * (n+1) / 2 vale " + fin * (fin + 1) / 2);
                    break;
                }
                case "3": {
                    salir = true;
                    System.out.println("Has salido del programa1"
                            + "");
                    break;
                }
                default:
                    System.out.println("Error!,solo 1 o 2 o 3");
                    break;

            }
        } while (salir == true);
    }

    public static void InterativeWay() {

        System.out.println("Ingrese el numero de iteaciones");
        numeroDeIteraciones = leer.nextInt();
        for (int i = 0; i < numeroDeIteraciones; i++) {
            System.out.println("Ingrese un numero a sumar:");
            suma = leer.nextInt();
            total += suma;

        }
        System.out.println("la suma de 1 hasta n numero es: " + total);

    }

    public static int SumOfInt(int n, int m) {

        if (n == m) {
            return m;
        }
        return n + SumOfInt(n + 1, m);
    }
}
