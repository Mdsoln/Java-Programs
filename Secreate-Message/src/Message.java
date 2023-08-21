import java.util.Scanner;

class NewMessage{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter your sentence: ");
       String texts = scanner.nextLine();

       String new_texts = new_version_texts(texts);
       System.out.print("Secrete message: "+new_texts);
    }

    public static String new_version_texts(String texts){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder builder = new StringBuilder(alphabet).reverse();

        StringBuilder new_builder = new StringBuilder();
        for (char c : texts.toCharArray()){
            if (Character.isLetter(c)){
                if (Character.isUpperCase(c)){
                    char chars = Character.toUpperCase(builder.charAt(alphabet.indexOf(Character.toLowerCase(c))));
                    new_builder.append(chars);
                }else {
                    new_builder.append(builder.charAt(alphabet.indexOf(c)));
                }
            }else {
                new_builder.append(c);
            }
        }
        return new_builder.toString();
    }
}