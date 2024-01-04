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
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int[] informacion = {10, 20, 30, 40, 50, 100};
        int valorBuscar = 30;
        boolean bandera = buscarDato(informacion, valorBuscar); // falso
        
        if (bandera) { // bandera==true
            System.out.printf("El valor %d fue encontrado\n", valorBuscar);
        } else {
            System.out.printf("El valor %d no fue encontrado\n", valorBuscar);
        }

    }

    public static boolean buscarDato(int[] datos, int datoBuscar) {
        boolean valor = false;
        
        for (int i = 0; i < datos.length; i++) { // 0<6 v // 1<6 v // 2<6 v // 3<6 v // 4<6 v // 5<6 v // 6<6
            
            if (datos[i] == datoBuscar) { // datos[0] == 30 // 10 == 30 // falso
                                          // datos[1] == 30 // 20 == 30 // falso
                                          // datos[2] == 30 // 30 == 30 // verdadero
                                          // datos[3] == 30 // 40 == 30 // falso
                                          // datos[4] == 30 // 50 == 30 // falso
                                          // datos[5] == 30 // 100 == 30 // falso
                valor = true;
            }
        }
        return valor;
    }

}
