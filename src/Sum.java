import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int rem,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        while (num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("sum of digit are:"+sum);
        }
    }

