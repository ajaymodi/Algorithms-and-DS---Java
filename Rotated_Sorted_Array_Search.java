int search(arr, start, end, k) {
	mid = (low+high)/2
	
	if(start>high) {
		return -1
	}
	
	pivot = arr[mid]
	
	if(k==pivot) {
		return pivot
	}
	
	// Left half is sorted
	if (arr[start]<arr[mid]) {
		// Key is present in left half
		if(arr[start]<k && arr[mid]>k) {
			return search(arr, start, mid-1, k)
		}
		else {
			return search(arr, mid+1, end, k)
		}
	}
	
	else {
	//Right half is sorted
		if(arr[mid]<k && arr[end]>k) {
			return search(arr, mid+1, end, k)
		}
		else {
			return search(arr, start, mid-1, k)
		}
	}
}