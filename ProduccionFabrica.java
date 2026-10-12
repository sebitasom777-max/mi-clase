import java.util.Scanner;

public class ProduccionFabrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingrese el número de piezas producidas: ");
        int cantidadPiezas = scanner.nextInt();
        
        double precioPieza = 5.0;
        double importe = cantidadPiezas * precioPieza;
        double porcentajeIncentivo;
        
        // Condicional if-else para determinar el porcentaje de incentivo
        if (cantidadPiezas > 1000) {
            porcentajeIncentivo = 0.15; // 15% de incentivo
        } else {
            porcentajeIncentivo = 0.08; // 8% de incentivo
        }
        
        // Cálculos del incentivo y el total a recibir
        double incentivo = importe * porcentajeIncentivo;
        double totalPagar = importe + incentivo;
        
        // Mostrar los resultados en pantalla
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Importe base (sin incentivo): S/ " + importe);
        System.out.println("Incentivo aplicado: S/ " + incentivo);
        System.out.println("Total a recibir: S/ " + totalPagar);
        
        scanner.close();
    }
}