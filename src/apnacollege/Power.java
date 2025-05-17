package apnacollege;

import java.util.Scanner;

public class Power {

    public static int power(int x,int n)
    {
        int result=1;
        for (int i=0;i<n;i++)
        {
            result*=x;
        }
        return result;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x:");
        int x = sc.nextInt();
        System.out.println("enter n:");
        int n = sc.nextInt();

        int result=power(x,n);
        System.out.println("x"+x+"_raised to the power_"+n+":"+result);
    }
}
