import java.util.Scanner;

public class RecursiveHandshake {
    public static int h(int number){
        if (number <= 1){
            return 0;
        }
        else{
            return (number-1)+h(number-1);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int people = scanner.nextInt();
        int numberOfHandshake = h(people);
        System.out.print("Total handshake is "+numberOfHandshake+" for "+people+" people");
    }
}
