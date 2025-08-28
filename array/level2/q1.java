import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;

        double[][] emp = new double[n][2]; 
        double[] bon = new double[n];
        double[] nSal = new double[n];

        double tBon = 0, tOld = 0, tNew = 0;

        for (int i = 0; i < n; i++) {
            double sal = sc.nextDouble();
            double yrs = sc.nextDouble();
            if (sal <= 0 || yrs < 0) { i--; continue; }
            emp[i][0] = sal;
            emp[i][1] = yrs;
        }

        for (int i = 0; i < n; i++) {
            double sal = emp[i][0], yrs = emp[i][1];
            bon[i] = (yrs > 5 ? sal * 0.05 : sal * 0.02);
            nSal[i] = sal + bon[i];
            tBon += bon[i];
            tOld += sal;
            tNew += nSal[i];
        }

        for (int i = 0; i < n; i++)
            System.out.println("Emp " + (i+1) + " | Old: " + emp[i][0] + " | Bonus: " + bon[i] + " | New: " + nSal[i]);

        System.out.println("Total Old: " + tOld + "\nTotal Bonus: " + tBon + "\nTotal New: " + tNew);
    }
}
