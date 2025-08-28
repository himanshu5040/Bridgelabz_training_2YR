import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maxD = 10, ind = 0;
        int[] d = new int[maxD];

        while (num != 0) {
            d[ind++] = num % 10;
            num /= 10;
            if (ind == maxD) break;
        }

        int f = 0, s = 0;
        for (int i = 0; i < ind; i++) {
            if (d[i] > f) {
                s = f;
                f = d[i];
            } else if (d[i] > s && d[i] != f) {
                s = d[i];
            }
        }

        System.out.println("Largest: " + f);
        System.out.println("Second Largest: " + s);
    }
}
