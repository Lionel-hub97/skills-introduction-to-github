package HePasadoElParcial;

public class Limpieza {
    public static void main(String[] args) {
        System.out.println("Texto visible antes.");
        try {
            Thread.sleep(2000); // Pausa de 2 segundos
        } catch (InterruptedException e) {
            System.out.println("Interrupción.");
        }
        separador(); // Limpia usando ANSI
        System.out.println("Texto visible después.");
    }
    public static void separador() {
        System.out.println("\n".repeat(15) + "≈".repeat(35));
        System.out.println("          NUEVA SECCIÓN          ");
        System.out.println("≈".repeat(35)+"\n");
    }



}
