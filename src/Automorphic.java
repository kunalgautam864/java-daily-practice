import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();


        int square=num*num;

        //convert both into string
        String numstr=String.valueOf(num);
        String squarestr=String.valueOf(square);
        //check
        if (squarestr.endsWith(numstr)){
            System.out.println("it is automorphic");
        }else {
            System.out.println("it is not automorphic");
        }
    }
}
