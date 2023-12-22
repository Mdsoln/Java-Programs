import java.util.Scanner;

public class RecursiveSequentialSearch {
    public static int sequentialSearch(int[] array, int target, int index){
        if (index > array.length){
            return -1;
        }
        else if (array[index] == target){
            return index;
        }
        else {
            return sequentialSearch(array,target,index+1);
        }
    }
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arraySize = read.nextInt();
        int[] array = new int[arraySize];

        for (int i=0; i<array.length; i++){
            System.out.print("Element: ");
            array[i] = read.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = read.nextInt();

        int index = 0;
        int result = sequentialSearch(array,target,index);
        System.out.print(target+" is at position "+result);
    }
}
