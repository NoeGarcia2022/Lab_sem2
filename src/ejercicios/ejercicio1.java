/*
1-. Escriba  un  programa  que  imprima  por  pantalla  cuánto  le  costará  
comprar  una computadora  a un determinado precio  si sabe que puede conseguir 
una rebaja del 15%. No  olvidar  que  al  precio  del  artículo  se  le  debe  
de  agregar  el  IVA.  El  programa  deberá permitir  digitar  el  precio  de  
la  computadora  y deberá  de  realizar  los  cálculos correspondientes.
*/
package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
    System.out.println("Digite el precio de la computadora");
    double precio = leer.nextDouble();
            
    double valor_iva = iva_compra(precio);
    double valor_rebaja = rebaja_compra(precio);
    
    double total_compra = precio_compra(precio, valor_iva, valor_rebaja);
    
        System.out.println("La rebaja del 15% es de: " + valor_rebaja);
        System.out.println("El iva de la compra es de: " + valor_iva);
        System.out.println("El total de la compra es: " + total_compra);
    }
    
    private static double precio_compra(double precio, double iva, double rebaja){
    double total = 0.0;
    total = (precio - rebaja)+ iva;
    return total;
    }
    
    private static double iva_compra(double precio){
    double iva = 0.0;
    iva = (precio * 0.13);
    return iva;
    }
    
    private static double rebaja_compra(double precio){
    double rebaja = 0.0;
    rebaja = precio * 0.15;
    return rebaja;
    }
    
}
