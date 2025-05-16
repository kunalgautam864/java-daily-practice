import java.util.Scanner;

public class Secondlargest {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int k=0;k<arr.length;k++){
            for (int l=k+1;l<arr.length;l++){
                if (arr[k]<arr[l]){
                    temp=arr[k];
                    arr[k]=arr[l];
                    arr[l]=temp;
                }
            }
        }
        System.out.println("this is the second largest element in array list:"+arr[1]);
    }
}
