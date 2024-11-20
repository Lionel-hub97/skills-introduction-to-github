package AntesParcial1;/*


*
****
********
***********
**************
***********
********
****
*


 */
import java.util.Scanner;
public class asteriscs_girado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the girado");
        int name = sc.nextInt() * 8;
        System.out.println("*");
        System.out.println("*".repeat(4));
        System.out.println("*".repeat(8));
        for (int i = 8; i < name; i += 8) {
            System.out.println("*".repeat(i) + "*".repeat(3));
        }
    }
}
