import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = {"Amar","Akbar","Anthony"};
        int[] a = new int[3], h = new int[3];

        for(int i=0;i<3;i++){
            a[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }

        int y = 0, t = 0;
        for(int i=1;i<3;i++){
            if(a[i] < a[y]) y = i;
            if(h[i] > h[t]) t = i;
        }

        System.out.println("Youngest: " + n[y]);
        System.out.println("Tallest: " + n[t]);
    }
}
