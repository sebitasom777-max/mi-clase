import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        
        double salarioTotal;
        int tarifaHora = 20;
        int limiteHorasNormales = 40;
        
        // Condicional if-else para calcular el salario con o sin horas extras
        if (horasTrabajadas <= limiteHorasNormales) {
            salarioTotal = horasTrabajadas * tarifaHora;
        } else {
            int horasExtras = horasTrabajadas - limiteHorasNormales;
            salarioTotal = (limiteHorasNormales * tarifaHora) + (horasExtras * (tarifaHora * 2));
        }
        
        // Mostrar el resultado en pantalla
        System.out.println("El salario total es: S/ " + salarioTotal);
        
        scanner.close();
    }
}