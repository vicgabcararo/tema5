/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class MainJuegoFlota {
    public static void main(String[] args) {
        
        
        HundirLaFlotaClases juego = new HundirLaFlotaClases();
        
        int eleccion;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("1) Colocar barcos\n2) Disparar\n3) Ver tablero\n4) Salir del juego.");
            eleccion=sc.nextInt();sc.nextLine();
            switch(eleccion){
                case 1:
                    juego.addBarcos();
                    System.out.println("");
                    juego.ordenadorAddBarco();
                    System.out.println("");
                    break;
                case 2:
                    juego.disparar();
                    System.out.println("");
                    juego.ordenadorDisparo();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("El tablero es de 10 y está así; ");
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
