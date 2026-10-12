import java.util.Scanner;

public class BonificacionVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingrese el monto total de las ventas (S/): ");
        double ventas = scanner.nextDouble();
        
        double porcentajeBonificacion;
        
        // Condicional if-else para determinar el porcentaje de bonificación
        if (ventas > 5000) {
            porcentajeBonificacion = 0.10; // 10%
        } else {
            porcentajeBonificacion = 0.05; // 5%
        }
        
        // Cálculos de la bonificación y el total
        double bonificacion = ventas * porcentajeBonificacion;
        double total = ventas + bonificacion;
        
        // Mostrar los resultados en pantalla
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Bonificación: S/ " + bonificacion);
        System.out.println("Total (Ventas + Bonificación): S/ " + total);
        
        scanner.close();
    }
}