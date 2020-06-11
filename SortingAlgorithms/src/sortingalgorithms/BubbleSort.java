/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

/**
 *
 * @author dheeraj
 */

/*
    Compare the element with the next element and swap if the current element 
is greater than next element. Do it until all the elements in the array is sorted.

Time complexity: O(n^2)- Worst case
                 O(n) - Best case
Space complexity: O(1)


*/
public class BubbleSort {
    public void bubble(int[] unsorted, int length){
        for(int i =0; i<length-1;i++){
            int checker = 0;
            for(int j =0; j<length-i-1;j++){
                if(unsorted[j]>unsorted[j+1]){
                    swap(unsorted, j, j+1);
                    checker =1;
                }
            }
            if(checker==0) break;
        }
    }
    public void swap(int[] unsorted, int a, int b){
        int temp = unsorted[a];
        unsorted[a] = unsorted[b];
        unsorted[b]=temp;
    }
}
