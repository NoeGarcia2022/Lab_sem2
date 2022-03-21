/*2-. Hacer un programa que calcule el valor del DAI (Derecho Arancelario a la 
Importación) para un vehículo del año 2010 utilizando la siguiente fórmula:

DAI = (Valor Vehículo en USA – Depreciación - Flete – Seguro) * 0.25
Depreciación = Valor Vehículo en USA * 0.10

El programa deberá permitir ingresar vía teclado los valores para el valor del 
vehículo en USA, flete y seguro. Por el momento el porcentaje de la depreciación 
será constante. Para efectos de prueba puede utilizar los siguientes valores:

Valor USA = 5000, Depreciación = 10%, Flete = 700, Seguro = 100.
Imprimir los valores capturados así como el monto del DAI.
*/
package ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("$#,###.##");
        double valorVehiculo, valorDepreciacion = 0.10, valorFlete, valorSeguro;
        System.out.println("Valor del Vehiculo: ");
        valorVehiculo = leer.nextDouble();
        System.out.println("Valor del Flete: ");
        valorFlete = leer.nextDouble();
        System.out.println("Valor del Seguro: ");
        valorSeguro = leer.nextDouble();
        
        double valorDai = ejercicio2.obtenerDai(valorVehiculo, valorDepreciacion, valorFlete, valorSeguro);
        
        System.out.println("<---------IMPRESION DE VALORES CAPTURADOS--------->");
        System.out.println("El valor del vehiculo es: " + valorVehiculo);
        System.out.println("El valor del Flete es: " + valorFlete);
        System.out.println("El valor del Seguro es: " + valorSeguro);        
        System.out.println("Valor del DAI es: " + formato.format(valorDai)); 
    } 
    
    //Creamos el metodo para calcular el monto del DAI
    public static double obtenerDai(double valorVehiculo, double valorDepreciacion, double valorFlete, double valorSeguro){
        double dai = 0;
        dai = (valorVehiculo - valorDepreciacion - valorFlete - valorSeguro) * 0.25;
    return dai;
    }
}
