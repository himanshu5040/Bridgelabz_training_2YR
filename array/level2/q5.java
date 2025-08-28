import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), temp = num, cnt = 0;

        while (temp != 0) {
            cnt++;
            temp /= 10;
        }

        int[] d = new int[cnt];
        temp = num;
        for (int i = 0; i < cnt; i++) {
            d[i] = temp % 10;
            temp /= 10;
        }

        int[] rev = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            rev[i] = d[cnt - 1 - i];
        }

        System.out.print("Reversed: ");
        for (int i = 0; i < cnt; i++) {
            System.out.print(rev[i]);
        }
    }
}
