import java.util.Scanner;

public class TestGenericQueue {
    public static void main(String args []){
        GenericQueue<String> queue = new GenericQueue<String>();

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter 3 strings");

        for (int i=1; i<=3; i++){
            String input = scan.nextLine();
            queue.enqueue(input);
        }

        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
    }
}
