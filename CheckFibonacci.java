/***************************************************************************************
 * This code is written by Aadvika Ahuja (student of The Shriram Millennium School).
 * It can not be copied and/or distributed without the express permission of author.
 * For more info please contact author via e-mail aadvika.ahuja@gmail.com
 ***************************************************************************************/

//To check if a number is fibonacci or not

public class CheckFibonacci {

    public static void main(String[] args) {
        int n = 35;
        boolean isFib = checkFibonacci(n);
        System.out.println("isFib = " + isFib);
    }

    //number is fibonacci if 5*n*n+4 or 5*n*n-4 is perfect square
    static boolean checkFibonacci(int n) {
        if(isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4))
            return true;
        else
            return false;
    }

    //function to check if a number is perfect square
    static boolean isPerfectSquare(int n) {
        int x = (int) Math.sqrt(n);
        if(x*x == n) return true;
        else return false;
    }
}
