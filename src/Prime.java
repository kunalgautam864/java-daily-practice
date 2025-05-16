import java.util.Scanner;

class Prime
{
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if (n%i==0){
                count++;
            }
        }
        if (count==2) {
            System.out.println("it is prime number:"+n);
        }
        else {
            System.out.println("it is not prime");
        }
    }
}
