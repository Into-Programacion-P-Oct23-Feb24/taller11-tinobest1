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
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        
         int[] informacion2 = {10, 20, 30};
        presentarNumerosPares(informacion);
    }
    
    public static void presentarNumerosPares(int [][] informacion){
        String cadena = "";
        for (int i = 0; i < informacion.length; i++) {
            for (int j = 0; j < informacion[i].length; j++) {
                if(i<j){
                    cadena = String.format("%s%s\t", cadena, informacion[i][j]);
                }
            }
        }
        System.out.println(cadena);
    }
    
}
