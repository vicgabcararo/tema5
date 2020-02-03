/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class Tablero {

    private Barco[][] tablero; // null es agua
    private int[][] mostrarTablero;

    private final int DESCONOCIDO = 0;
    private final int BARCO = 1;
    private final int AGUA = 2;

    public void crearTablero(int size) {

        this.tablero = new Barco[size][size];
        this.mostrarTablero = new int[size][size];
    }

    public void mostrarTablero() {

        System.out.print("  ");
        for (char letra = '1'; letra < ('1' + this.tablero.length); letra++) {
            System.out.print(letra + " ");
        }
        System.out.println("");

        char letra = 'A';
        for (int i = 0; i < this.mostrarTablero.length; i++) {
            System.out.print(letra + " ");
            for (int j = 0; j < this.mostrarTablero[0].length; j++) {
                switch (this.mostrarTablero[i][j]) {
                    case DESCONOCIDO:
                        System.out.print("~ ");
                        break;
                    case BARCO:
                        System.out.print("X ");
                        break;
                    case AGUA:
                        System.out.print("A ");
                        break;
                }

            }
            System.out.println("");
            letra++;
        }

    }
}

