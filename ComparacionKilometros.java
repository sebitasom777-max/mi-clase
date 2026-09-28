public class ComparacionKilometros {

    public static void main(String[] args) {

        double kilometros1 = 850;
        double kilometros2 = 920;

        System.out.println("Ingrese kilómetros del conductor 1: " + kilometros1);
        System.out.println("Ingrese kilómetros del conductor 2: " + kilometros2);

        System.out.println();

        // Comparaciones
        System.out.println(kilometros1 + " es mayor que " + kilometros2 + ": " + (kilometros1 > kilometros2));
        System.out.println(kilometros1 + " es menor que " + kilometros2 + ": " + (kilometros1 < kilometros2));
        System.out.println(kilometros1 + " es mayor o igual que " + kilometros2 + ": " + (kilometros1 >= kilometros2));
        System.out.println(kilometros1 + " es menor o igual que " + kilometros2 + ": " + (kilometros1 <= kilometros2));
        System.out.println(kilometros1 + " es igual a " + kilometros2 + ": " + (kilometros1 == kilometros2));
        System.out.println(kilometros1 + " es diferente de " + kilometros2 + ": " + (kilometros1 != kilometros2));

        System.out.println();

        // Determinar quién recorrió más
        if (kilometros1 > kilometros2) {
            System.out.println("El conductor 1 recorrió más kilómetros.");
        } else if (kilometros2 > kilometros1) {
            System.out.println("El conductor 2 recorrió más kilómetros.");
        } else {
            System.out.println("Ambos conductores recorrieron los mismos kilómetros.");
        }

        // Calcular diferencia
        double diferencia = Math.abs(kilometros1 - kilometros2);

        System.out.println("Diferencia: " + diferencia + " km.");
    }
}