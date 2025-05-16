import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        121
        int num,r,s=0,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
        c=num;
        while(num>0){
            r=num%10;
            s=(s*10)+r;
            num=num/10;
        }
        if (c==s){
            System.out.println("yes,this is arm strong"+s);
        }
        else {
            System.out.println("no,this is not arm strong number");
        }
    }
}
