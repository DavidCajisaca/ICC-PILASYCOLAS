import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de signos:");
        String inputParentheses = scanner.nextLine();
        boolean valid = SignValidator.isValid(inputParentheses);
        System.out.println( valid);
        Stack<String> stack = new Stack<>(); 
        System.out.println("Ingrese elementos para el stack uno por uno (presione Enter sin ingresar nada para terminar):");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                if (stack.isEmpty()) {
                    System.out.println("Stack vacio.  ingrese al menos un elemento antes de terminar.");
                    continue;
                }
                break;
            }

            stack.push(input);
        }

        StackSorter sorter = new StackSorter();

        System.out.print("Stack original: ");
        sorter.printStack(stack);

        sorter.sortStack(stack);

        System.out.print("Stack ordenado: ");
        sorter.printStack(stack);

        scanner.close();
    }
}
