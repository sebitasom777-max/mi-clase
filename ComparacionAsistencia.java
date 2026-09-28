public class ComparacionAsistencia {

    public static void main(String[] args) {

        double asistencia1 = 92;
        double asistencia2 = 87;

        System.out.println("Ingrese asistencia del estudiante 1: " + asistencia1);
        System.out.println("Ingrese asistencia del estudiante 2: " + asistencia2);

        System.out.println();

        // Comparaciones
        System.out.println(asistencia1 + " es mayor que " + asistencia2 + ": " + (asistencia1 > asistencia2));
        System.out.println(asistencia1 + " es menor que " + asistencia2 + ": " + (asistencia1 < asistencia2));
        System.out.println(asistencia1 + " es mayor o igual que " + asistencia2 + ": " + (asistencia1 >= asistencia2));
        System.out.println(asistencia1 + " es menor o igual que " + asistencia2 + ": " + (asistencia1 <= asistencia2));
        System.out.println(asistencia1 + " es igual a " + asistencia2 + ": " + (asistencia1 == asistencia2));
        System.out.println(asistencia1 + " es diferente de " + asistencia2 + ": " + (asistencia1 != asistencia2));

        System.out.println();

        // Determinar quién tiene mejor asistencia
        if (asistencia1 > asistencia2) {
            System.out.println("El estudiante 1 tiene mejor asistencia.");
        } else if (asistencia2 > asistencia1) {
            System.out.println("El estudiante 2 tiene mejor asistencia.");
        } else {
            System.out.println("Ambos estudiantes tienen la misma asistencia.");
        }

        // Calcular diferencia
        double diferencia = Math.abs(asistencia1 - asistencia2);

        System.out.println("Diferencia de asistencia: " + diferencia + "%");
    }
}