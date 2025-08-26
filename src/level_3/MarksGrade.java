import java.util.Scanner;
public class MarksGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        int phy = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chem = sc.nextInt();
        System.out.print("Enter Math marks: ");
        int math = sc.nextInt();
        int total = phy + chem + math;
        double avg = total / 3.0;
        System.out.println("Average Marks: " + avg);
        if(avg >= 80) System.out.println("Grade: A (Level 4, above agency-normalized standards)");
        else if(avg >= 70) System.out.println("Grade: B (Level 3, at agency-normalized standards)");
        else if(avg >= 60) System.out.println("Grade: C (Level 2, below, but approaching agency-normalized standards)");
        else if(avg >= 50) System.out.println("Grade: D (Level 1, well below agency-normalized standards)");
        else if(avg >= 40) System.out.println("Grade: E (Level 1-, too below agency-normalized standards)");
        else System.out.println("Grade: R (Remedial standards)");
    }
}