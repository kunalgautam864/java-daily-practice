public class Seconlargestbyrecursion {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,9,8};
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            if (a[i]>largest){
                secondlargest=largest;
                largest=a[i];
            }
            else if (a[i]>secondlargest && a[i]!=largest){
                secondlargest=a[i];
            }
        }
        System.out.println(secondlargest+" ");
    }
}
