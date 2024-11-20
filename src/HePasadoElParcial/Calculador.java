package HePasadoElParcial;

import java.util.Scanner;

public class Calculador {
        public static void main(String []arg){
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca numeros a sumar");
        a = sc.nextInt();
        b = sc.nextInt();
        c = calculaSuma(a,b); //p. actuales
        System.out.println(c);
        }
        //p. formales
        static int calculaSuma(int x, int y) // El metode de test s'anomenara
        // testcalculaSuma
        {
            return x + y;
        }
        static int calculaResta(int x, int y) // El metode de test s'anomenara
        // testcalculaSuma
        {
            return x - y;
        }
    }


