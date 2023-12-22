import java.util.Scanner;

public class AckermannFunction {
    public static int A(int m, int n){
        if (m == 0){
            return n+1;
        } else if (n==0) {
            return A(m-1,1);
        }
        else {
            return A(m-1,A(m,n-1));
        }
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter value of m: ");
        int m = read.nextInt();
        System.out.print("Enter value of n: ");
        int n = read.nextInt();
        int result = A(m,n);
        System.out.print("Result of Ackermann Function: "+result);
    }
}
