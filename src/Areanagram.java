import java.util.Arrays;

public class Areanagram {
    public static boolean areAnagram(String str1,String str2){
        if (str1.length()!=str2.length()) return false;

        char[]arr1=str1.toCharArray();
        char[]arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {
        String str1="kunal",str2="lanuk";
        System.out.println("Are anagram:"+areAnagram(str1,str2));
    }  
}
