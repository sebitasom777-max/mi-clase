public class ComparacionSueldos {

    public static void main(String[] args) {

        double sueldo1 = 1500;
        double sueldo2 = 1800;

        System.out.println("Ingrese sueldo 1: " + sueldo1);
        System.out.println("Ingrese sueldo 2: " + sueldo2);

        System.out.println();

        System.out.println(sueldo1 + " es mayor que " + sueldo2 + ": " + (sueldo1 > sueldo2));
        System.out.println(sueldo1 + " es menor que " + sueldo2 + ": " + (sueldo1 < sueldo2));
        System.out.println(sueldo1 + " es mayor o igual que " + sueldo2 + ": " + (sueldo1 >= sueldo2));
        System.out.println(sueldo1 + " es menor o igual que " + sueldo2 + ": " + (sueldo1 <= sueldo2));
        System.out.println(sueldo1 + " es igual a " + sueldo2 + ": " + (sueldo1 == sueldo2));
        System.out.println(sueldo1 + " es diferente de " + sueldo2 + ": " + (sueldo1 != sueldo2));

        System.out.println();

        if (sueldo1 > sueldo2) {
            System.out.println("El practicante 1 gana más.");
        } else if (sueldo2 > sueldo1) {
            System.out.println("El practicante 2 gana más.");
        } else {
            System.out.println("Ambos practicantes ganan lo mismo.");
        }

        double diferencia = Math.abs(sueldo1 - sueldo2);

        System.out.println("La diferencia salarial es: S/ " + diferencia);
    }
}