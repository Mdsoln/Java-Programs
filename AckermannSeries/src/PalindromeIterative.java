import java.util.Scanner;

public class PalindromeIterative {
    public static boolean isPalindrome(String word){
        for (int i=0; i<word.length()/2; i++){
            if (word.charAt(i) != word.charAt(word.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    /**
     * alternative method
     */
    public static boolean checkIsPalindrome(String word){
        int left = 0;
        int right = word.length()-1;
        while (left < right){
            if (word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String word = scanner.nextLine();
        boolean isPalindrome = checkIsPalindrome(word);
        if (isPalindrome) {
            System.out.println("String: "+word +" is palindrome");
        }
        else {
            System.out.println("String: "+word +" is not palindrome");
        }
        boolean check = isPalindrome(word);
        if (check){
            System.out.print("String: "+word +" is palindrome");
        }
        else{
            System.out.print("String: "+word +" is not palindrome");
        }
    }
}
