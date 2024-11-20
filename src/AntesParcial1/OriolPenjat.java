package AntesParcial1;

import java.util.*;

public class OriolPenjat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intents = 0;
        Random random = new Random();
        List<Character> llista = new ArrayList<>();
        List<Character> llista_paraula = new ArrayList<>();

        enum Colors {
            BLAU, TARONJA, VERMELL, VERD, LILA,
            GROC, NEGRE, BLANC, MAGENTA, ROSA, BEIX, GRIS, MARRO;
        }

        // Escollir una paraula aleatòria
        Colors paraula2 = Colors.values()[random.nextInt(Colors.values().length)];
        StringBuilder paraula = new StringBuilder(paraula2.toString()); // Utilitzar StringBuilder

        // Inicialitzar les llistes
        for (char i : paraula.toString().toCharArray()) {
            llista_paraula.add(i); // Afegir cada caràcter a la llista de paraula correcta
            llista.add('_'); // Afegir un caràcter '_' a la llista per a l'estat actual
        }

        System.out.println("Paraula original: " + paraula); // Mostrar la paraula original
        System.out.println("Estat inicial: " + llista); // Mostrar la llista inicial amb '_'

        // Jugar fins que s'acabin els intents o es trobi la paraula
        while (intents < 5 && !llista_paraula.equals(llista)) {
            System.out.println("Escriu una possible lletra: ");
            char lletra = sc.nextLine().charAt(0);
            lletra = Character.toUpperCase(lletra);

            // Comprovar la lletra
            int result = comprovarLletra(lletra, paraula, llista);
            if (result == -1) {
                System.out.println("La lletra '" + lletra + "' NO es troba a la cadena.");
                intents++;
            } else {
                // Se ha acertado al menos una letra, no necesitas cambiar `llargada`
                System.out.println("Lletres encertades: " + llista); // Mostrar l'estat actual de la llista
            }
        }

        // Comprovar si l'usuari ha encertat la paraula
        if (llista_paraula.equals(llista)) {
            System.out.println("Has encertat la paraula " + paraula + ".");
        } else {
            System.out.println("T'has quedat sense intents, la paraula era " + paraula + ".");
        }

        // Tancar l'Scanner al final
        sc.close();
    }

    // Funció per comprovar la lletra
    private static int comprovarLletra(char lletra, StringBuilder paraula, List<Character> llista) {
        boolean found = false; // Variable per verificar si es troba la lletra
        // Recórrer cada posició de la paraula
        for (int i = 0; i < paraula.length(); i++) {
            if (paraula.charAt(i) == lletra) { // Si la lletra coincideix
                System.out.println("La lletra '" + lletra + "' es troba a la cadena a la posició: " + (i + 1));
                llista.set(i, lletra); // Actualitzar la llista amb la lletra encertada
                paraula.setCharAt(i, ' '); // Canviar la lletra a la paraula per un espai
                found = true; // Marcar que s'ha trobat la lletra
            }
        }
        return found ? 0 : -1; // Retornar 0 si es troba alguna coincidència, -1 si no
    }
}
