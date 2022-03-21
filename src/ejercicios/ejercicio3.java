/*3. Una agencia de venta de autos paga a su personal de ventas un salario de $800.00 
mas una comision de $170.00 por auto vendido más un 5% del valor de venta. Diseñar 
un programa para calcular el salario de un vendedor en un determinado mes, conociendo 
el nº de automóviles vendidos y el total del monto de ventas. Imprimir el nombre 
del vendedor y el salario devengado por este.
*/
package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
       double salarioBase = 800.00; 
       double SalarioTotal = 0.0;
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Digite la cantidad de autos vendidos: ");
        double n = leer.nextDouble();
        
        System.out.println("Ingrese el nombre del vendedor: ");
        String nombre = leer.next();
        
        double comisionVentas = comision2();
        ComiAutosVendidos(n);
        SalarioTotal = salarioBase + ComiAutosVendidos(n) + comisionVentas ;
        
        System.out.println("El total es $: " + SalarioTotal);
        System.out.println("El nombre del trabajador es: " + nombre);
    }
    
    public static double ComiAutosVendidos(double cantidad){
    double comision = 170.0;
    double totalComision = comision * cantidad;
        return totalComision;
    }
    
    public static double comision2(){
    int VentasX = 3;
        double valorVenta1 = 5000;
        double valorVenta2 = 7000;
        double valorVenta3 = 15000;
        double comisionVentas = (valorVenta1 * 0.05) + (valorVenta2 * 0.05) + (valorVenta3 * 0.05);
    return comisionVentas;
    }
}
