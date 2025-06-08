package Ejercicio_02_sorting;

import java.util.Stack;

public class StackSorter {

    public void sortStack(Stack<String> stack) {
        Stack<String> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            String current = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek().compareTo(current) > 0) {
                stack.push(tempStack.pop());
            }

            tempStack.push(current);
        }

        
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public void printStack(Stack<String> stack) {
        System.out.print("(tope) ");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i));
            if (i != 0) System.out.print(" -> ");
        }
        System.out.println();
    }
}
