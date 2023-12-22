import java.util.Scanner;

public class ExponentFunction {
    public static int exponent(int base,int power){
        int result = 1;
        for (int i=0; i<power; i++){
            result *= base;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int base = read.nextInt();
        System.out.print("Enter power: ");
        int power = read.nextInt();
        int result = exponent(base,power);
        System.out.print(result);
    }
}
