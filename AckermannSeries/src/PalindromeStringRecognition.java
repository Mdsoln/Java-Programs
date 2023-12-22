import java.util.Scanner;

public class PalindromeStringRecognition {
    public static boolean palindrome(String word){
        /*Eg. civic,radar,level,rotor,madam,refer,kayak etc*/
       String input = word.replaceAll("\\s"," ");
       for (int i=0; i<input.length()/2; i++){
           if (input.charAt(i) != input.charAt(input.length()-1-i)){
               return false;
           }
       }
       return true;
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = read.nextLine();
        boolean output = palindrome(input);
        System.out.print("Palindrome string: "+output);
    }
}
