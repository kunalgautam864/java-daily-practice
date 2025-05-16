import java.util.Scanner;

public class HCF {
    // Recursive Euclidean algorithm
//    static int Euclidsol1(int a, int b) {
//        if (a == b) return a;  // Base case: if both are equal, return one of them
//        if (a > b) return Euclidsol1(a - b, b);  // Subtract smaller from larger
//        return Euclidsol1(a, b - a);
//    }
    static int Euclidsol1(int a,int b){
        if (b==0) return a;
        else return Euclidsol1(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        // Calculating GCD using the Euclidean algorithm
        int GCD = Euclidsol1(num1, num2);

        // Printing the result
        System.out.println("Greatest Common Divisor (GCD) is: " + GCD);

        sc.close();
    }
}

