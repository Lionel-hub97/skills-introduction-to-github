package HePasadoElParcial;
public class JuegoFrutal {
    public static void main(String[] args) {
        entrarLugar();
    }

    public static void entrarLugar() {
        System.out.println("Has entrado al mercado de peras y manzanas.");
        System.out.println("Miras a tu alrededor... ¡Qué lugar tan interesante!");

        try {
            Thread.sleep(3000); // Pausa de 3 segundos
        } catch (InterruptedException e) {
            System.out.println("Algo interrumpió tu experiencia.");
        }

        System.out.println("Sales automáticamente del mercado.");
        // Lógica para continuar con el juego
        menuPrincipal(); // Por ejemplo, volver al menú principal
    }

    public static void menuPrincipal() {
        System.out.println("Estás de vuelta en el menú principal.");
        // Aquí podrías continuar con otras opciones del juego
    }
}
