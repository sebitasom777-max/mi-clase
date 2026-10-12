import java.util.Scanner;

public class SistemaPagoEmpleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.print("Ingrese el pago por hora (S/): ");
        double pagoPorHora = scanner.nextDouble();
        
        // 1. Calcular salario bruto
        double salarioBruto = horasTrabajadas * pagoPorHora;
        
        // 2. Calcular impuesto según el salario bruto (> S/ 2500)
        double porcentajeImpuesto;
        if (salarioBruto > 2500) {
            porcentajeImpuesto = 0.12; // 12%
        } else {
            porcentajeImpuesto = 0.07; // 7%
        }
        double impuesto = salarioBruto * porcentajeImpuesto;
        
        // 3. Calcular bono si trabajó más de 48 horas
        double bono = 0.0;
        if (horasTrabajadas > 48) {
            bono = 300.0;
        }
        
        // 4. Calcular salario neto
        // Salario Neto = Salario Bruto - Impuesto + Bono
        double salarioNeto = salarioBruto - impuesto + bono;
        
        // Mostrar los resultados en pantalla
        System.out.println("\n--- BOLETA DE PAGO ---");
        System.out.println("Salario bruto: S/ " + salarioBruto);
        System.out.println("Impuesto aplicado (" + (porcentajeImpuesto * 100) + "%): S/ " + impuesto);
        System.out.println("Bono por horas (>48h): S/ " + bono);
        System.out.println("Salario neto a pagar: S/ " + salarioNeto);
        
        scanner.close();
    }
}