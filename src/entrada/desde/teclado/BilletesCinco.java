/*EJEMPLO
*Obtener los billetes de a cinco resultante de una cantidad 
*que el usuario ingrese al programa.*/
package entrada.desde.teclado;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BilletesCinco {
    public static void main(String[] args) {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String cantidadDinero;
        try{
            System.out.println("Cantidad: ");
            cantidadDinero = leer.readLine();//Lectura tipo String
            String cantidadCinco = BilletesCinco.obtenerBilletesDeCinco(cantidadDinero);
            System.out.println("Cantidad de billetes de $5.00: " + cantidadCinco);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static String obtenerBilletesDeCinco(String cantidadDinero){
        double montoDinero = Double.parseDouble(cantidadDinero); //Convertir a Double
        int billetesCinco = (int) montoDinero/5; //Casting de double a int
        String resultado = String.valueOf(billetesCinco); //Cating a string
    return resultado;
    }
}
