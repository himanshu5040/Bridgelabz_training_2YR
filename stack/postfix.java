
import java.util.Stack;
import java.util.*;
public class postfix {
    public static int pre(char operator){
        switch (operator) {
            case '^':return 3;   
            case '*':return 2;
            case '/':return 2;
            case '+':return 1;
            case '-':return 1;
            default: return -1;
        }
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String result="";
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(s==" "){
                System.out.println(" ");
            }
            if(Character.isLetterOrDigit(c)){
                result=result+c;
            }
            else if(c=='('){
                st.push(c);
            }
            else if(c==')'){
                while (st.peek()!='(' && !st.empty()) {
                    result+=st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && st.peek()!='(' && pre(st.peek())>=pre(c)){
                    result+=st.pop();
                }
                st.push(c);
            }
        }
        while (!st.empty()) {
            result+=st.pop();
        }
        System.out.print(result);
        sc.close();
    }
}
