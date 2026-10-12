import java.util.Scanner;

public class ComparacionTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        
        int mayor, menor;
        
        // Estructura if-else para determinar el número mayor
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }
        
        // Estructura if-else para determinar el número menor
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
        } else {
            menor = num3;
        }
        
        // Calcular la diferencia entre el mayor y el menor
        int diferencia = mayor - menor;
        
        // Mostrar los resultados en pantalla
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("La diferencia entre ambos es: " + diferencia);
        
        scanner.close();
    }
}