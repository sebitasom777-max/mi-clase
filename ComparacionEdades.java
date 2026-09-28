public class ComparacionEdades {

    public static void main(String[] args) {

        double edad1 = 58;
        double edad2 = 63;

        System.out.println("Ingrese edad del trabajador 1: " + edad1);
        System.out.println("Ingrese edad del trabajador 2: " + edad2);

        System.out.println();

        // Comparaciones
        System.out.println(edad1 + " es mayor que " + edad2 + ": " + (edad1 > edad2));
        System.out.println(edad1 + " es menor que " + edad2 + ": " + (edad1 < edad2));
        System.out.println(edad1 + " es mayor o igual que " + edad2 + ": " + (edad1 >= edad2));
        System.out.println(edad1 + " es menor o igual que " + edad2 + ": " + (edad1 <= edad2));
        System.out.println(edad1 + " es igual a " + edad2 + ": " + (edad1 == edad2));
        System.out.println(edad1 + " es diferente de " + edad2 + ": " + (edad1 != edad2));

        System.out.println();

        // Determinar quién es mayor
        if (edad1 > edad2) {
            System.out.println("El trabajador 1 es mayor.");
        } else if (edad2 > edad1) {
            System.out.println("El trabajador 2 es mayor.");
        } else {
            System.out.println("Ambos trabajadores tienen la misma edad.");
        }

        // Calcular diferencia de edad
        double diferencia = Math.abs(edad1 - edad2);

        System.out.println("La diferencia de edad es: " + diferencia + " años.");
    }
}