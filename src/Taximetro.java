/* taula de tests
  entrada            | sortida esperada
  -------------------------------------
   zona_a + (minuts)  | precio
   zona_b + (minuts)  | precio
   zona_c +   (km)    | precio
*/


import java.util.*;
public class Taximetro {
    public static void main(String[] args) {

        int ZONA;
        double taxi_A, taxi_B, taxi_C, Preu = 0;
        Scanner sc = new Scanner(System.in);
        enum Zonas {ZONA_A, ZONA_B, ZONA_C}
        Zonas Z;
        System.out.println("Per quina zona vols anar? (0) per ZONA_A , (1) ZONA_B, (2) per ZONA_C");
        ZONA = sc.nextInt();
        Z = Zonas.values()[ZONA];
        Scanner taxi = new Scanner(System.in);
        switch (Z){
            case ZONA_A:
                System.out.println("Quants minuts?");
                taxi_A = taxi.nextInt();
                Preu = 1.25 * taxi_A;
                break;
            case ZONA_B:
                System.out.println("Quants minuts?");
                taxi_B = taxi.nextInt();
                Preu = 1.25 * taxi_B;
                break;
            case ZONA_C:
                System.out.println("Quants km?");
                taxi_C = taxi.nextInt();
                Preu = 1.25 * taxi_C;
                break;
            default:
                System.out.println("NO HAY ZONAS PARA TU PRESENCIA");
                break;
            }
        System.out.println(Preu+"$");

    }
}
