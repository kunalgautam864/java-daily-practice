package apnacollege;

import java.util.Scanner;

public class DisplayCout {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int countpositive=0;
        int countnegative=0;
        int countzeros=0;


        char choice;
        do
        {
            System.out.println("enter number  you want:");
            int n=sc.nextInt();
            if (n<0)
            {
              countnegative++;
            }
            else if (n>0)
            {
                countpositive++;
            }
            else {
                countzeros++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);

        }while (choice=='y' || choice=='Y');

//        final output
        System.out.println("\n result \n");
        System.out.println("positive:"+countpositive);
        System.out.println("negative:"+countnegative);
        System.out.println("zeros:"+countzeros);

sc.close();
    }
}
