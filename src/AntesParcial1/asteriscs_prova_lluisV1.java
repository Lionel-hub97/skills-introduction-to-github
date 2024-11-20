package AntesParcial1;

import java.util.Scanner;

public class asteriscs_prova_lluisV1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, repeticions, repeticions2, repeticions3, inicial, inicial2, reductor;
        StringBuilder linea = new StringBuilder();
        //posem les variables inicials
        inicial = 0;
        inicial2 = -1;
        reductor = 0;
        //Preguntem el número de línies que vol l'usuari
        System.out.print("Digues un numero de linies: ");
        num = entrada.nextInt();
        //Ens assegurem de que sigui un nombre valid de linies
        if (num >= 1) {
            //Creem el bucle que fara en cada fila i preparem les variables
            while (inicial < num) {
                inicial++;
                inicial2++;
                repeticions = 0;
                repeticions2 = 0;
                repeticions3 = 0;
                //Posem els buits davant les linies de la piramide
                while (repeticions < num - 1 - reductor) {
                    repeticions++;
                    linea.append(" ");
                }
                //Anem substituint els buits per asteriscs de dreta a esquerra
                while (repeticions2 < inicial) {
                    repeticions2++;
                    linea.append("*");
                }
                //Acabem de posar el asterisc que ens falten per completar l'altre costa de la piramide
                while (repeticions3 < inicial2) {
                    repeticions3++;
                    linea.append("*");
                }
                //Li diem que ens doni la linae i la reinici per a la següent
                reductor++;
                System.out.println(linea);
                linea.setLength(0);
            }
            // Si el nombre no es valid...
        } else {
            System.out.println("El número de niveles no es válido");
        }



    }
}