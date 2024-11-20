package AntesParcial1;

public class NoFibonacci {
    public static void main(String[] args) {

        int x = 1, y = 0, z;
        for(int i = 0; i < 45; i++){
            z = x + y;
            x = y;
            y = z;
            for(int k = x + 1; k < y && k <= 45; k++){
                System.out.println(k);
            }
        }
        System.out.println("end");
    }
}
