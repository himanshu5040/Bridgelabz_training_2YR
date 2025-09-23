import java.util.Scanner;
public class CelsiustoFahrenheitConversion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        float F = (a* 9/5) + 32;
        System.out.println(F);
    }
}
