
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int unsorted[] = {23,54,12,67,26,9,87,100};
        //SelectionSort select = new SelectionSort();
        //BubbleSort bub = new BubbleSort();
        //InsertionSort ins = new InsertionSort();
        //ins.insert(unsorted, unsorted.length);
        //bub.bubble(unsorted, unsorted.length);
        //select.selection(unsorted, unsorted.length);
        QuickSort sort = new QuickSort();
        sort.solution(unsorted);
        for(int i =0; i<unsorted.length;i++){
            System.out.println(unsorted[i]);
        }
    }
    
}
