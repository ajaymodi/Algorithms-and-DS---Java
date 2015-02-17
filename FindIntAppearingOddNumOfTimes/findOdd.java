public List<Integer> findOdd(arr) {
	
	List<Integer> ansList = new ArrayList<Integer>();
	Map<Integer, Integer> numMap = new HashMap<Integer, Interger>();
	
	for (int i=0; i<arr.length; i++) {
		key = arr[i];
		if (numMap.containsKey(key)) {
			numMap.put(key, numMap.get(key)+1);
		}
		else {
			numMap.put(key, 1);
		}
	}
	
	for (Integer k: numMap.keySet()) {
		Integer keyValue = numMap.get(k);
		if (keyValue % 2 !=0) {
			ansList.add(k);
		}
	}
	
	return ansList;
	
}