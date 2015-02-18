/*
 * Write a method to compute all permutations of a string.
 * 
 * Let’s assume a given string S represented by the letters A1, A2, A3, ... , An
To permute set S, we can select the first character, A1, permute the remainder of the string to get a new list. Then, with that new list, we can “push” A1 into each possible position.
For example, if our string is “abc”, we would do the following:
1. Let first = “a” and let remainder = “bc”
2. Let list = permute(bc) = {“bc”, “cd”}
3. Push “a” into each location of “bc” (--> “abc”, “bac”, “bca”) and “cb” (--> “acb”, “cab”, “cba”)
4. Return our new list
Now, the code to do this:
1 public static ArrayList<String> getPerms(String s) {
2 ArrayList<String> permutations = new ArrayList<String>();
3 if (s == null) { // error case
4 return null;
5 } else if (s.length() == 0) { // base case
6 permutations.add(“”);
7 return permutations;
8 }
9
10 char first = s.charAt(0); // get the first character
11 String remainder = s.substring(1); // remove the first character
12 ArrayList<String> words = getPerms(remainder);
13 for (String word : words) {
14 for (int j = 0; j <= word.length(); j++) {
15 permutations.add(insertCharAt(word, first, j));
16 }
17 }
18 return permutations;
19 }
20
21 public static String insertCharAt(String word, char c, int i) {
22 String start = word.substring(0, i);
23 String end = word.substring(i);
24 return start + c + end;
25 }
This solution takes O(n!) time, since there are n! permutations.
 * 
 * 
 * 
 * 
 * 
*/
