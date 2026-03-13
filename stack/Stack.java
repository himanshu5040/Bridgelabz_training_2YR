package stack;
// Stack implementation using array
class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Add an element to the stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + x);
            return;
        }
        arr[++top] = x;
        System.out.println("Pushed: " + x);
    }

    // Remove the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return arr[top--];
    }

    // Return the top element without removing it
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        return -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args){
        Stack s1 = new Stack(5);

        int[] arr1 = new int[s1.capacity * 2];

        for(int i = 0; i < s1.capacity; i++){
            arr1[i] = s1.arr[i];
        }

        s1.arr = arr1;
        s1.capacity = s1.capacity * 2;
        System.out.print(s1.pop());
    } 
}