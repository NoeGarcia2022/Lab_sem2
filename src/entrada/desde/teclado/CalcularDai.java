/*Problema planteado: Para importar una máquina de procesamiento de alimentos, la dirección de aduanas cobra el 10% de
impuesto sobre el valor de la maquinaria menos el valor del costo del flete para transportar la maquinaria desde estados
unidos a el salvador menos el valor del seguro pagado para asegurar que la maquina ingrese a territorio nacional, por lo general
el 5% del valor dela máquina. La fórmula queda así: DAI = (valor de la máquina – flete – seguro) * 10%. Al valor resultante
hay que calcularle el valor del IVA que es el 13% del valor del DAI.
Si estamos importando una máquina que cuesta $10,000, hemos pagado por el flete
$500. ¿Cuánto es el valor del DAI y del IVA?*/
package entrada.desde.teclado;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
public class CalcularDai {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        NumberFormat formato = new DecimalFormat("$#,###.##");
        double valorMaquina, valorFlete, valorSeguro;
        System.out.println("Valor de la maquina: ");
        valorMaquina = leer.nextDouble(); //Captura los datos en el tipo que se necesita
        System.out.println("Valor del flete: ");
        valorFlete = leer.nextDouble();
        System.out.println("Valor del Seguro: ");
        valorSeguro = leer.nextDouble();
        
        double valorDai = CalcularDai.obtenerDai(valorMaquina, valorFlete, valorSeguro);
        double valorConIva = CalcularDai.obtenerIva(valorDai);
        
        System.out.println("Valor del DAI: " + formato.format(valorDai));
        System.out.println("Valor del IVA: " + formato.format(valorConIva));
    }
    //Crear el metodo para el calculo de dai
    public static double obtenerDai(double valorMaquina, double valorFlete, double valorSeguro){
        double dai = 0;
        dai = (valorMaquina - valorFlete - valorSeguro) * 0.10;
    return dai;
    }
    
    //Metodo para obtener el valor mas IVA
    public static double obtenerIva(double dai){
        double pagoConIva = 0;
        pagoConIva = dai * 1.13;
    return pagoConIva;
    }
    
}
