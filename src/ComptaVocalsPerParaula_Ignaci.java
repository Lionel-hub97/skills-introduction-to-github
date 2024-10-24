import java.util.Scanner;
public class ComptaVocalsPerParaula_Ignaci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String aeiou="aeiou";
        String espacio=" ";
        String word="";
        int numvocal=0;
        int contpalabras=0;
        int totalvocal=0;


        System.out.println("Introduzca la frase y a contar sus vocales: ");
        String frase= sc.nextLine();
        frase=frase.toLowerCase();//Convertimos todo a minuscula para hacer una mejor lectura
        frase=frase+" "; //Añadimos este espacio para que en la ultima palabra me entre en el if

        for (int i=0;i<frase.length();i++) {
            char letra = frase.charAt(i); //Rrecorre cada letra de la frase
            word=word+letra; //Construimos una palabra porque no me acuerdo del comando que separaba palabras" "
            if (letra == espacio.charAt(0)) {//Aquí verifico si hay un espacio
                contpalabras += 1; //Añado un +1 por cada palabra identificada

                totalvocal=numvocal+totalvocal; //Y  sumo el total de palabras
                System.out.println(word+" conté "+numvocal+" vocals");
                word=""; //reseteo la palabra construida
                numvocal=0; //y también el numero de vocales de esta palabra
            } else {
                for (int j = 0; j < aeiou.length(); j++) {
                    char vocal = aeiou.charAt(j); //Recorre cada vocal del string aeiou
                    if (vocal == letra) { //Verifica si letra de la frase es = vocal del string
                        numvocal += 1;
                    }
                }
            }
        }

        System.out.println("La frase conté "+ (contpalabras) + " paraules i "+totalvocal+" vocals en total.");

    }
}
