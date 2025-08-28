import java.util.*;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] d = new double[n][3];
        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            double h, w;
            while (true) {
                h = sc.nextDouble();
                w = sc.nextDouble();
                if (h > 0 && w > 0) break;
            }
            d[i][0] = h;
            d[i][1] = w;
            d[i][2] = w / (h * h);
        }

        for (int i = 0; i < n; i++) {
            double bmi = d[i][2];
            if (bmi <= 18.4) s[i] = "Underweight";
            else if (bmi <= 24.9) s[i] = "Normal";
            else if (bmi <= 39.9) s[i] = "Overweight";
            else s[i] = "Obese";
        }

        System.out.println("Height   Weight   BMI      Status");
        for (int i = 0; i < n; i++)
            System.out.printf("%.2f    %.2f    %.2f    %s%n", d[i][0], d[i][1], d[i][2], s[i]);
    }
}
