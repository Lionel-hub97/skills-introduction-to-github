import java.util.Scanner;

public class asteriscs_prova_v4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Mida de la base del triangle: n = ");
        int num = sc.nextInt() * 2;
        for (int i = 1; i < num-1; i += 2){
            System.out.println(" ".repeat((num-i)/2) + "*".repeat(i));
        }
        for (int i = 1; i < num; i += 2){
            System.out.println(" ".repeat((i-1)/2) + "*".repeat(num-i));
        }
    }
}
