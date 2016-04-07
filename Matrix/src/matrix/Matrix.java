/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import javax.swing.JOptionPane;

/**
 *
 * @author eveR
 */
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaraciones de variables
        String tamanio_str = null;
        int tamanio;
        int SUM = 0;
        int A[][];
        int B[][];
        int C[][];

        //validacion de nulo
        while (tamanio_str == null) {
            tamanio_str = JOptionPane
                    .showInputDialog("Ingrese el tamaño de las matrices a multiplicar");
        }

        //parse de string a integer
        tamanio = Integer.parseInt(tamanio_str);

        //creacion de matrices
        A = new int[tamanio][tamanio];
        B = new int[tamanio][tamanio];
        C = new int[tamanio][tamanio];

        //recuperar filas y columnas
        int filas = A.length;
        int columnas = A[0].length;

        // llenar matriz
        A = fillMatriz(filas, columnas);
        B = fillMatriz(filas, columnas);

        //algoritmo
        for (int i = 0; i < filas; i++) {

            for (int k = 0; k < columnas; k++) {
                SUM = 0;
                for (int z = 0; z < tamanio; z++) {
                    SUM = A[i][z] * B[z][k] + SUM;
                }
                C[i][k] = SUM;
//                SUM = 0;
            }
        }

        //mostrar
        showMatriz(C);
//        showMatriz(B);
    }

    public static int[][] fillMatriz(int filas, int columnas) {
        int A[][] = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int num = Integer.parseInt(JOptionPane
                        .showInputDialog("Ingrese numero de la matriz A[" + i + "][" + j + "]"));
                A[i][j] = num;
                System.out.println(num + "");
            }
        }
        return A;
    }

    public static void showMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                JOptionPane.showMessageDialog(null, "dato guardado en la posicion A[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }
    }
}
