/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class HundirLaFlotaClases {

    private int[][] array;

    public HundirLaFlotaClases() {
        array = new int[10][10];
    }

    public void mostrarTablero() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(" "+array[i][j] + " ");

            }
            System.out.println("");
        }
    }

    public void addBarcos() {
        System.out.println("Se colocará un 1 como barco insertado.");
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("En X: ");
        x = sc.nextInt();
        sc.nextLine();
        System.out.println("En Y: ");
        y = sc.nextInt();
        sc.nextLine();

        if (array[x][y] == 1) {
            System.out.println("Ya hay un barco en esta posición.");
        } else {
            this.array[x][y] = 1;
        }

    }

    public void ordenadorAddBarco() {
        System.out.println("Se ha posicionado un barco enemigo.");
        Random rd = new Random();
        this.array[rd.nextInt(10)][rd.nextInt(10)] = 2;

    }
    
    public void disparar(){
        System.out.println("El número 8 representa tu disparo.");
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("En X: ");
        x = sc.nextInt();
        sc.nextLine();
        System.out.println("En Y: ");
        y = sc.nextInt();
        sc.nextLine();
        this.array[x][y]=8;
    }
    
    public void ordenadorDisparo() {
        System.out.println("El enemigo ha disparado. Saldrá con un 9.");
        Random rd = new Random();
        this.array[rd.nextInt(10)][rd.nextInt(10)] = 9;

    }

}
