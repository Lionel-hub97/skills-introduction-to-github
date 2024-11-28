package HePasadoElParcial;

import java.util.*;
public class dados {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        int i = 0;
        Random random = new Random();
        int[] cadena = new int[num + 2];
        while (i < num) {
            cadena[i + 1] = random.nextInt(1, 7);
            i++;
        }
        int[] nuevo = new int[num + 1];
        for (int k = 1; k < cadena.length - 1; k++) {
            if (cadena[k - 1] != cadena[k] && cadena[k] == cadena[k + 1]) {
                System.out.print("(");
            }
            System.out.print(cadena[k]+" ");
            if (cadena[k - 1] == cadena[k] && cadena[k] != cadena[k + 1]) {
                System.out.print("\b) ");
            }
        }
    }
}