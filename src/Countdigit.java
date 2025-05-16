import java.util.Scanner;

public class Countdigit {
    public static void main(String[] args) {
        int count=0;
        Scanner r=new Scanner(System.in);
        System.out.println("enter the number that you would like to find the digit");
        int num=r.nextInt();
        while (num>0){

            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
