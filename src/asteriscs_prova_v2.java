import java.util.Scanner;

public class asteriscs_prova_v2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Mida de la base del triangle: n = ");
        int num = sc.nextInt() * 2;
        if (num > 0){
            System.out.println(" ".repeat((num-1)/2) + "*");
            for (int i = 3; i < num-1; i += 2){
            System.out.println(" ".repeat((num-i)/2) + "*" + " ".repeat(i-2) + "*" );
        }
        System.out.println("*".repeat(num-1));
        }
    }
}
