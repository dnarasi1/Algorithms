/*

Select the smallest element in the array and swap it with the first element of 
the unsorted part of array. Do it until all the elements in the array is sorted.
Time complexity: O(n^2): (Best case and worst case)
Space Complexity: O(1)
*/
public class SelectionSort {
    public void selection(int[] unsorted, int length){
        for(int i=0; i<length-1;i++){
            int min = unsorted[i];
            int index = i;
            for(int j=i+1;j<length;j++){
                if(min>unsorted[j]){
                    min = unsorted[j];
                    index =j;
                }
            }
            swap(unsorted, i,index);
        }
    }
    public void swap(int[] unsorted, int i, int j){
        int temp = unsorted[i];
        unsorted[i]=unsorted[j];
        unsorted[j]=temp;
    }
}
