package apnacollege;

import java.util.Scanner;

public class Sumofodd {

    public static void sumofallodd(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++)
        {

            if (i%2!=0){
                sum+=i;
            }
        }
        System.out.println("sum of all odd number from 1 to_"+n+"_is:"+sum);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();

//        call fun
        sumofallodd(n);

        sc.close();
    }
}
