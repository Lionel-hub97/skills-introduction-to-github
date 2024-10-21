/* Taula de tests
  Entrada            | Sortida esperada
  -------------------------------------
        zdaa         |   Las a estan contentisimas (:
       zdaaaoa       |   No todas las a estan contentas ):
                     |
  		             |
*/
import java.util.*;
public class Contentes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a_="a";
        char a=a_.charAt(0); //a inicializada

        String pos_="es un valor que iniciliza para poder hacer if y comprobar que existan valores por la der e izq";
        char posizq = pos_.charAt(0);
        char posder = pos_.charAt(0);

        boolean contentas = false,nocontentas=false;

        System.out.println("Introduzca una palbra para verificar si esta contenta");
        String palabra=sc.nextLine();

        for (int i =0; i<palabra.length(); i++){
            char letra=palabra.charAt(i); //Recorre la palabra letra por letra

            if (letra==a){ //Comprueba que la letra sea una a

                if (i!=palabra.length()-1) { //Comprobar que la pos i no pete mirando que no sea limite por la derecha a_
                    posder = palabra.charAt(i + 1);
                }

                if (i>0) { //Comprobar que la pos i no pete mirando que no sea limite por la izquierda _a
                    posizq = palabra.charAt(i - 1);
                }




                if (a == posder||a == posizq){ //Si por la der o izq hay una a
                    contentas=true; //Estan contentas las a
                }
                else{
                    nocontentas=true; //No estan contentas las a
                }
            }
        }

        if (nocontentas==true){ //Si hay una sola a a aolas
            System.out.println("No todas las a estan contentas ):");
        }
        if (contentas==true && nocontentas==false){ //Si hay as seguidas y no hay ninguna a solas
            System.out.println("Las a estan contentisimas (:");
        }
    }
}