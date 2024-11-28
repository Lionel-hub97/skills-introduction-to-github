package HePasadoElParcial;
import java.util.*;
import java.math.*;
public class basura {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int x = random.nextInt(1,3);
        float f = (random.nextInt(25, 150) / 100f);

        float [][] preus = new float [2][10]; // [0] Para las Manzanas y [1] Para las Peras
        preus [0][0] = calcularPreu() +4; // MANZANAS
        preus [1][0] = calcularPreu()+4; //PERAS
        for (int dia = 1; dia < 10; dia++) {
            int n = random.nextInt(1,5);
            preus [0][dia] = ((preus[0][dia-1]) - calcularPreu());
            preus [1][dia] = (preus[1][dia-1]) - calcularPreu();
        }

        for (int fil=0; fil < preus.length ; fil++)
            for (int col=0; col < preus[fil].length ; col++)
                System.out.println("Element (" + (fil+1) + ", " + (col+1)+ ")="+preus[fil][col]);
        float r = calcularPreu();
        System.out.println((preus[0][0]));
        System.out.println(f);
        System.out.println((preus[1][0]) - f);
    }
    public static float calcularPreu() {
        Random random = new Random();
        int n = random.nextInt(1,5);
        float s = (Math.round(random.nextInt(25, 150) * (float)Math.pow(-1, n)));
        return (Math.round(s))/100f;
    }

}
