import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        int sum=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        n=num;
        for (int i=1;i<num;i++){
            if (num%i==0){
                sum=sum+i;
            }
        }
        if (sum==n) {
            System.out.println("this is perfect number:"+sum);
        }else {
            System.out.println("this is not perfect number:"+num);
        }
        sc.close();
    }
}
