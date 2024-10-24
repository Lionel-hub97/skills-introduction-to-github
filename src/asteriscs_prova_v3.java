import java.util.Scanner;

public class asteriscs_prova_v3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Mida de la base del triangle: n = ");
        int num = (sc.nextInt()+1)/2;
        if (num > 0){
            for (int i = 0; i < num; i++){
                System.out.println(" ".repeat(i) + "* ".repeat(num-i));
            }
        }
    }
}