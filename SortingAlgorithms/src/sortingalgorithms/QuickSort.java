public class QuickSort {
	public void solution(int[] unsorted){
		quicksort(unsorted, 0, unsorted.length-1);
	}
	public void quicksort(int[] unsorted, int left, int right){
		if(left<right){
			int position = partitioner(unsorted, left, right);
			quicksort(unsorted, left, position-1);
			quicksort(unsorted, position+1, right);
		}
	}
	public int partitioner(int[] unsorted, int left, int right){
		int pivot = unsorted[right];
		int pIndex = left;
		for(int j = left; j<right;j++){
			if(unsorted[j]<pivot){
				swap(unsorted, pIndex,j);
				pIndex++;
			}
		}
		swap(unsorted, pIndex, right);
		return pIndex;
	}
	public void swap(int[] unsorted, int left, int right){
		int temp = unsorted[left];
		unsorted[left] = unsorted[right];
		unsorted[right] = temp;
	}
}
