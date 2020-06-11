
public class MergeSort {
	public void merge(int[] unsorted, int[] left, int[] right) {
		int l = left.length;
		int r = right.length;
		int i =0; int j=0; int k=0;
		while(i<l && j<r) {
			unsorted[k++] = (left[i]<right[j])?left[i++]:right[j++];
		}
		while(j<r) {
			unsorted[k++]=right[j++];
		}
		while(i<l) {
			unsorted[k++]=left[i++];
		}
	}
	public void mergeSort(int unsorted[]) {
		int length = unsorted.length;
		if(length<2) return;
		int mid = length/2;
		int left[] = new int[mid];
		int right[] = new int[(length-mid)];
		for (int i = 0; i < mid; i++) {
			left[i] = unsorted[i];
		}
		for (int i = mid; i < length; i++) {
			right[i-mid] = unsorted[i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(unsorted, left, right);
	}
}
