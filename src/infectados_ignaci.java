import java.util.Scanner;
public class infectados_ignaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de personas: ");
        int num = sc.nextInt(), x1 = 0, x2 = 0, cont = 1;
        StringBuilder pos = new StringBuilder("");

        for (int i = 0; i <= num; i++) {
            x1 = sc.nextInt();
            for (int k = 0; k < pos.length(); k++) {
                if ((pos.substring(k,k+1)).equals(x1)) {

                }
            }
        }


    }
}