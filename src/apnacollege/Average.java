package apnacollege;

import java.util.Scanner;

public class Average {

    public static void printaverage(int a,int b,int c)
    {
        double avg=(a+b+c)/3.0;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter num1");
        int a=sc.nextInt();
        System.out.println("enter num2");
        int b=sc.nextInt();
        System.out.println("Enter num3");
        int c=sc.nextInt();

        printaverage(a,b,c);
        sc.close();
    }
}
