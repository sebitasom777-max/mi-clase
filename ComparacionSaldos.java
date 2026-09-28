public class ComparacionSaldos {

    public static void main(String[] args) {

        double saldo1 = 12500;
        double saldo2 = 9800;

        System.out.println("Ingrese saldo de la cuenta 1: " + saldo1);
        System.out.println("Ingrese saldo de la cuenta 2: " + saldo2);

        System.out.println();

        // Comparaciones
        System.out.println(saldo1 + " es mayor que " + saldo2 + ": " + (saldo1 > saldo2));
        System.out.println(saldo1 + " es menor que " + saldo2 + ": " + (saldo1 < saldo2));
        System.out.println(saldo1 + " es mayor o igual que " + saldo2 + ": " + (saldo1 >= saldo2));
        System.out.println(saldo1 + " es menor o igual que " + saldo2 + ": " + (saldo1 <= saldo2));
        System.out.println(saldo1 + " es igual a " + saldo2 + ": " + (saldo1 == saldo2));
        System.out.println(saldo1 + " es diferente de " + saldo2 + ": " + (saldo1 != saldo2));

        System.out.println();

        // Determinar qué cuenta tiene mayor saldo
        if (saldo1 > saldo2) {
            System.out.println("La cuenta 1 tiene mayor saldo.");
        } else if (saldo2 > saldo1) {
            System.out.println("La cuenta 2 tiene mayor saldo.");
        } else {
            System.out.println("Ambas cuentas tienen el mismo saldo.");
        }

        // Calcular diferencia
        double diferencia = Math.abs(saldo1 - saldo2);

        System.out.println("La diferencia es: S/ " + diferencia);
    }
}