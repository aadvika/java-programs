/*************************************************************************************************
 * This code is written by Aadvika Ahuja (student of The Shriram Millennium School, Noida INDIA).
 * It can not be copied and/or distributed without the express permission of author.
 * For more info please contact author via e-mail aadvika.ahuja@gmail.com.
 *************************************************************************************************/
/*
* Program to compute sum of all elements of an array of integers
*/
public class SumOfArray {

    public static void main(String args[]) {
        //Declare and initialize array
        int[] arr = {1,2,3,4,5,6,7};
        int size = arr.length;
        int sum = 0;
        //run a loop from 0 to size-1 and keep updating sum variable
        for(int i=0; i<=size-1; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum of the array is = " + sum);
    }
}
