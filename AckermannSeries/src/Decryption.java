import java.util.Scanner;

public class Decryption {
    public static String decryptMessage(String encryptedMessage){
        StringBuilder builder = new StringBuilder();
        char[] check = encryptedMessage.toCharArray();
        for (int i=0; i< check.length; i++){
            if (Character.isDigit(check[i])){
                int repeatCount = Character.getNumericValue(check[i]);
                builder.append(String.valueOf(check[i - 1]).repeat(Math.max(0, repeatCount)));
            }
            else {
                builder.append(check[i]);
            }
        }
        return builder.reverse().toString();
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter an encrypted message: ");
        String message = read.nextLine();
        String realMessage = decryptMessage(message);
        System.out.print("Decrypted message: "+realMessage);
    }
}
