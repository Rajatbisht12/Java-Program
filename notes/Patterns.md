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
		for(int row = 1; row < n; row++){
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

