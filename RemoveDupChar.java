/*************************************************************************************************
 * This code is written by Aadvika Ahuja (student of The Shriram Millennium School, Noida INDIA).
 * It can not be copied and/or distributed without the express permission of author.
 * For more info please contact author via e-mail aadvika.ahuja@gmail.com.
 *************************************************************************************************/

/*
 * Program to remove duplicate characters from a word
 * Example: school => schol
 *          aaabbccdd => abcd
 */

import java.util.*;
class RemoveDupChar
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word : ");
        String str = sc.next();
        int length = str.length();
        char ch;
        String ans="";

        for(int i=0; i<length; i++)
        {
            ch = str.charAt(i);
            if(ch!=' ')
                ans = ans + ch;

            //Replace all occurrence of this current char with space
            str = str.replace(ch,' ');
        }

        System.out.println("Word after removing duplicate characters is : " + ans);
    }
}
