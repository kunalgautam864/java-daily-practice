public class Sumofdigitbyrecursion {
    public static int sumofdigit(int num){
        if (num==0) return 0;
        return (num%10)+sumofdigit(num/10);
    }
    public static void main(String[] args) {
        int num=456;
        System.out.println("sum of digits:"+sumofdigit(num));
    }
}
