import java.util.Scanner;

public class HandshakeFunction {
    public static int handshake(int n){
        int countShakes = 0;
        for (int a=0; a<n; a++){
            for (int b=a+1; b<n; b++){
                countShakes++;
            }
        }
        return countShakes;
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter number of people:");
        int people = read.nextInt();
        int numberOfShakes = handshake(people);
        System.out.print("Total number of shakes for "+people+" is "+numberOfShakes);
    }
}
