import java.util.Scanner;

public class RendimientoAcademico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingrese el promedio académico (0 a 20): ");
        int promedio = scanner.nextInt();
        
        // Estructura if-else para evaluar el rendimiento según los rangos
        if (promedio < 0 || promedio > 20) {
            System.out.println("Error: El promedio debe estar entre 0 y 20.");
        } else if (promedio < 11) {
            System.out.println("Rendimiento: Desaprobado");
        } else if (promedio >= 11 && promedio <= 14) {
            System.out.println("Rendimiento: Regular");
        } else if (promedio >= 15 && promedio <= 17) {
            System.out.println("Rendimiento: Bueno");
        } else {
            System.out.println("Rendimiento: Excelente");
        }
        
        scanner.close();
    }
}1