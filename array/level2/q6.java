import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        
        double[] h = new double[n];
        double[] w = new double[n];
        double[] bmi = new double[n];
        String[] st = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i+1));
            System.out.print("Enter height (m): ");
            h[i] = sc.nextDouble();
            System.out.print("Enter weight (kg): ");
            w[i] = sc.nextDouble();
        }
        
        for (int i = 0; i < n; i++) {
            bmi[i] = w[i] / (h[i] * h[i]);
            if (bmi[i] <= 18.4) st[i] = "Underweight";
            else if (bmi[i] <= 24.9) st[i] = "Normal";
            else if (bmi[i] <= 39.9) st[i] = "Overweight";
            else st[i] = "Obese";
        }
        
        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println(h[i] + "\t" + w[i] + "\t" + String.format("%.2f", bmi[i]) + "\t" + st[i]);
        }
    }
}
