import java.util.Random;
import java.util.Scanner;
public class PasswordGenerator {
    /*the method used to generate a unique identification id number for each member*/
    public static String generatePassword(){
        int userIdLength = 5;
        StringBuilder buffer = new StringBuilder();
        Random random = new Random();
        for (int aa=0; aa<userIdLength; aa++){
            int digits = random.nextInt(10);
            buffer.append(digits);
        }
        return "2022-04-"+buffer;
    }

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String name = read.nextLine();
        System.out.print(name+ " your identification is: "+generatePassword());
    }
}