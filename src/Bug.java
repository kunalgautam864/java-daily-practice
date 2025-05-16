import java.util.Scanner;

public class Bug{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        // Check if number is even or odd (Bug: Logical error)
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // Loop to print numbers from 1 to num (Bug: Syntax error)
        for (int i = 1; i <= num; i++)
            System.out.println("number"+ i);

        scanner.close();
    }
}
