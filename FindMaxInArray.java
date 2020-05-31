/***************************************************************************************
 * This code is written by Aadvika Ahuja (student of The Shriram Millennium School).
 * It can not be copied and/or distributed without the express permission of author.
 * For more info please contact author via e-mail aadvika.ahuja@gmail.com
 ***************************************************************************************/

//Find the maximum element and it's first position in an unsorted integer array

public class FindMaxInArray {

    public static void main(String[] args) {

        int[] arr = {2,1,3,6,4,3,9,10,7,8,10};

        //initialize max variables to first element of the array
        int maxSoFar = arr[0];
        int maxIndexSoFar = 0;

        //Iterate through whole arary and compare each element with maxSoFar
        for(int i=0; i<=arr.length-1; i++) {
            if(arr[i] > maxSoFar) {
                //found new max
                maxSoFar = arr[i];
                maxIndexSoFar = i;
            }
        }
        System.out.println("Maximum element in array is:" + maxSoFar + " and it's index is:" + maxIndexSoFar);
    }
}
