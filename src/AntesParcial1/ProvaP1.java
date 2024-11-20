package AntesParcial1;/*
 * Autor:  Alexander Borda Choque
 * Data:   24/10/24
 * Versió: 2.0
 */

/*
 * P1 - Prog 24-25
 * Exercici 24.	Feu un programa que llegeix un String i compta el nombre de vocals
 * que hi ha en total. Per exemple, “Avui fa molta calor.” dona el missatge
 * “La frase té 8 vocals”. Utilitza el mètode CharAt() de la classe String per a resoldre’l.
 * (CompteVocals.java)
 */


/* Taula de tests
  Entrada                   | Sortida esperada
  ----------------------------------------------------------------------
Hola, soc un/a estudiant.   |   "Hola," conté 2 vocals.
                            |   "soc" conté 1 vocals.
                            |   "un/a" conté 2 vocals.
                            |   "estudiant" conté 4 vocals.
                            |   La frase conté 4 paraules i 9 vocals en total.
*/
import java.util.*;
public class ProvaP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriu la frase per comptar vocals: ");
        String frase = sc.nextLine().toUpperCase(), vocals = "AEIOU", paraula = "";

        int total_voc = 0, paraula_voc = 0, numParaules = 0, punt_partida = 0, punt_final = 0; // difertents variables utils


        for (int i = 0; i < frase.length(); i++) {  //Iteració per anar lletra a lletra

            if (frase.charAt(i) == ' ' || frase.charAt(i) == '.') { //comparació per determinar les vocals a la paraula per separat
                punt_final = i; //punt de partida per a la substracció
                paraula = frase.substring(punt_partida, punt_final); //substracció de la frase per paraules

                for (int j = 0; j < paraula.length(); j++) {  //Iteració per anar lletra a lletra de la substracció
                    for (int l = 0; l < vocals.length(); l++) { //iteració per comparar la lletra amb les vocals
                        if (vocals.charAt(l) == paraula.charAt(j)) {
                            paraula_voc++;
                            total_voc++;
                        }
                    }
                }

                System.out.println(frase.substring(punt_partida,punt_final) + " conté " + paraula_voc + " vocals.");
                numParaules++;
                punt_partida = i+1; //punt final i punt inicial s'intercanvien
                paraula_voc = 0;
            }
        }
        System.out.println("La frase conté " + numParaules + " paraules" + " i " + total_voc + " vocals en total.");
    }
}
