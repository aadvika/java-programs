/***************************************************************************************
 * This code is written by Aadvika Ahuja (student of The Shriram Millennium School).
 * It can not be copied and/or distributed without the express permission of author.
 * For more info please contact author via e-mail aadvika.ahuja@gmail.com
 ***************************************************************************************/

//To check validity of Parentheses in a string.
//String contains all character of Parentheses only.
//Valid Parentheses characters = ( ) { } [ ]

import java.util.Stack;


public class ValidParentheses {

    public static void main(String[] args) {

        //Driver | Test Code
        String input1 = "{}(([])){{}}";
        boolean expected1 = true;
        boolean output1 = check(input1);
        if(expected1 == output1) {
            System.out.println("Test-1 OK");
        } else {
            System.out.println("Test-1 FAILED");
            System.out.println("for input:" + input1 + " expected:" + expected1 + " but actual:" + output1);
        }

        String input2 = "{(})";
        boolean expected2 = false;
        boolean output2 = check(input2);
        if(expected2 == output2) {
            System.out.println("Test-2 OK");
        } else {
            System.out.println("Test-2 FAILED");
            System.out.println("for input:" + input2 + " expected:" + expected2 + " but actual:" + output2);
        }

    }

    //Function to check if it's a open Parentheses character
    static boolean isOpenParaentesis(char c) {
        if(c=='{' || c=='(' || c=='[') {
            return true;
        } else {
            return false;
        }
    }

    //get the open pair for a closed Parentheses character
    static char getOpenPair(char c) {
        char rc = ' ';
        if(c == ']') rc = '[';
        if(c == ')') rc = '(';
        if(c == '}') rc = '{';
        return rc;
    }

    //Main method to check validity of string
    static boolean check(String str) {
        boolean result = true;

        //Stack to store all open Parentheses characters
        Stack<Character> pstack = new Stack<Character>();

        //Iterate through all characters of a string
        for(int i=0; i<=str.length()-1; i++) {
            char curChar = str.charAt(i);
            if(isOpenParaentesis(curChar)) {
                //if it's a open Parentheses character then push to stack
                pstack.push(curChar);
            } else {
                // we should have a matching open pair for each closed Parentheses char
                if(pstack.isEmpty()) {
                    result = false;
                    break;
                }
                char popChar = pstack.pop();
                if(popChar == getOpenPair(curChar)) {
                    continue;
                } else {
                    result = false;
                }
            }
        }

        //in the end stack should be empty
        if(!pstack.isEmpty()) {
            result = false;
        }
        //return final result
        return result;
    }
}
