import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0 && num < 100) {
            int i = 100;
            while (i > 0) {
                if (i % num == 0) System.out.println(i);
                i--;
            }
        } else System.out.println("Enter Positive Integer less than 100");
    }
}

