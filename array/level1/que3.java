import java.util.Scanner;
class que3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] t=new int[10];
        for(int i=1;i<=10;i++){
            t[i-1]=n*i;
            System.out.println(n+" * "+i+" = "+t[i-1]);
        }
    }
}
