/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        
        String cadena = "Los numeros pares son:\n";
        for (int i = 0; i < informacion.length; i++) {
            for (int j = 0; j < informacion[i].length; j++) {
                if(informacion[i][j] %2==0){
                    cadena = String.format("%s%s\t", cadena,
                            informacion[i][j]);
                }
            }
        }
        System.out.println(cadena);
    }
    
}

