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
public class Problema6 {
    
Scanner entrada = new Scanner(System.in);

        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        double media = obtenerMediaAritmetica(informacion);
        System.out.printf("El resultado de la media aritmetica es: %.2f\n", media);

        double desviacion = obtenerDesviacion(informacion, media);
        System.out.printf("El resultado de la desviacion estandar es: %.2f\n",
                desviacion);
    }

    public static Double obtenerMediaAritmetica(int[] datos) {
        double suma = 0;
        double media = 0;
        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
        }
        media = suma / datos.length;
        return media;
    }

    public static Double obtenerDesviacion(int[] datos, double media) {
        double suma = 0;
        double operacion = 0;
        double operacion2 = 0;
        double resultadoDesviacion ;
        for (int i = 0; i < datos.length; i++) {
            operacion = Math.pow(datos[i] - media, 2);
            suma = suma + operacion;
        }
        operacion2 = suma / datos.length;
        resultadoDesviacion = Math.sqrt(operacion2) ;
        return resultadoDesviacion;

    }
}
