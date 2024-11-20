package HePasadoElParcial;
import java.util.*;
import java.math.*;
public class OrdenarArray {
    public static void main(String[] args) {
        int n = 5;
        int[] a = {2,5,3,8,5,6,3,5,7,8,5,7,3,6,8,4,6,8};
        int[] b = {3,4,1,4,};
        int canvi;
        Arrays.sort(a);
        int k = 0;
        int [] NoRep = new int[a.length];
        NoRep [k] = a[k];
        for (int i = 0; i < (a.length)-1; i++) {
            if (a[i] != a[i+1]) {
                NoRep[k++] = a[i+1];
            }
        }
        k = 0;
        while (NoRep[k] != 0) {
            k++;
        }
        int[] resul = Arrays.copyOfRange(NoRep, 0, k);
        for (int elem : resul)
            System.out.print(elem);

    }
}

