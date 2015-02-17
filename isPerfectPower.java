Boolean isPower(num) {
	if (num == 0) return False;
	else if (num ==1) return True;
	else if (num == 2) return True;
	
	for(int i=2; i*i<=num; i++) {
		temp =num;
		while(temp>1) {
			if(temp%i != 0) {
				break;
			}
			temp = temp/i;
		}
		
		if(temp==1) return True;
	}
	return False;
}