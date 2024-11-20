package AntesParcial1;

import java.util.*;
public class Cigrons {
    public static void main(String[] args) {
        int n, m, kg, bosGrans = 0, bosPetit = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bosses petites:");
        n = sc.nextInt();
        System.out.println("Enter bosses grans:");
        m = sc.nextInt();
        System.out.println("Enter kg:");
        kg = sc.nextInt();

        while (kg != 0){
            if (kg % 5 == 0){
                for (int i = 0; i < m; i++){
                    bosGrans = kg - 5;
                }
            }else{
                for (int i = 0; i < n; i++){
                    bosPetit = kg - 1;
                }
            }
        }
        System.out.println(bosPetit);
    }
}
