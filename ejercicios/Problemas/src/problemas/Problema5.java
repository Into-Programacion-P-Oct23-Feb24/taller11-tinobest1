/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema5 {
    
int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int suma;
        suma = obtenerSuma(informacion);

        System.out.printf("El resultado de la suma es: %s\n",suma);

    }

    public static int obtenerSuma(int[][] arreglo) {
        int suma = 0;
        for (int f = 0; f < arreglo.length; f++) {
            for (int c = 0; c < arreglo.length; c++) {
                suma = suma + arreglo [f][c];
            }
        }
        return suma;
    }
}
