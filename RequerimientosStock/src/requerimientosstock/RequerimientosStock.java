/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requerimientosstock;

/**
 *
 * @author eveR
 */
public class RequerimientosStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        stock productos = K[15] => int
        pedidos = Z[15] =>int
        respuesta => C[15]
        
        enunciados:
        1. K==Z then C=K
        2. Z>K  then C= 2(Z-K)
        3. K>Z  then C=Z
        
        tareas:
        1. declarar nuestras variables
            int Z[], K[], C[];
        2. instanciar variables
            int K = new int[15]{1,3,5,2,4,5,6,8,9,11,21,23,12,32,15};
            int Z = new int[15]{1,1,10,30,4,3,7,8,11,3,10,25,12,16,19};
            int C = new int[15];
        
        3. bucles
         */
        int C[];
        int[] K = {1, 3, 5, 2, 4, 5, 6, 8, 9, 11, 21, 23, 12, 32, 15};
        int[] Z = {1, 1, 10, 30, 4, 3, 7, 8, 11, 3, 10, 25, 12, 16, 19};
        C = new int[15];

        for (int i = 0; i < K.length; i++) {
            if (K[i] == Z[i]) {
                C[i] = K[i];
            }

            if (Z[i] > K[i]) {
                C[i] = 2 * (Z[i] - K[i]);
            }
            
            if(K[i]>Z[i]){
                C[i] = Z[i];
            }
        }
        
        for (int i = 0; i < C.length; i++) {
            System.out.println(C[i]+"");
        }
    }

}
