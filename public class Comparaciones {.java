public class Comparaciones {
    public static void main(String[] args) {

        int numero1 = 5;
        int numero2 = 7;

        System.out.println("Ingrese un número entero: " + numero1);
        System.out.println("Ingrese otro número entero: " + numero2);

        System.out.println(numero1 + " es mayor a " + numero2 + ": " + (numero1 > numero2));

        System.out.println(numero1 + " es menor a " + numero2 + ": " + (numero1 < numero2));

        System.out.println(numero1 + " es mayor o igual a " + numero2 + ": " + (numero1 >= numero2));

        System.out.println(numero1 + " es menor o igual a " + numero2 + ": " + (numero1 <= numero2));

        System.out.println(numero1 + " es igual a " + numero2 + ": " + (numero1 == numero2));

        System.out.println(numero1 + " no es igual a " + numero2 + ": " + (numero1 != numero2));
    }
}
