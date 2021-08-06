import java.util.Scanner;

public class TestGenericStack {
    public static void main (String args[]){
        GenericStack<String> stack = new GenericStack<String>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 4 strings");

        for(int i=1; i<=4; i++){

            String input = scan.nextLine();
            stack.push(input);

        }
        System.out.println(stack);
        System.out.println(" ");
        System.out.println(stack.pop());
        System.out.println(" ");
        System.out.println(stack);
        System.out.println(" ");
        System.out.println(stack.peek());

    }
}

