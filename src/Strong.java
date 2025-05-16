import java.util.Scanner;

public class Strong {
    public static int fact(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        sc.close();
        int sum=0;
        int check=num;

        while (num!=0) {
            int digit=num%10;
            sum=sum+fact(digit);
            num=num/10;
        }
        if (check==sum) {
            System.out.println("this is strong number:"+sum+"=="+sum);
        }else{
            System.out.println("number is not strong number");
        }
    }
}
