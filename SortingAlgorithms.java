



public class SortingAlgorithms{

	/**
	 *	Selection Sort implementation
	 *	Complexity: O(n^2)
	 *	Space: O(1)
	 *	Description: Finds the smallest number in the array and put it in the beginning. Do this for each sub-array within the array
	 *
	 **/
	public int[] selectionSort(int[] arr) {

		int n = arr.length;

		for(int i = 0;i<n-1;i++) {
			int minIndex = i;
			for(int j = i+1;j<n;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			int tempNum = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = tempNum;
		}
		return arr;
	}

	/**
	*	Bubble sort
	*	Complexity: O(n^2)
	*	Space: O(1)
	*	Description: Repeatedly swap the lesser of two adjacent numbers as you iterate through the list, up until you reach the end.
	*/
	public int[] bubbleSort(int[] arr) {

		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length-i-1;j++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}


	public static void main(String[] args) {

		int[] arr = {5,4,3,2,1,0};
		SortingAlgorithms sort = new SortingAlgorithms();

		arr = sort.bubbleSort(arr);
		sort.printArr(arr);
	}

	public void printArr(int[] arr) {
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
}