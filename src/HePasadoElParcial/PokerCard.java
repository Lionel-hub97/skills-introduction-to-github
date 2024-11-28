package HePasadoElParcial;
import java.util.Scanner;

public class PokerCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar valor de la carta
        System.out.println("Introduce el valor de la carta (A, 2-10, J, Q, K):");
        String value = scanner.next().toUpperCase();

        // Solicitar el palo de la carta
        System.out.println("Introduce el palo de la carta (♥, ♦, ♣, ♠):");
        char suit = scanner.next().charAt(0);

        // Validar el palo
        if (suit != '♥' && suit != '♦' && suit != '♣' && suit != '♠') {
            System.out.println("Palo inválido. Usa ♥, ♦, ♣, ♠.");
            return;
        }

        // Imprimir la carta
        printCard(value, suit);
    }

    public static void printCard(String value, char suit) {
        String topBottomBorder = "+-----------+";
        String emptyLine = "|           |";
        String valueLineTop = String.format("| %-2s        |", value);
        String valueLineBottom = String.format("|        %-2s |", value);
        String suitLine = String.format("|     %c     |", suit);

        System.out.println(topBottomBorder);
        System.out.println(valueLineTop);
        System.out.println(emptyLine);
        System.out.println(suitLine);
        System.out.println(emptyLine);
        System.out.println(valueLineBottom);
        System.out.println(topBottomBorder);
    }
}
