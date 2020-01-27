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
public class MainHundir2 {
    //CREADO CON LA IDEA DE HACER OTRA FORMA DE JUGAR.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        System.out.println("¿Tablero?");
        
        int num = sc.nextInt();sc.nextLine();
        
        HundirFlota juego2 = new HundirFlota(num);
        
        System.out.println("Tablero de "+num);
        
        juego2.mostrarTablero();
        
       String salir="";
        int fila, columna;
        
        do{
            System.out.println("Jugador 1\nColoca barco: ");
            fila = sc.nextInt();sc.nextLine();
            columna = sc.nextInt();sc.nextLine();
            juego2.addBarco(fila, columna);
            System.out.println("Disparo aleatorio");
            juego2.disparo(rd.nextInt(num), rd.nextInt(num));
            juego2.mostrarTablero();
            
            System.out.println("¿Salir?");
            salir = sc.nextLine();
            
        }while(salir.equals("salir")==false);
        
        
        
    }
}
