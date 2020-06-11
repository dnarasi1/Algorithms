
public class InsertionSort {
    public void insert(int[] unsorted, int length){
        for(int i =1; i<length; i++){
            int value = unsorted[i];
            int hole = i;
            while((hole>0) && value<unsorted[hole-1]) {
                unsorted[hole] = unsorted[hole-1];
                hole--;
            }
            unsorted[hole] = value;
        }
    }
}
