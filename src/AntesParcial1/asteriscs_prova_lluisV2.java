package AntesParcial1;

import java.util.Scanner;

public class asteriscs_prova_lluisV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        StringBuilder linea = new StringBuilder();
        //Preguntem el número de línies que vol l'usuari
        System.out.print("Digues un numero de linies: ");
        num = entrada.nextInt();
        //Ens assegurem de que sigui un nombre valid de linies
        if (num >= 1) {
            //Creem el bucle que fara en cada fila
            for (int i = 0; i < num; i++) {
                //Posa el buits
                String espais = " ";
                linea.append(espais.repeat(num - 1 - i));
                //Posa els asteriscs
                String asteriscs = "*";
                linea.append(asteriscs.repeat(1 + (2 * i)));
                //Li diem que ens doni la linea i que la reinici per a la següent
                System.out.println(linea);
                linea.setLength(0);
            }
            // Si el nombre no es valid...
        } else {
            System.out.println("El número de niveles no es válido");
        }



    }
}