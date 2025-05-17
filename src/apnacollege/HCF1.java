package apnacollege;

import java.util.Scanner;


public class HCF1 {

    public static int findhcf(int a,int b)
    {
        while (b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a take care a will be equal or greater than b:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        int result = findhcf(a, b);
        System.out.println("HCF is_:"+result);
    }
}
