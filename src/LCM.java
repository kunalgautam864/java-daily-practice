import java.util.Scanner;

public class LCM {
    static int gcd(int a,int b){
        if (b==0) return a;
        else return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1:");
        int num1=sc.nextInt();
        System.out.println("enter num2:");
        int num2=sc.nextInt();
        int LCM=gcd(num1,num2);
        System.out.println("this is the LCM:"+num1*num2/LCM);
    }
}
