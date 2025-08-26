import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amar's Age: ");
        int age1 = sc.nextInt();
        System.out.print("Enter Akbar's Age: ");
        int age2 = sc.nextInt();
        System.out.print("Enter Anthony's Age: ");
        int age3 = sc.nextInt();
        System.out.print("Enter Amar's Height: ");
        int h1 = sc.nextInt();
        System.out.print("Enter Akbar's Height: ");
        int h2 = sc.nextInt();
        System.out.print("Enter Anthony's Height: ");
        int h3 = sc.nextInt();

        if (age1 < age2 && age1 < age3) {
            System.out.println("Amar is Youngest");
        } else if (age2 < age1 && age2 < age3) {
            System.out.println("Akbar is Youngest");
        } else {
            System.out.println("Anthony is Youngest");
        }

        if (h1 > h2 && h1 > h3) {
            System.out.println("Amar is Tallest");
        } else if (h2 > h1 && h2 > h3) {
            System.out.println("Akbar is Tallest");
        } else {
            System.out.println("Anthony is Tallest");
        }
    }
}
