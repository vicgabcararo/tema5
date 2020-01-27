/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class HundirFlota {

    private int dimensiones;
    private int[][] array;

    public HundirFlota(int num) {
        this.dimensiones = num;
        array = new int[num][num];
    }

    public int[][] oceano() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = 0;
            }
        }
        return array;
    }

    public void mostrarTablero() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void addBarco(int fila, int columna) {
        int inicial = 1;
        this.array[fila][columna] = inicial;
    }
    
    public void addBarcoIa(int fila, int columna) {
        int inicial = 2;
        this.array[fila][columna] = inicial;
    }

    public void deleteBarco(int fila, int columna) {
        if (this.array[fila][columna] != 0) {
            this.array[fila][columna] = 0;
        } else {
            System.out.println("No hay un barco en [" + fila + "," + columna + "]");
        }
    }

    public void disparo(int fila, int columna) {
        if (this.array[fila][columna] == 1) {
            this.array[fila][columna] = 9;
            System.out.println("Barco alcanzado en [" + fila + "," + columna + "]");
        } else {
            this.array[fila][columna] = 9;
            System.out.println("No hay un barco en [" + fila + "," + columna + "]");
        }
    }
    
    public void disparoTuyo(int fila, int columna) {
        if (this.array[fila][columna] == 1) {
            this.array[fila][columna] = 8;
            System.out.println("Barco alcanzado en [" + fila + "," + columna + "]");
        } else {
            this.array[fila][columna] = 8;
            System.out.println("No hay un barco en [" + fila + "," + columna + "]");
        }
    }

    public int disparoAle(int fila, int columna) {
        this.array[fila][columna] = 9;
        return 1;
    }

}
