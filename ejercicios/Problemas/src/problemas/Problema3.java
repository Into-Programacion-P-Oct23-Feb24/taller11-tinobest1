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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner entrada = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;
        double nota4;

        System.out.println("Ingrese la primera calificacion:");
        nota1 = entrada.nextDouble();

        System.out.println("Ingrese la segunda calificacion:");
        nota2 = entrada.nextDouble();

        System.out.println("Ingrese la tercera calificacion:");
        nota3 = entrada.nextDouble();

        System.out.println("Ingrese la cuarta calificacion:");
        nota4 = entrada.nextDouble();

        String promedioFinal = obtenerPromedioCualit(nota1, nota2, nota3, nota4);
        System.out.printf("El promedio de las notas: %.0f, %.0f, %.0f, %.0f es %s\n",
                 nota1, nota2, nota3, nota4, promedioFinal);
    }

    public static String obtenerPromedioCualit(double n1, double n2, double n3,
             double n4) {

        double promedio;
        String promedioCualit = "";
        promedio = (n1 + n2 + n3 + n4) / 4;
        
        if (promedio >= 0 && promedio <= 5) {
            promedioCualit = String.format("Regular");
        } else if (promedio >= 5.1 && promedio <= 8) {
            promedioCualit = String.format("Bueno");
        }else if (promedio >= 8.1 && promedio <= 9) {
            promedioCualit = String.format("Muy Bueno");
        }else if (promedio >= 9.1 && promedio <= 10) {
            promedioCualit = String.format("Sobresaliente");
        }
        return promedioCualit;

    }

}
