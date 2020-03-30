package hpr.logic;

import java.util.Scanner;

/**
 *
 * @author humbe
 */
public class Arreglos {

    /*
    Metodo donde los arreglos ya estan definidos y se multiplican de forma 
    diagonal ejemplo: Posicion 0 * Posicion 9, Posicion 1 * Posicion 8 ...
     */
    public void arregloDefinido() {
        int[] arreglo1 = new int[10];
        arreglo1[0] = 1;
        arreglo1[1] = 2;
        arreglo1[2] = 3;
        arreglo1[3] = 4;
        arreglo1[4] = 5;
        arreglo1[5] = 6;
        arreglo1[6] = 7;
        arreglo1[7] = 8;
        arreglo1[8] = 9;
        arreglo1[9] = 10;

        int[] arreglo2 = new int[10];
        arreglo2[0] = 10;
        arreglo2[1] = 9;
        arreglo2[2] = 8;
        arreglo2[3] = 7;
        arreglo2[4] = 6;
        arreglo2[5] = 5;
        arreglo2[6] = 4;
        arreglo2[7] = 3;
        arreglo2[8] = 2;
        arreglo2[9] = 1;

        System.out.println("\n La multiplicacion de los arreglos es:");
        int n = 9;
        for (int i = 0; i < 10; i++) {
            System.out.println(arreglo1[i] + "*" + arreglo2[n] + "= " + (arreglo1[i] * arreglo2[n]));
            n--;
        }
    }

    /*
    Metodo donde hay que llenar los arreglos con los valores deseados y se 
    multiplican de forma diagonal ejemplo: Posicion 0 * Posicion 9, 
    Posicion 1 * Posicion 8 ...
     */
    public void arregloArmado() {
        Scanner in = new Scanner(System.in);
        int[] arreglo1 = new int[10];
        int[] arreglo2 = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Favor de ingresar un numero para arreglo1, en el campo " + i + ": ");
            arreglo1[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Favor de ingresar un numero para el arreglo2, en campo " + i + ": ");
            arreglo2[i] = in.nextInt();
        }

        System.out.println("\n La multiplicacion de los arreglos es:");
        int n = 9;
        for (int i = 0; i < 10; i++) {
            System.out.println(arreglo1[i] + "*" + arreglo2[n] + "= " + (arreglo1[i] * arreglo2[n]));
            n--;
        }

    }

    /*
    Metodo donde hay que llenar los arreglos con los valores deseados y se 
    multiplican de forma diagonal ejemplo: Posicion 0 * Posicion 9, 
    Posicion 1 * Posicion 8 pero se almacenan en otro arreglo
     */
    public void arregloArmadoAlmacenado() {
        Scanner in = new Scanner(System.in);
        int[] arreglo1 = new int[10];
        int[] arreglo2 = new int[10];
        int[] almacen = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Favor de ingresar un numero para arreglo1, en el campo " + i + ": ");
            arreglo1[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Favor de ingresar un numero para el arreglo2, en campo " + i + ": ");
            arreglo2[i] = in.nextInt();
        }

        int j = 9;
        for (int i = 0; i < 10; i++) {
            almacen[i] = arreglo1[i] * arreglo2[j];
            j--;
        }

        System.out.println("Imprimiendo Arrelo Almacen!");
        for (int i : almacen) {
            System.out.println(i);
        }

    }

}
