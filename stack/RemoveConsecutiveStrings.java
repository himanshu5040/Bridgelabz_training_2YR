package stack;
import java.util.Stack;

public class RemoveConsecutiveStrings {

    public static void main(String[] args) {

        String arr[] = {"ab","aa","aa","bad","ab"};
        Stack<String> stack = new Stack<>();

        for(String s : arr) {

            if(stack.isEmpty() || !stack.peek().equals(s)) {
                stack.push(s);
            }
        }

        System.out.println(stack);
    }
}