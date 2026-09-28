public class ComparacionNotasBeca {

    public static void main(String[] args) {

        double promedio1 = 18;
        double promedio2 = 17;

        System.out.println("Ingrese promedio del estudiante 1: " + promedio1);
        System.out.println("Ingrese promedio del estudiante 2: " + promedio2);

        System.out.println();

        // Comparaciones
        System.out.println(promedio1 + " es mayor que " + promedio2 + ": " + (promedio1 > promedio2));
        System.out.println(promedio1 + " es menor que " + promedio2 + ": " + (promedio1 < promedio2));
        System.out.println(promedio1 + " es mayor o igual que " + promedio2 + ": " + (promedio1 >= promedio2));
        System.out.println(promedio1 + " es menor o igual que " + promedio2 + ": " + (promedio1 <= promedio2));
        System.out.println(promedio1 + " es igual a " + promedio2 + ": " + (promedio1 == promedio2));
        System.out.println(promedio1 + " es diferente de " + promedio2 + ": " + (promedio1 != promedio2));

        System.out.println();

        // Determinar quién obtiene la beca
        if (promedio1 > promedio2) {
            System.out.println("El estudiante 1 obtiene la beca.");
        } else if (promedio2 > promedio1) {
            System.out.println("El estudiante 2 obtiene la beca.");
        } else {
            System.out.println("Ambos estudiantes tienen el mismo promedio.");
        }
    }
}