import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maxD = 10, idx = 0;
        int[] d = new int[maxD];

        while (num != 0) {
            if (idx == maxD) {
                maxD += 10;
                int[] tmp = new int[maxD];
                for (int i = 0; i < d.length; i++) tmp[i] = d[i];
                d = tmp;
            }
            d[idx++] = num % 10;
            num /= 10;
        }

        int f = 0, s = 0;
        for (int i = 0; i < idx; i++) {
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
