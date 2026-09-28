public class ComparacionVentas {

    public static void main(String[] args) {

        double ventas1 = 7500;
        double ventas2 = 6800;

        System.out.println("Ingrese ventas del vendedor 1: " + ventas1);
        System.out.println("Ingrese ventas del vendedor 2: " + ventas2);

        System.out.println();

        // Comparaciones
        System.out.println(ventas1 + " es mayor que " + ventas2 + ": " + (ventas1 > ventas2));
        System.out.println(ventas1 + " es menor que " + ventas2 + ": " + (ventas1 < ventas2));
        System.out.println(ventas1 + " es mayor o igual que " + ventas2 + ": " + (ventas1 >= ventas2));
        System.out.println(ventas1 + " es menor o igual que " + ventas2 + ": " + (ventas1 <= ventas2));
        System.out.println(ventas1 + " es igual a " + ventas2 + ": " + (ventas1 == ventas2));
        System.out.println(ventas1 + " es diferente de " + ventas2 + ": " + (ventas1 != ventas2));

        System.out.println();

        // Determinar quién realizó más ventas
        if (ventas1 > ventas2) {
            System.out.println("El vendedor 1 realizó más ventas.");
        } else if (ventas2 > ventas1) {
            System.out.println("El vendedor 2 realizó más ventas.");
        } else {
            System.out.println("Ambos vendedores realizaron las mismas ventas.");
        }

        // Calcular diferencia
        double diferencia = Math.abs(ventas1 - ventas2);

        System.out.println("La diferencia es: S/ " + diferencia);
    }