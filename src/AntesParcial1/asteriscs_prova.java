package AntesParcial1;

import java.util.Scanner;

public class asteriscs_prova {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Mida de la base del triangle: n = ");
        int num = sc.nextInt();
        if (num > 1){
            System.out.println("*".repeat(num));
            for (int i = 1; i < num-2; i++){
            System.out.println(" ".repeat(i) + "*" + " ".repeat(num-i-2) + "*");
            }
            System.out.println(" ".repeat(num-2) + "*".repeat(2));
            System.out.println(" ".repeat(num-1) + "*");
        }else{
            System.out.println("No trabajo con numeros negativos");
        }
    }
}
