import java.util.Scanner;

public class TarifaTaxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingrese los kilómetros recorridos: ");
        double kilometros = scanner.nextDouble();
        
        double tarifaTotal;
        
        // Condicional if-else para calcular la tarifa según los kilómetros
        if (kilometros <= 3) {
            tarifaTotal = 8.0;
        } else {
            double kmAdicionales = kilometros - 3;
            tarifaTotal = 8.0 + (kmAdicionales * 2.50);
        }
        
        // Mostrar el resultado en pantalla
        System.out.println("La tarifa total del taxi es: S/ " + tarifaTotal);
        
        scanner.close();
    }
}