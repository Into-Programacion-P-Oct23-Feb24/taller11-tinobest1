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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int opcion;
        System.out.println("Escriba la opcion que desea utilizar para obtener "
                + "el area\n1.Cuadrado\n2.Triangulo\n3.Rectangulo\n");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            obtenerAreaCuadrado();
        }else if (opcion == 2) {
            obtenerAreaTriangulo();
        }else if (opcion == 3) {
            obtenerAreaRectangulo();
        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double area;
        System.out.println("Ingrese el lado del cuadrado");
        lado = entrada.nextDouble();
        area = lado * lado * lado * lado;
        System.out.printf("El area es:%.2f\n", area);

    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura");
        altura = entrada.nextDouble();
        area = base * altura / 2;
        System.out.printf("El area es:%.2f\n", area);

    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura");
        altura = entrada.nextDouble();
        area = base * altura;
        System.out.printf("El area es:%.2f\n", area);

    }

}
