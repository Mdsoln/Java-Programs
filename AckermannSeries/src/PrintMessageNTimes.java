import java.util.Scanner;

public class PrintMessageNTimes {
    public static void printMessage(int n, String message){
        for (int i=0; i<n; i++){
            System.out.println(message);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of times to print message: ");
        int times = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your message: ");
        String message = scanner.nextLine();
        printMessage(times,message);
    }
}
