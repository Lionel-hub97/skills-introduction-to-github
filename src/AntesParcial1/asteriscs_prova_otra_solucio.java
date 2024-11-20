package AntesParcial1;

import java.util.Scanner;
public class asteriscs_prova_otra_solucio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix l'altura del triàngle.");
        int n = sc.nextInt(); // Nombre de línies
        if (n <= 0){
            System.out.println("La mida del costats no és vàlida.");
        }
        else {
            for (int j = 1; j <= n; j++) { //Espai per a l'altura del triàngle
                for (int i = 1; i <= n; i++) { // Espai per a l'amplada del triàngle
                    if (j == 1 || j == i || i == n) {
                        System.out.print("*"); // Contorns del triangle o última línia
                    }
                    else {
                        System.out.print(" "); // Espais buits en el centre
                    }
                }
                System.out.println(); //Salt de línia
            }
        }
    }
}