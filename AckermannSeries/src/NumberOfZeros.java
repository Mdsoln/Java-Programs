import java.util.Scanner;

public class NumberOfZeros {
    public static int zeros(int number){
        if (number == 0){
            return 0;
        }
        else {
            int lastDigit = number%10;
            if (lastDigit == 0){
                return 1+zeros(number/10);
            }
            else {
                return zeros(number/10);
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int numberOfZeros = zeros(number);
        System.out.print("Number of zeros in "+number+" is "+numberOfZeros);
    }
}
