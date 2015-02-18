public void selectionSort(arr) {
	int a, b, min;
	
	for (a=0; a<arr.length-1; a++) {
		min = a;
		
		for (b=a+1; b<arr.length; b++) {
			if (arr[b]<arr[min]) {
				min = b;
			}
		}
		swap (arr[a], arr[min]);
	}
}