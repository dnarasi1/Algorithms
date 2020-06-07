/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

/**
 *
 * @author Hello
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
