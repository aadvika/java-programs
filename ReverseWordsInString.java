/*************************************************************************************************
 * This code is written by Aadvika Ahuja (student of The Shriram Millennium School, Noida INDIA).
 * It can not be copied and/or distributed without the express permission of author.
 * For more info please contact author via e-mail aadvika.ahuja@gmail.com.
 *************************************************************************************************/
 public class ReverseWordsInString {

    public static void main(String[] args) {
        System.out.println("ReverseWordsInString.main");
        String str = "abcd";
        int size = str.length();
        int startWord = size;
        int endWord = -1;
        String revStr = "";
        for(int i=size-1; i>=0; i--) {
            char c = str.charAt(i);
            //find space
            if(c == ' '){
                endWord = i;
                revStr = revStr + str.substring(endWord+1,startWord) + " ";
                startWord = endWord;
                endWord= -1;
            }
            if(i==0) {
                //end, last word
                revStr = revStr + str.substring(0,startWord);
            }
        }
        System.out.println("[" + revStr + "]");
    }
}
