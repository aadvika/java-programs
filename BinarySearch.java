/*************************************************************************************************
 * This code is written by Aadvika Ahuja (student of The Shriram Millennium School, Noida INDIA).
 * It can not be copied and/or distributed without the express permission of author.
 * For more info please contact author via e-mail aadvika.ahuja@gmail.com.
 *************************************************************************************************/

//Check presence of an integer in given unsorted array of integers using Binary Search.

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println("BinarySearch.main");

        int[] input1 = {1,2,3,4,5,6,9,10,8};
        int find1 = 10;
        //sort the array if not sorted
        Arrays.sort(input1);
        boolean result1 = find(input1,find1,0,input1.length-1);
        System.out.println("result1 = " + result1);
    }

    static boolean find(int[] arr, int n, int start, int end) {
        boolean found = false;

        while((end >= start)) {
            int mid = (end + start)/2;

            if(arr[mid] == n) {
                found = true;
                break;
            }
            if(n < arr[mid]) {
                //go left
                end = mid-1;
            } else {
                //go right
                start = mid+1;
            }
        }
        return found;
    }
}
