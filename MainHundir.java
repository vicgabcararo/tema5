/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MainHundir {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ////////////////////////////////////////////////////
        System.out.println("Tablero de cuántos cuadros: ");

        int casillas = sc.nextInt();
        sc.nextLine();

        HundirFlota juego = new HundirFlota(casillas);

        /////////////////////////////////////////////////////
        System.out.println("Poner barcos: ");

        int fila, columna, i = 1;
        String salir = "";

        do {
            System.out.println("Pos. barco " + i);

            fila = sc.nextInt();
            sc.nextLine();
            columna = sc.nextInt();
            sc.nextLine();

            juego.addBarco(fila, columna);

            System.out.println("¿Salir?");
            salir = sc.nextLine();

            i++;
        } while (salir.equals("si") == false);

        System.out.println("Saliendo de posicionamiento de barcos...\nAsí están los barcos: \n0 es agua\n1 es un barco\n");
        juego.mostrarTablero();

        ///////////////////////////////////////////////////////////
        System.out.println("Disparos aleatorios 5: ");

        Random rd = new Random();

        System.out.println("Se ha disparado 5 veces y el tablero queda así: \n0 es agua\n1 es un barco\n9 es un disparo\n");

        int ale1 = rd.nextInt(casillas), ale2 = rd.nextInt(casillas);
        
        juego.disparo(ale1, ale2);
        ale1 = rd.nextInt(casillas);
        ale2 = rd.nextInt(casillas);
        
        juego.disparo(ale1, ale2);
        ale1 = rd.nextInt(casillas);
        ale2 = rd.nextInt(casillas);
        
        juego.disparo(ale1, ale2);
        ale1 = rd.nextInt(casillas);
        ale2 = rd.nextInt(casillas);
        
        juego.disparo(ale1, ale2);
        ale1 = rd.nextInt(casillas);
        ale2 = rd.nextInt(casillas);
        
        juego.disparo(ale1, ale2);

        System.out.println("");

        juego.mostrarTablero();
        
        
        
        

    }
}
