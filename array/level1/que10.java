import java.util.Scanner;
class que10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n,r=0;
        while(n>0){
            r=r*10+n%10;
            n=n/10;
        }
        if(t==r) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}
