/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        // 1    (0, 0)        2     (0, 1) *      3 (0, 2) *
        // 10   (1, 0)        20    (1, 1)      30 (1, 2) *
        // 100  (2, 0)       200    (2, 1)     300 (2, 2) 
        
        // int[] informacion2 = {10, 20, 30};
        presentarDiagonal(informacion);
    }
    
    public static void presentarDiagonal(int [][] datos){
        String cadena = "";
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                if(i<j){
                    cadena = String.format("%s%s\t", cadena, datos[i][j]);
                }
            }
        }
        System.out.println(cadena);
    }
    
}
