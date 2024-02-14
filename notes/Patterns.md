Approach :- 
Step 1 : No of lines = No of rows = No of times outer loop will run

Step 2 : Identify for every  row number,
 - How many column are there. 
 - Type of element in Column.
 
Step 3 : What to print  



1 . 
```
*
**
***
****
```

Code:

```
class Solution{
	public static void main(String [] args){
		pattern1(4);
	}
	static void pattern1(int n){
		for(int row = 1; row <= n; row++){
			for(int col = 1; col <= row; col++){
				System.out.print("*");
			}
			// when one row is printed we need to add a newline
			System.out.println();
		}
	}
}
```


2

```
****
****
****
****
```

Code: 

```
class Solution{
	public static void main(String [] args){
		pattern2(4);
	}
	static void pattern2(int n){
		for(int row = 1; row < n; row++){
			for(int col = 1; col <= n; col++){
				System.out.print("*");
			}
			// when one row is printed we need to add a newline
			System.out.println();
		}
	}
}
```


3 .  

```
*****
****
***
**
*
```

Formula:

$$
col = n + 1 - row
$$

$$
col = n - row
$$

Code:

```
class Solution{
	public static void main(String [] args){
		pattern3(5);
	}
	static void pattern3(int n){
		for(int row = 1; row < n; row++){
			for(int col = 1; col <= n-row+1; col++){
				System.out.print("*");
			}
			// when one row is printed we need to add a newline
			System.out.println();
		}
	}
}
```


4 

```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

Code:

```
class Solution{
	public static void main(String [] args){
		pattern4(5);
	}
	static void pattern4(int n){
		for(int row = 1; row < n; row++){
			for(int col = 1; col <= row; col++){
				System.out.print(col);
			}
			// when one row is printed we need to add a newline
			System.out.println();
		}
	}
}
```

5 

```
*
**
***
****
*****
****
***
**
*
```

Formula:

$$
row > n : 
	col = n - (row - n + 1) = 2 * n  - row - 1
$$

Code:

```
class Solution{
	public static void main(String [] args){
		pattern5(5);
	}
	static void pattern5(int n){
		for(int row = 1; row < 2 * n; row++){
			int c = row > n ? 2 * n - row - 1 : row;
			for(int col = 1; col <= c; col++){
				System.out.print("*");
			}
			// when one row is printed we need to add a newline
			System.out.println();
		}
	}
}
```


6 

Code: 

```
class Solution{
	public static void main(String [] args){
		pattern6(5);
	}
	static void pattern6(int n){
		for(int row = 1; row < 2 * n; row++){
			int c = row > n ? 2 * n - row : row;
			int noOfSpaces = n - c;
			for(int s = 0; s < noOfSpaces; s++){
				System.out.println(" ");
			}
			for(int col = 1; col <= c; col++){
				System.out.print("*");
			}
			// when one row is printed we need to add a newline
			System.out.println();
		}
	}
}
```

7 

Code: 

```
class Solution{
	public static void main(String [] args){
		pattern7(5);
	}
	static void pattern7(int n){
		for(int row = 1; row < n; row++){
			for(int s = 0; s < n - row; s++){
				System.out.print(" ");
			}
			for(int col = row; col >= 1; col--){
				System.out.print(col);
			}
			for(int col = 2; col <= row; col++){
				System.out.print(col);
			}
			// when one row is printed we need to add a newline
		}
		System.out.println();
	}
}
```