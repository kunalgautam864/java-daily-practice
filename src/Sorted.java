import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element in array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element of array");
        for (int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]<arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
