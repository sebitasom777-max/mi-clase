public class ComparacionPromedios {

    public static void main(String[] args) {

        double promedio1 = 16;
        double promedio2 = 14;

        System.out.println("Ingrese el promedio del estudiante 1: " + promedio1);
        System.out.println("Ingrese el promedio del estudiante 2: " + promedio2);

        System.out.println();

        System.out.println(promedio1 + " es mayor que " + promedio2 + ": " + (promedio1 > promedio2));
        System.out.println(promedio1 + " es menor que " + promedio2 + ": " + (promedio1 < promedio2));
        System.out.println(promedio1 + " es mayor o igual que " + promedio2 + ": " + (promedio1 >= promedio2));
        System.out.println(promedio1 + " es menor o igual que " + promedio2 + ": " + (promedio1 <= promedio2));
        System.out.println(promedio1 + " es igual a " + promedio2 + ": " + (promedio1 == promedio2));
        System.out.println(promedio1 + " es diferente de " + promedio2 + ": " + (promedio1 != promedio2));

        System.out.println();

        if (promedio1 > promedio2) {
            System.out.println("El estudiante 1 obtuvo el mejor promedio.");
        } else if (promedio2 > promedio1) {
            System.out.println("El estudiante 2 obtuvo el mejor promedio.");
        } else {
            System.out.println("Ambos estudiantes tienen el mismo promedio.");
        }

        double diferencia = Math.abs(promedio1 - promedio2);

        System.out.println("La diferencia entre ambos promedios es: " + diferencia);
    }
}