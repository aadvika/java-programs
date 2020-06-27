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
