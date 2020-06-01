/*************************************************************************************************
 * This code is written by Aadvika Ahuja (student of The Shriram Millennium School, Noida INDIA).
 * It can not be copied and/or distributed without the express permission of author.
 * For more info please contact author via e-mail aadvika.ahuja@gmail.com.
 *************************************************************************************************/
 
 //check is a given string is Palindrome or not
public class CheckPalindrome {
    
    public static void main(String[] args) {
        String input = "abba";
        boolean res = isPalindrome(input);
        System.out.println("res = " + res);
        
    }

    //Method to check if string is palindrome or not
    //Returns true if string is palindrome, false otherwise
    //run to counters i(from start) and j(from end) and keep comparing characters
    static boolean isPalindrome(String str) {
        boolean result = true;
        int i=0;
        int j=str.length() -1;
        while(i<j) {
            if(str.charAt(i++) != str.charAt(j--)) {
                result = false;
            }
        }
        return result;
    }
}
