package AntesParcial1;

import java.util.Scanner;
public class CapgirarNoCapicues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la frase: ");
        String frase = sc.next();
        StringBuilder reverse = new StringBuilder(frase).reverse();
        boolean punt = true;

        while (punt){
            char p = reverse.charAt(0);
            if (p == '.'){
                frase = frase.substring(0,frase.length()-1);
                reverse.delete(0,1);
                punt = false;
            }
            if (reverse.toString().equals(frase)) {
                System.out.print(" " + "*".repeat(frase.length()));
            }else{
                System.out.print(" " + reverse);
            }
            if (!punt) {
                System.out.print(".");
            }
            frase = sc.next();
            reverse = new StringBuilder(frase).reverse();
        }
    }
}