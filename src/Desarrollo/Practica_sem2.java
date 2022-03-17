package Desarrollo;

public class Practica_sem2 {

    public static void main(String[] args) {
        double var;
        NumberFormat formato = new Decimal("#0.##");
        
        sumar();
        sumar(10, 9, "Mario");
        
        var = raiz_cuadrada(2);
        String var1 = formato.format(var);
        
        double z = var * 12;
          System.out.println("El resultado es: " + var1);
    }

    private static void sumar() {
        int a = 2;
        int b = 20;
        int suma =  a + b;
        System.out.println("La suma es: " + suma);
        
    }
    
    private static void sumar (int x, int y, String nombre);
    int resultado = x + y;
    
    
    
}
