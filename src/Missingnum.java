class Missingnum
{
    public static void main(String[] args){
        int a[]={1,2,3,4,6};
        int no_of_elements=a.length+1;
        int total_sum=no_of_elements*(no_of_elements+1)/2;
        System.out.println("total_sum:"+total_sum);
        System.out.println("-------------*------------");
        int sum=0;
        for(int x:a){
            sum=sum+x;
        }
        System.out.println("missing no is:"+(total_sum-sum));
    }
}