import java.util.Scanner;

/*Only one disc could be moved at a time.
A larger disc must never be stacked above a smaller one.
One and only one extra pole could be used for intermediate storage of discs
*/
public class TowerOfHanoi {
     public static int calculateMovesOfDisks(int disks){
         if (disks == 1){
             return 1;
         }
         else {
             return 2*calculateMovesOfDisks(disks-1)+1;
         }
     }
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter number of disks: ");
         int disks = scanner.nextInt();
         int counts = calculateMovesOfDisks(disks);
         System.out.print("Number of moves "+disks+" to destination: "+counts);
     }
}
