import java.util.Scanner;

public class IterativeNumberOfZeros {
    public static int numberOfZeros(int number){
        int count = 0;
        while (number != 0){
            if (number % 10 == 0){
                count++;
            }
            number /= 10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Integer: ");
        int number = scanner.nextInt();
        int numberOfZeros = numberOfZeros(number);
        System.out.print("There are "+numberOfZeros+" zeros in "+number);
    }
}
