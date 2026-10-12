import java.util.Scanner;

public class PrestamoBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingrese el sueldo del trabajador (S/): ");
        double sueldo = scanner.nextDouble();
        
        double montoMaximoPrestamo;
        
        // Condicional if-else para calcular el préstamo según el sueldo
        if (sueldo >= 3000) {
            montoMaximoPrestamo = sueldo * 5;
        } else {
            montoMaximoPrestamo = sueldo * 2;
        }
        
        // Mostrar el resultado en pantalla
        System.out.println("El monto máximo que puede solicitar en préstamo es: S/ " + montoMaximoPrestamo);
        
        scanner.close();
    }
}