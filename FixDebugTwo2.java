import java.util.Scanner;

public class FixDebugTwo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        
        System.out.println("You entered: " + num);
        
        input.close();
    }
}
