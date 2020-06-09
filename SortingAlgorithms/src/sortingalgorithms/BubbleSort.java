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
public class BubbleSort {
    public void bubble(int[] unsorted, int length){
        for(int i =0; i<length-1;i++){
            for(int j =0; j<length-i-1;j++){
                if(unsorted[j]>unsorted[j+1]){
                    swap(unsorted, j, j+1);
                }
            }
        }
    }
    public void swap(int[] unsorted, int a, int b){
        int temp = unsorted[a];
        unsorted[a] = unsorted[b];
        unsorted[b]=temp;
    }
}
