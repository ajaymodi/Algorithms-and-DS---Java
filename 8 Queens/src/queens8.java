/*
 * We will use a backtracking algorithm. 
 * For each row, the column where we want to put the queen is based on checking that it does not violate the required condition.
1. For this, we need to store the column of the queen in each row as soon as we have finalized it. 
Let ColumnForRow[] be the array which stores the column number for each row.
2. The checks that are required for the three given conditions are:

»»On same Column : ColumnForRow[i] == ColumnForRow[j]
»»On same Diagonal: (ColumnForRow[i] - ColumnForRow[j] ) == ( i- j) or
(ColumnForRow[j] - ColumnForRow[i]) == (i - j)

1 int columnForRow[] = new int [8];
2 boolean check(int row) 
  {
3 	for (int i = 0; i < row; i++) 
  	{
4 		int diff = Math.abs(columnForRow[i] - columnForRow[row]);
5 		if (diff == 0 || diff == row - i) return false;
6 	}
7 	return true;
8 }
9
10 void PlaceQueen(int row)
   {
11 		if (row == 8) 
		{
12 			printBoard();
13 			return;
14 		}
15 
		for (int i = 0; i < 8; i++) 
		{
16 			columnForRow[row]=i;
17 			if(check(row)){
18 			PlaceQueen(row+1);
19 		}
20 	}
 * 
 */
