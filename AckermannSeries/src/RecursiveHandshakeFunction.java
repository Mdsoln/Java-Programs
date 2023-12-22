import java.util.Scanner;

public class RecursiveHandshakeFunction {
    public static int handshakes(int n){
        if (n <=1){
            return 0;
        }
        else {
            return ((n-1)+handshakes(n-1));
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int numberOfPeople = scanner.nextInt();
        int numberOfShakes = handshakes(numberOfPeople);
        System.out.print("Total number of shakes for "+numberOfPeople+" is "+numberOfShakes);
    }
}
