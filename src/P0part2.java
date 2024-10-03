package P0part2;

public class P0part2 {
    public static void main (String[] args){
        int a = 31, b = 2, c = 2, d;
        d=a/b/c;
        System.out.println("El valor és: " + d);
        lolo();
        lele();
        lili();
        //lala();
        lplp();
        ldld();
        lflf();
        lglg();
        lhlh();
    }
    public static void lolo (){
        int a = 10, b = 2, c = 2, d;
        d = a / (b / c) ;
        System.out.println("El valor és: " + d);
    }

    public static void lele (){
        double x = 31, y = 3, z = 2, u; u = x / ( y / z) ;
        System.out.println("El valor és: " + u);
    }
    public static void lili (){
        int i = 2, j = 2;
        i = i * (i + j) ;
        System.out.println("El valor és: " + i);
    }
    //public static void lala (){
    //    int i = 3;
    //    float x = -1.25;
    //    i=i-x;
    //    System.out.println("El valor és: " + i);
    //}
    public static void lplp (){
        int i = 8, k =11;
        i = i % (k - 3);
        System.out.println("El valor és: " + i);
    }
    public static void ldld (){
        int a, b = 11;
        a = (b/ 3) + 2;
        System.out.println("El valor és: " + a);
    }
    public static void lflf (){
        int a, b = 10;
        a = b + 3 / 2;
        System.out.println("El valor és: " + a);
    }
    public static void lglg (){
        double x = 2.5, y = 1.3, z;
        z = (int) x% (int) y;
        System.out.println("El valor és: " + z);
    }
    public static void lhlh (){
        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println("El valor és: " + b);
    }

}