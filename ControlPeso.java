import java.util.Scanner;

public class ControlPeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingrese el peso del paquete (kg): ");
        double pesoPaquete = scanner.nextDouble();
        
        double pesoLimite = 50.0;
        
        // Condicional if-else para verificar si excede el límite de peso
        if (pesoPaquete <= pesoLimite) {
            System.out.println("El paquete es aceptado. Está dentro del peso permitido.");
        } else {
            double kilosExceso = pesoPaquete - pesoLimite;
            System.out.println("El paquete excede el límite permitido.");
            System.out.println("Kilos que sobrepasa: " + kilosExceso + " kg");
        }
        
        scanner.close();
    }
}