public class Countdigitusingrecursion {
    public static int Countdigits(int num){
        if (num<=9) return 1;
        else return 1+Countdigits(num/10);
    }
    public static void main(String[] args) {
        int num=987645;
        System.out.println(Countdigits(num));
    }
}
