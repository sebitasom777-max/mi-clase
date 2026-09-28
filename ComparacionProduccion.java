public class ComparacionProduccion {

    public static void main(String[] args) {

        double produccion1 = 1200;
        double produccion2 = 1350;

        System.out.println("Ingrese producción de la fábrica 1: " + produccion1);
        System.out.println("Ingrese producción de la fábrica 2: " + produccion2);

        System.out.println();

        // Comparaciones
        System.out.println(produccion1 + " es mayor que " + produccion2 + ": " + (produccion1 > produccion2));
        System.out.println(produccion1 + " es menor que " + produccion2 + ": " + (produccion1 < produccion2));
        System.out.println(produccion1 + " es mayor o igual que " + produccion2 + ": " + (produccion1 >= produccion2));
        System.out.println(produccion1 + " es menor o igual que " + produccion2 + ": " + (produccion1 <= produccion2));
        System.out.println(produccion1 + " es igual a " + produccion2 + ": " + (produccion1 == produccion2));
        System.out.println(produccion1 + " es diferente de " + produccion2 + ": " + (produccion1 != produccion2));

        System.out.println();

        // Determinar cuál fábrica produjo más
        if (produccion1 > produccion2) {
            System.out.println("La fábrica 1 produjo más.");
        } else if (produccion2 > produccion1) {
            System.out.println("La fábrica 2 produjo más.");
        } else {
            System.out.println("Ambas fábricas produjeron lo mismo.");
        }

        // Calcular diferencia
        double diferencia = Math.abs(produccion1 - produccion2);

        System.out.println("Diferencia de producción: " + diferencia + " unidades.");
    }
}