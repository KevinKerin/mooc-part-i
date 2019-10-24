
import java.util.Arrays;


public class Main {
    
    public static void main(String[] args) {
        
        int[] values = {6, 3, 8, 1, 9, 10, 2, 4, 5, 7, 1, 12, 0, 6, 9, 4, 7, 5, 6, 2, 8, 3, 4, 1, 2, 5, 6, 70, 9, 8, 5, 9};
        
        //int[] values = {6, 3, 8, 1, 9, 10, 2, 4};
        //System.out.println(indexOfTheSmallestStartingFrom(values, 0));
        sort(values);
        
    }
    
    public static int smallest(int[] array){
        int min = array[0];
        for(int i : array){
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    
    public static int indexOfTheSmallest(int[] array){
        int minIndex = 0;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]){
                minIndex = i+1;
            }
        }
        return minIndex;
    }
        
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int minIndex = index;
        for (int i = minIndex; i < array.length-1; i++) {
            if(array[minIndex] > array[i+1]){
                minIndex = i+1;
            }
        }
        return minIndex;
    }
    
    public static void swap(int [] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++){
            int j = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, j);
            System.out.println(Arrays.toString(array));
        }
    }

}
