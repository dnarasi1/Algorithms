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
