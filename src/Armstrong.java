import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int rem,arm=0;
//        armstrong number
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number that you want to check it is armstrong or not");
        int n=sc.nextInt();
        int c=n;
        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if (c==arm){
            System.out.println("this is Armstrong number");
        }else {
            System.out.println("this is not arm strong number");
        }
    }
}
