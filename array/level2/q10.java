import java.util.*;
public class q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int[] f=new int[10];
        while(n>0){
            f[(int)(n%10)]++;
            n/=10;
        }
        for(int i=0;i<10;i++){
            if(f[i]>0) System.out.println(i+" "+f[i]);
        }
    }
}
