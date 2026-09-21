ejercicios java {
    public static void main(String[] args) {
        // 1. Suma y diferencia
        int a1 = 48, b1 = 17;
        System.out.println("1) Suma: " + (a1 + b1) + ", Diferencia: " + (a1 - b1));

        // 2. Producto y cociente
        int a2 = 36, b2 = 6;
        System.out.println("2) Producto: " + (a2 * b2) + ", Cociente: " + (a2 / b2));

        // 3. Cociente entero y residuo
        int dividendo = 157, divisor = 12;
        System.out.println("3) Cociente: " + (dividendo / divisor) + ", Residuo: " + (dividendo % divisor));

        // 4. Doble, triple y mitad
        int numero4 = 24;
        System.out.println("4) Doble: " + (numero4 * 2) + ", Triple: " + (numero4 * 3) + ", Mitad: " + (numero4     / 2));

        // 5. Cuadrado y cubo
        int numero5 = 7;
        System.out.println("5) Cuadrado: " + (numero5 * numero5) + ", Cubo: " + (numero5 * numero5 * numero5));

        // 6. Promedio de tres notas
        double n1 = 14, n2 = 17, n3 = 16;
        System.out.println("6) Promedio: " + ((n1 + n2 + n3) / 3));

        // 7. Promedio de cuatro prácticas
        double p1 = 15, p2 = 13, p3 = 18, p4 = 16;
        System.out.println("7) Promedio: " + ((p1 + p2 + p3 + p4) / 4));

        // 8. Operaciones combinadas
        int a8 = 12, b8 = 8, c8 = 4;
        System.out.println("8) R = " + ((a8 + b8) * c8 / 2));

        // 9. Expresión con paréntesis
        int a9 = 20, b9 = 6, c9 = 3;
        System.out.println("9) R = " + ((a9 - b9) * (a9 + c9)));

        // 10. Expresión fraccionaria
        double a10 = 18, b10 = 7, c10 = 5;
        System.out.println("10) R = " + ((a10 + b10) / c10));

        // 11. Área cuadrado
        int lado11 = 9;
        System.out.println("11) Área cuadrado: " + (lado11 * lado11));

        // 12. Perímetro cuadrado
        int lado12 = 12;
        System.out.println("12) Perímetro cuadrado: " + (4 * lado12));

        // 13. Área rectángulo
        int base13 = 18, altura13 = 7;
        System.out.println("13) Área rectángulo: " + (base13 * altura13));

        // 14. Perímetro rectángulo
        int largo14 = 22, ancho14 = 9;
        System.out.println("14) Perímetro rectángulo: " + (2 * (largo14 + ancho14)));

        // 15. Área triángulo
        int base15 = 16, altura15 = 11;
        System.out.println("15) Área triángulo: " + ((base15 * altura15) / 2));

        // 16. Área trapecio
        int B16 = 20, b16 = 12, h16 = 8;
        System.out.println("16) Área trapecio: " + (((B16 + b16) * h16) / 2));

        // 17. Área rombo
        int D17 = 18, d17 = 10;
        System.out.println("17) Área rombo: " + ((D17 * d17) / 2));

        // 18. Área círculo
        int radio18 = 6;
        System.out.println("18) Área círculo: " + (Math.PI * radio18 * radio18));

        // 19. Longitud circunferencia
        int radio19 = 8;
        System.out.println("19) Longitud circunferencia: " + (2 * Math.PI * radio19));

        // 20. Volumen cubo
        int arista20 = 5;
        System.out.println("20) Volumen cubo: " + (arista20 * arista20 * arista20));

        // 21. Volumen prisma rectangular
        int largo21 = 12, ancho21 = 6, altura21 = 4;
        System.out.println("21) Volumen prisma: " + (largo21 * ancho21 * altura21));

        // 22. Volumen cilindro
        int radio22 = 4, altura22 = 10;
        System.out.println("22) Volumen cilindro: " + (Math.PI * radio22 * radio22 * altura22));

        // 23. Distancia recorrida
        double velocidad23 = 85, tiempo23 = 3.5;
        System.out.println("23) Distancia: " + (velocidad23 * tiempo23));

        // 24. Velocidad promedio
        double distancia24 = 540, tiempo24 = 6;
        System.out.println("24) Velocidad promedio: " + (distancia24 / tiempo24));

        // 25. Tiempo de viaje
        double distancia25 = 360, velocidad25 = 80;
        System.out.println("25) Tiempo viaje: " + (distancia25 / velocidad25));

        // 26. Conversión horas
        double horas26 = 7.5;
        System.out.println("26) Minutos: " + (horas26 * 60) + ", Segundos: " + (horas26 * 3600));

        // 27. Conversión segundos
        int seg27 = 10000;
        int horas27 = seg27 / 3600;
        int min27 = (seg27 % 3600) / 60;
        int segRest27 = seg27 % 60;
        System.out.println("27) " + horas27 + "h " + min27 + "m " + segRest27 + "s");

        // 28. Celsius a Fahrenheit
        double C28 = 28;
        System.out.println("28) Fahrenheit: " + ((C28 * 9.0 / 5.0) + 32));

        // 29. Fahrenheit a Celsius
        double F29 = 95;
        System.out.println("29) Celsius: " + ((F29 - 32) * 5.0 / 9.0));

        // 30. Consumo combustible
        double km30 = 525, litros30 = 35;
        System.out.println("30) Rendimiento: " + (km30 / litros30) + " km/l");

        // 31. Sueldo semanal
        double pago31 = 22.50, horas31 = 44;
        System.out.println("31) Sueldo: S/ " + (pago31 * horas31));

        // 32. Importe compra
        int cuadernos32 = 18; double precio32 = 7.80;
        System.out.println("32) Importe: S/ " + (cuadernos32 * precio32));

        // 33. Descuento comercial
        double precio33 = 1200, desc33 = precio33 * 0.15;
        System.out.println("33) Descuento: S/ " + desc33 + ", Precio final: S/ " + (precio33 - desc33));

        // 34. Precio con IGV
        double valor34 = 850, igv34 = valor34 * 0.18;
        System.out.println("34) IGV: S/ " + igv34 + ", Precio total: S/ " + (valor34 + igv34));

        // 35. Descuento e IGV
        double precio35 = 1600, desc35 = precio35 * 0.10;
        double neto35 = precio35 - desc35, igv35 = neto35 * 0.18;
        System.out.println("35) Precio final: S/ " + (neto35 + igv35));

        // 36. Comisión venta
        double venta36 = 12500, com36 = venta36 * 0.06, sueldoBase36 = 1400;
        System.out.println("36) Comisión: S/ " + com36 + ", Ingreso total: S/ " + (sueldoBase36 + com36));

        // 37. Interés simple
        double C37 = 5000, r37 = 0.08, t37 = 3;
        // 37. Interés simple
        double C37 = 5000, r37 = 0.08, t37 = 3;
        double I37 = C37 * r37 * t37;
        double M37 = C37 + I37;
        System.out.println("37) Interés: S/ " + I37 + ", Monto: S/ " + M37);

        // 38. Reparto porcentual
        double total38 = 9000;
        System.out.println("38) 40%: S/ " + (total38 * 0.40) + ", 35%: S/ " + (total38 * 0.35) + ", 25%: S/ " + (total38 * 0.25));

        // 39. Costo producción
        int unidades39 = 250; double precioUnit39 = 18.50;
        System.out.println("39) Costo total: S/ " + (unidades39 * precioUnit39));

        // 40. Precio de venta
        double costo40 = 4625, ganancia40 = costo40 * 0.25;
        System.out.println("40) Ganancia: S/ " + ganancia40 + ", Precio venta: S/ " + (costo40 + ganancia40));

        // 41. Densidad
        double masa41 = 540, volumen41 = 60;
        System.out.println("41) Densidad: " + (masa41 / volumen41) + " g/cm3");

        // 42. Presión
        double fuerza42 = 720, area42 = 24;
        System.out.println("42) Presión: " + (fuerza42 / area42) + " N/m2");

        // 43. Trabajo mecánico
        double fuerza43 = 150, distancia43 = 18;
        System.out.println("43) Trabajo: " + (fuerza43 * distancia43) + " J");

        // 44. Ley de Ohm
        double V44 = 220, R44 = 44;
        System.out.println("44) Corriente: " + (V44 / R44) + " A");

        // 45. Potencia eléctrica
        double V45 = 220, I45 = 5;
        System.out.println("45) Potencia: " + (V45 * I45) + " W");

        // 46. Energía eléctrica
        double P46 = 1200, t46 = 6;
        double E46 = P46 * t46;
        System.out.println("46) Energía: " + E46 + " Wh = " + (E46 / 1000) + " kWh");

        // 47. Índice de masa corporal
        double peso47 = 72, altura47 = 1.74;
        System.out.println("47) IMC: " + (peso47 / (altura47 * altura47)));

        // 48. Hipotenusa
        int a48 = 9, b48 = 12;
        System.out.println("48) Hipotenusa: " + Math.sqrt(a48 * a48 + b48 * b48));

        // 49. Descomposición de tres cifras
        int num49 = 748;
        int centenas = num49 / 100;
        int decenas = (num49 % 100) / 10;
        int unidades = num49 % 10;
        int sumaCifras = centenas + decenas + unidades;
        System.out.println("49) Centenas: " + centenas + ", Decenas: " + decenas + ", Unidades: " + unidades + ", Suma: " + sumaCifras);

        // 50. Problema integrador
        int unidades50 = 300; double costoUnit50 = 16.80;
        double costoTotal50 = unidades50 * costoUnit50;
        double ganancia50 = costoTotal50 * 0.30;
        double valorVenta50 = costoTotal50 + ganancia50;
        double igv50 = valorVenta50 * 0.18;
        double precioTotal50 = valorVenta50 + igv50;
        double precioUnitFinal50 = precioTotal50 / unidades50;
        System.out.println("50) Costo: S/ " + costoTotal50 + ", Ganancia: S/ " + ganancia50 + ", Valor venta: S/ " + valorVenta50 + ", IGV: S/ " + igv50 + ", Precio total: S/ " + precioTotal50 + ", Precio unitario final: S/ " + precioUnitFinal50);
    }
}