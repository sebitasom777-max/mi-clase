import java.util.Scanner;

public class CompraComputadoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingrese el número de computadoras a comprar: ");
        int cantidad = scanner.nextInt();
        
        double precioUnitario = 2500.0;
        double importe = cantidad * precioUnitario;
        double porcentajeDescuento;
        
        // Condicional if-else para determinar el porcentaje de descuento
        if (cantidad >= 5) {
            porcentajeDescuento = 0.12; // 12%
        } else {
            porcentajeDescuento = 0.05; // 5%
        }
        
        // Cálculos de descuento y total a pagar
        double descuento = importe * porcentajeDescuento;
        double totalPagar = importe - descuento;
        
        // Mostrar los resultados en pantalla
        System.out.println("\n--- RESUMEN DE LA COMPRA ---");
        System.out.println("Importe bruto: S/ " + importe);
        System.out.println("Descuento aplicado: S/ " + descuento);
        System.out.println("Total a pagar: S/ " + totalPagar);
        
        scanner.close();
    }
}