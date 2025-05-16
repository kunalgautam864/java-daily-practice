package apnacollege;

import java.util.Scanner;

public class DynamicAverage {

    public static double calculateavg(int[] numbers)
    {
        int sum=0;
        for (int num:numbers){
            sum+=num;
        }
        return (double) sum/ numbers.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many number do you want to average:");
        int n=sc.nextInt(); //ex:4
//        store in array
        int[] numbers=new int[n];
//        loop to take input of n times

        for (int i=0;i<n;i++){
            System.out.println("enter your "+(i+1)+":");
            numbers[i]=sc.nextInt();

        }
        double avg=calculateavg(numbers);
        System.out.println("this is avg:"+avg);
        sc.close();
    }
}
