package AntesParcial1;

import java.util.Scanner;
public class Suma3UltimosDIgitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre: ");
        int nombre = sc.nextInt();
        int valor = 0;
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            int rest = nombre % 10;
            nombre -= rest;
            suma += rest;
            nombre = nombre/10;
        }
        System.out.println(suma);

    }
}
