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
        int fila, columna, disp1, disp2;
        
        do{
            System.out.println("Jugador 1\nColoca barco: ");
            fila = sc.nextInt();sc.nextLine();
            columna = sc.nextInt();sc.nextLine();
            juego2.addBarco(fila, columna);
            
            System.out.println("La IA pone barco");
            juego2.addBarcoIa(rd.nextInt(num), rd.nextInt(num));
            
            System.out.println("Jugador dispara");
            disp1 = sc.nextInt();sc.nextLine();
            disp2 = sc.nextInt();sc.nextLine();
            juego2.disparoTuyo(disp1, disp2);
            
            System.out.println("Disparo aleatorio de la IA");
            juego2.disparo(rd.nextInt(num), rd.nextInt(num));
            
            System.out.println("0 es agua\n1 es tu barco\n2 es barco de la IA\n9 son disparos de la IA\n8 son disparos tuyos\n");
            juego2.mostrarTablero();
            
            System.out.println("¿Salir?");
            salir = sc.nextLine();
            
        }while(salir.equals("salir")==false);
        
        
        
    }
}
