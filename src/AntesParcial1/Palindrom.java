package AntesParcial1;

import java.util.*;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una palabra: ");
        String palabra = sc.nextLine(), palabra_inv = "";

        for(int i = 1; i <= palabra.length(); i++){
            palabra_inv = palabra.charAt(i - 1) + palabra_inv;
        }
        if (palabra.equals(palabra_inv)){
            System.out.println("Palabra palidrom");
        }else{
            System.out.println("Not palidrom");
        }
    }
}
