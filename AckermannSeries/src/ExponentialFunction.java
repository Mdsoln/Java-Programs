import java.util.Scanner;

public class ExponentialFunction {
    public static long exponent(int base, int power){
        if (power == 0){
            return 1;
        }
        else {
            return base*exponent(base,power-1);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter power: ");
        int power = scanner.nextInt();
        long result = exponent(base,power);
        System.out.print("Exponential result is "+result);
    }
}
