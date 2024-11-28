import java.util.Random;

public class pruebas {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int n = random.nextInt(1, 5);
            System.out.println((float)(random.nextInt(25, 150)) * (Math.pow(-1, n)));
        }
    }
}
