import java.util.Scanner;

public class Programa7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedir los consumos
        System.out.print("Ingrese consumo del hogar 1: ");
        int hogar1 = sc.nextInt();

        System.out.print("Ingrese consumo del hogar 2: ");
        int hogar2 = sc.nextInt();

        // Comparaciones
        System.out.println();

        System.out.println(hogar1 + " es mayor que " + hogar2 + ": " + (hogar1 > hogar2));
        System.out.println(hogar1 + " es menor que " + hogar2 + ": " + (hogar1 < hogar2));
        System.out.println(hogar1 + " es mayor o igual que " + hogar2 + ": " + (hogar1 >= hogar2));
        System.out.println(hogar1 + " es menor o igual que " + hogar2 + ": " + (hogar1 <= hogar2));
        System.out.println(hogar1 + " es igual a " + hogar2 + ": " + (hogar1 == hogar2));
        System.out.println(hogar1 + " es diferente de " + hogar2 + ": " + (hogar1 != hogar2));

        // Determinar cuál hogar consumió más
        System.out.println();

        if (hogar1 > hogar2) {
            System.out.println("El hogar 1 consumió más energía.");
            System.out.println("La diferencia es de " + (hogar1 - hogar2) + " kWh.");
        } 
        else if (hogar2 > hogar1) {
            System.out.println("El hogar 2 consumió más energía.");
            System.out.println("La diferencia es de " + (hogar2 - hogar1) + " kWh.");
        } 
        else {
            System.out.println("Ambos hogares consumieron la misma cantidad de energía.");
            System.out.println("La diferencia es de 0 kWh.");
        }

        sc.close();
    }
}