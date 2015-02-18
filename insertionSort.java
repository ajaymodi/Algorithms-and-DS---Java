public void insertionSort (arr) {
	int i, j;
	
	for (i=1; i<arr.length; i++) {
		long temp = a[i];
		j=i;
		
		while(j>0 && a[j-1]>temp) {
			a[j] = a[j-1];
			j--;
		}
		a[j] = temp;
	}
}