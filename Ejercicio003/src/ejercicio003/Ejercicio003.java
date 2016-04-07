/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio003;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author eveR
 */
public class Ejercicio003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array= new int[3];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        for (int i = 0; i < array.length; i++) {
            //System.out.println(i);
        }
        
        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(1);
        array2.add(2);
        array2.add(3);
        
        for (int object : array2) {
            System.err.println(object);
        }
        
        String numero = JOptionPane.showInputDialog(null, "Ingrese un numero", 
                10);
        
        Object color = JOptionPane.showInputDialog(null, "Seleccione Un Color",
                "COLORES", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Seleccione", "Amarillo", "Azul", "Rojo"}, "Seleccione");

        System.err.println(color);
        
        int resp = JOptionPane.showConfirmDialog(null, "Usas mucho el JOptionPane?");
        if (JOptionPane.OK_OPTION == resp) {
            System.out.println("Selecciona opción Afirmativa");
        } else {
            System.out.println("No selecciona una opción afirmativa");
        }
    }
    
}
