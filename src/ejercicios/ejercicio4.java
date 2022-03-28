/*4-. Una empresa de venta de computadoras paga a su personal de ventas un salario de $300,00 
más una comisión de $50,00 por computadora vendida. Diseñar un programa para calcular el salario 
de un vendedor en un determinado mes, conociendo el nº de computadoras vendidas. Al salario 
devengado se debe de retener el 10% en concepto de renta. Imprimir el nombre del vendedor, 
el salario devengado y la retención de la renta.
 */
package ejercicios;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
        double salarioPersonal = 300.00; 
       double SalarioTotal = 0.0;
       
        System.out.println("Digite la cantidad de autos vendidos: ");
        double n = leer.nextDouble();
        
        System.out.println("Ingrese el nombre del vendedor: ");
        String nombre = leer.next();
        
        Comi_pc_Vendidas(n);
        SalarioTotal = salarioPersonal + Comi_pc_Vendidas(n) * retencionRenta ;
        
        System.out.println("El total es $: " + SalarioTotal);
        System.out.println("El nombre del trabajador es: " + nombre);
    }
    
    public static double Comi_pc_Vendidas(double cantidad){
    double comision = 50.00;
    double SalarioDevengado = comision * cantidad;
        return totalComision;
    }
     
}
