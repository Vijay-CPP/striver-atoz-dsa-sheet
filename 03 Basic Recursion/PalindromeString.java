//import java.lang.*;
import java.util.*; 

class PalindromeString {
    private static boolean isPalindrome(String str, int start, int end){
        if(start >= end){
            return true;
        }

        if(str.charAt(start) != str.charAt(end)){
            return false;
        }

        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = str.length();
        boolean result = isPalindrome(str, 0, length - 1);
        if(result){
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        sc.close();
    }
}