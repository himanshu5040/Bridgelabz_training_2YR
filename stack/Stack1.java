package stack;
import java.util.Arrays;

public class Stack1 {
    int top=-1;
    
    int arr[]=new int[10];
   
    int push(int x){
        top++;
        if(top+1>=arr.length*0.75){
            int arr1[]=new int[arr.length+(50*arr.length)/100];
            for(int i=0;i<arr.length;i++){
                arr1[i]=arr[i];
            }
            arr1[top]=x;
            arr=Arrays.copyOf(arr1, arr1.length);
        }
        else {
        arr[top]=x;
        }
        
       return arr[top];
    }
    public static void main(String[] args) {
        Stack1 st=new Stack1();
        System.out.println(st.push(10));
        System.out.println(st.push(20)); 
        System.out.println(st.push(10));
        System.out.println(st.push(20)); 
        System.out.println(st.push(10));
        System.out.println(st.push(20)); 
        System.out.println(st.push(10));
        System.out.println(st.push(20)); 
        System.out.println(st.push(10));
        System.out.println(st.push(20)); 
        System.out.println(st.push(10));
        System.out.println(st.push(20)); 
        
    }
}