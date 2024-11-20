package AntesParcial1;

import java.util.Scanner;
public class paraules_iguals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pasame la seauencia:");
        String primera = sc.next(), seg = "";
        if (primera.equals("fi") || primera.equals("")) {
            System.out.println("Escribe algo que yo como programa no peto");
        }else {
            while (!seg.equals("fi") && !seg.equals(primera)) {
                seg = sc.next().substring(0);
            }
            if (seg.equals("fi"))
                System.out.println("No hi han repeticions");
            else if (seg.equals(primera))
                System.out.println("Hi han repeticions" + primera);
            else
                System.out.println("Pillin no acaba en fi");
        }
    }
}
