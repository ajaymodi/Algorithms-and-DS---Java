public void bubbleSort(arr) {
	int i, j;
	
	for (j=arr.length-1; j>1; j--) {
		for (i=0; i<j; i++) {
			if (arr[i]>arr[i+1]) {
				swap(arr[i], arr[i+1]);
			}
		}
	}
}