import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter number of rows of your array: ");
        int m = read.nextInt();
        System.out.print("Enter number of columns of your array: ");
        int n = read.nextInt();
        int[][] myArray = new int[m][n];

        for (int i=0; i<m; i++){
            System.out.println("Row: "+i);
            for (int j=0; j<n; j++){
                System.out.print("Element "+j+": ");
                myArray[i][j] = read.nextInt();
            }
        }
        System.out.print(Arrays.deepToString(myArray));
    }
}
