/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Scanner;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MainJuegoBrutal {
    public static void main(String[] args) {
        
        Tablero juego = new Tablero();
        Barco barco = new Barco();
        Disparo disparo = new Disparo();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿De cuánto es el tablero?");
        int dimensiones = sc.nextInt();
        juego.crearTablero(dimensiones);
        
        int eleccion,x,y;
        
        do{
            System.out.println("1) Colocar barcos\n2) Disparar\n3) Ver tablero\n4) Salir del juego.");
            eleccion=sc.nextInt();sc.nextLine();
            switch(eleccion){
                case 1:
                    System.out.println("Para X: ");
                    x = sc.nextInt();
                    System.out.println("Para Y: ");
                    y = sc.nextInt();
                    barco.posicion(x, y);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Para X: ");
                    x = sc.nextInt();
                    System.out.println("Para Y: ");
                    y = sc.nextInt();
                    disparo.disparo(x, y);
                    System.out.println("");
                    break;
                case 3:
                    juego.mostrarTablero();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Saliendo del juego...");
                    break;
                default:
                    System.out.println("No hay "+eleccion+" elecciones.");
                    break;
            }
            
        }while(eleccion!=4);
        
        
    }
}
