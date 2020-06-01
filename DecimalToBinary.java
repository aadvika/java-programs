/*************************************************************************************************
 * This code is written by Aadvika Ahuja (student of The Shriram Millennium School, Noida INDIA).
 * It can not be copied and/or distributed without the express permission of author.
 * For more info please contact author via e-mail aadvika.ahuja@gmail.com.
 *************************************************************************************************/


//Convert a Decimal Number to Binary
// 15 => 1111
// 1 > 1
// 0 => 0
// 8 => 1000
public class DecimalToBinary {
    public static void main(String[] args) {
        int input1 = 8;
        String output1 = decimalToBinary(input1);
        System.out.println("Binary for " +  input1 + " is: " + output1);

        int input2 = 15;
        String output2 = decimalToBinary(input2);
        System.out.println("Binary for " +  input2 + " is: " + output2);
    }

    static String decimalToBinary(int n) {
        String bin = Integer.toBinaryString(n);
        return bin;
    }
}


