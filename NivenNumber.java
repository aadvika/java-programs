/*************************************************************************************************
 * This code is written by Aadvika Ahuja (student of The Shriram Millennium School, Noida INDIA).
 * It can not be copied and/or distributed without the express permission of author.
 * For more info please contact author via e-mail aadvika.ahuja@gmail.com.
 *************************************************************************************************/

/*
 * * The class NivenNumber takes input a number and checks if it a Pronic Number or not
 * Niven/Harshad Number : In recreational mathematics, a Harshad number (or Niven number),
 *                        is an integer (in base 10) that is divisible by the sum of its digits.
 * The first few Niven/Harshad numbers in base 10 are:
 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20, 21, 24, 27, 30, 36, 40, 42, 45, 48, 50, 54, 60, 63, 70
*/
import java.util.Scanner;

class NivenNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int num_ori = num, rem, sum = 0;

        //finding sum of all digits in num
        while(num>0)
        {
            rem = num%10;
            sum = sum + rem;
            num = num/10;
        }

        //Now check if num_ori divisible by sum or not
        if( (num_ori != 0) && (num_ori % sum == 0))
            System.out.println(num_ori+" is a Niven Number.");
        else
            System.out.println(num_ori+" is not a Niven Number.");
    }
}
