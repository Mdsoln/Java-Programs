public class RaggedArrays {
    public static void main(String[] args){

    }

    public static boolean isRagged(int[][] raggedArray){
        if (raggedArray == null || raggedArray.length == 0){
            return true;
        }
        int checkLength = raggedArray[0].length;
        for (int[] ints : raggedArray) {
            if (ints == null || ints.length != checkLength) {
                return true;
            }
        }
        return false;
    }
}
