package HePasadoElParcial;

import java.util.*;
public class dados {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        int i = 0;
        Random random = new Random();
        int [] cadena = new int[num];
        while (i < num) {
            cadena [i] = random.nextInt(1, 7);
            i++;
        }
        for (int k = 0; k < cadena.length-1; k++) {
            if (cadena[k] == cadena[k +1]) {
                System.out.print("(");
                System.out.print(cadena[k]);
            } else {
                System.out.print(") ");
                System.out.print(cadena[k]);
            }

        }
    }
    static void repetits(int [] a){

    }
}
