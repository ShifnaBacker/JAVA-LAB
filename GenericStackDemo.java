import java.util.ArrayList;

// Generic Stack Class
class Stack<T> {
    private ArrayList<T> stack;

    // Constructor
    public Stack() {
        stack = new ArrayList<>();
    }

    // Push operation
    public void push(T item) {
        stack.add(item);
        System.out.println(item + " pushed into stack");
    }

    // Pop operation
    public T pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    // Display stack
    public void display() {
        System.out.println("Stack elements: " + stack);
    }
}

// Main Class
public class GenericStackDemo {
    public static void main(String[] args) {

        // Integer Stack
        Stack<Integer> intStack = new Stack<>();

        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        intStack.display();

        System.out.println("Popped: " + intStack.pop());
        intStack.display();

        // String Stack
        Stack<String> strStack = new Stack<>();

        strStack.push("A");
        strStack.push("B");
        strStack.push("C");

        strStack.display();

        System.out.println("Popped: " + strStack.pop());
        strStack.display();
    }
}