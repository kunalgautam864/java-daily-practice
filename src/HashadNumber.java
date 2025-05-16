import java.util.Scanner;

public class HashadNumber {
    public static void main(String[] args) {
        int sum=0;
        //18=1+8=9 so 18 is divisible by 9 so this is hashhad number :
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        sc.close();
        int temp=num;
        while (temp!=0) {
         int digit=temp%10;
         sum=sum+digit;
         temp=temp/10;
        } 

        if (num%sum==0) {
            System.out.println(num+" this is harshadnumber");
        }
        else
        {
            System.out.println(num+" this is not harshad number");
        }

    }
}
