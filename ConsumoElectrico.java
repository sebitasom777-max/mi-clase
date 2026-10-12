import java.util.Scanner;

public class ConsumoElectrico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingrese el consumo de energía en kWh: ");
        double consumoKWh = scanner.nextDouble();
        
        double montoPagar;
        
        // Condicional if-else para determinar la tarifa según el consumo
        if (consumoKWh <= 100) {
            montoPagar = consumoKWh * 0.80;
        } else {
            montoPagar = consumoKWh * 1.20;
        }
        
        // Mostrar el resultado en pantalla
        System.out.println("El monto total a pagar es: S/ " + montoPagar);
        
        scanner.close();
    }
}