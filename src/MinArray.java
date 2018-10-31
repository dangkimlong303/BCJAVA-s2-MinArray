public class MinArray {
    public static int minValue(int[] array){
        int index = 0;
        int min = array[0];
        for (int i = 1 ; i< array.length;i++){
            if (min > array[i]){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] array = {9,5,4,8,7,5,2};
        int index = minValue(array);

        System.out.println("The smallest element in the array id: " + array[index]);
    }
}
