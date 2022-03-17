package entrada.desde.teclado;

import java.io.BufferedReader;//Importar las clases para lectura desde teclado
import java.io.InputStreamReader;//Son tipos String habra que convertir los datos 

public class Calculadora {
    public static void main(String[] args) {
        double cantidad1 = 0, cantidad2 = 0;
        //Crear el objeto leer de las clases correspondientes para obtener los datos 
        BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
        try{//Se utiliza el manejador de errores de lo contrario genera error
            System.out.println("Ingresar cantidad 1:");
            //Hace la lectura desde el teclado y lo convierte a double
            cantidad1 = Double.parseDouble(leer.readLine());
            System.out.println("Ingresar cantidad 2:");
            cantidad2 = Double.parseDouble(leer.readLine());
            } catch (Exception e){//Captura del error
               System.out.println("e.getMessage"); 
            }
        System.out.println(cantidad1 + " " + cantidad2);
    }
}
   
