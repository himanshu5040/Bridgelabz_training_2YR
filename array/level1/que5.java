import java.util.Scanner;
class que5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        int s=0;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            s+=a[i];
        }
        double avg=(double)s/a.length;
        System.out.println("sum "+s);
        System.out.println("avg "+avg);
    }
}

