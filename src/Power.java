import java.util.Scanner;

public class Power {
    static int calculatepow(int num,int pow){
        if (pow==0){
            return 1;
        }
        else return num*calculatepow(num,pow-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base number");
        int num=sc.nextInt();
        System.out.println("enter the power");
        int pow=sc.nextInt();
        System.out.println(calculatepow(num,pow));

    }
}
