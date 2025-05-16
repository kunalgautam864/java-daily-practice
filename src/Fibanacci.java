import java.util.Scanner;

class Fibanacci
{
    public static void main(String[] args) {
        int a=0,b=1,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int N=sc.nextInt();
        for (int i=0;i<=N;i++){
            System.out.print(" "+a);
            result=a+b;
            a=b;
            b=result;
        }
//        System.out.println(result);
    }
}
