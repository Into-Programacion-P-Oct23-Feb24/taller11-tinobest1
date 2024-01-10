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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner entrada = new Scanner(System.in);
        String nombres = "";
        String cedula = "";
        int opcion;

        System.out.println("Ingrese los nombres del cliente:");
        nombres = entrada.nextLine();
        System.out.println("Ingrese la cedula del cliente:");
        cedula = entrada.nextLine();
        System.out.println("Escriba el numero de acuerdo a la funcion que"
                + "desea realizar\n1-Valor de planilla de luz\t2-Valor de predio");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            valorLuz(nombres, cedula);
        } else if (opcion == 2) {
            valorPredio(nombres, cedula);
        }
    }

    public static void valorLuz(String nombre, String cedula) {
        Scanner entrada = new Scanner(System.in);
        double valorKilowat;
        double numKilowat;
        double planilla;
        System.out.println("Ingrese el valor del kilowatio: ");
        valorKilowat = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilowatio consumdido :");
        numKilowat = entrada.nextDouble();

        planilla = valorKilowat * numKilowat;
        System.out.printf("Cliene %s con cedula %s debe cancelar el valor"
                + " de $%.2f\n", nombre, cedula, planilla);
    }

    public static void valorPredio(String nombre, String cedula) {
        Scanner entrada = new Scanner(System.in);
        double valorInmueble ;
        double operacion ;
        System.out.println("Ingrese el valor del inmueble: ");
        valorInmueble = entrada.nextDouble();
        operacion = valorInmueble * 0.2 ;
    
        System.out.printf("Cliene %s con cedula %s tiene un bien inmueble valorado "
                + "en $%s y tiene que pagar de predio $%.2f\n", nombre, cedula,
                valorInmueble, operacion);
    }

}
