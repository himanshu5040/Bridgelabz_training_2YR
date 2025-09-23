import java.util.Scanner;
public class  VolumeofaCylinder{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float h = sc.nextFloat();
        float r = sc.nextFloat();
        float v=3.14f*r*r*h;
        System.out.println(v);
}
}