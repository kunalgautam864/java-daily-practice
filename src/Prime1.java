import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args) {
        boolean isPrime;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();

        if (num<=1){
            System.out.println("it is not prime");
            return;
        }
        isPrime=true; //assume initially  number is prime

        for (int i=2;i*i<=num;i++){
           if (num%i==0){
               isPrime=false;
               break;
            }
        }
        if (isPrime)
        {
            System.out.println(num+"=it is prime");
        }
        else {
            System.out.println(num+"=it is not prime");
        }
    }
}
