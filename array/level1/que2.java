import java.util.Scanner;
class que2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                if(a[i]%2==0)
                    System.out.println(a[i]+" positive even");
                else
                    System.out.println(a[i]+" positive odd");
            }else if(a[i]<0){
                System.out.println(a[i]+" negative");
            }else{
                System.out.println(a[i]+" zero");
            }
        }
        if(a[0]==a[4])
            System.out.println("equal");
        else if(a[0]>a[4])
            System.out.println("first greater");
        else
            System.out.println("last greater");
    }
}
