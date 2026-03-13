package stack;
import java.util.Stack;
public class prevsmallerelement {
    public static void main(String[] args) {

        int arr[] = {1, 3, 2, 4};
        int n = arr.length;

        int result[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <n ; i++) {

            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
