package AntesParcial1;

import java.util.Scanner;
public class contentes_oriol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.println("Escriu una cadena per saber si totes les 'A' estan contentes: ");
        String cadena = " "+ sc.nextLine()+" ";
        char lletra = 'A';

        boolean contenta = false;

        // Convertir tota la cadena a majúsculas per fer la comparació més fàcil
        cadena = cadena.toUpperCase();

        for (int i = 1; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (c == lletra) {
                if(cadena.charAt(i-1) != lletra && cadena.charAt(i+1) != lletra ) {
                    sum += 1;
                }
            }
        }
        if(sum == 0){
            contenta = true;
        }
        System.out.println(contenta);
        sc.close();

    }
}