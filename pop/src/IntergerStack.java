
import java.util.LinkedList;

public class IntergerStack {
    private LinkedList<Integer> stack = new LinkedList<>();


    public void push(int element) {
        stack.push(element);
        System.out.println("Pushed element: " + element);
    }

    public void pop() {
        if (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println("Popped element: " + poppedElement);
        }
        else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }

    public static void main(String[] args) {
        IntergerStack integerStack = new IntergerStack();

        integerStack.push(107);
        integerStack.push(248);
        integerStack.push(38000);

        integerStack.pop();
        integerStack.pop();
        integerStack.pop();
        integerStack.pop();
    }
}