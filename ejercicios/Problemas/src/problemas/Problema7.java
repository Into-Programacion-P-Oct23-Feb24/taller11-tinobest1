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
public class Problema7 {
    
 Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba el numero de elementos a ingresar: ");
        int numElementos = entrada.nextInt();
        entrada.nextLine();

        String[] ciudades = new String[numElementos];
        for (int i = 0; i < numElementos; i++) {
            System.out.print("Ingrese el nombre de la ciudad:\n");
            ciudades[i] = entrada.nextLine();
        }
        return ciudades;
    }

    public static void obtenerCaracteres(String[] ciudades) {
        String cadena = "";
        System.out.printf("Las ciudades con 4 y 5 caracteres son:\n");

        for (int i = 0; i < ciudades.length; i++) {
            cadena = ciudades[i];
            if (cadena.length() == 4 || cadena.length() == 5) {
                System.out.printf("%s\n", cadena);
            }

        }

    }
}
