import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0 && num < 100) {
            for (int i = 100; i > 0; i--) if (i % num == 0) System.out.println(i);
        } else System.out.println("Enter Positive Integer less than 100");
    }
}
