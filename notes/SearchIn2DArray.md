```
class Solution{
	static int search(int [][] [] arr, int n){
		for(int row = 0; row < arr.length; row++){
			for(int col = 0; col < arr[row].length; col++){
				if(n == arr[row][col]){
					int element = arr[row][col];
					return element;
				}
				return -1;
			}
		}
	}
}
```

```
class Solution{
	static int search(int [][] [] arr, int n){
		for(int row = 0; row < arr.length; row++){
			for(int col = 0; col < arr[row].length; col++){
				if(n == arr[row][col]){
					return new [] int {row, col};
				}
				return -1;
			}
		}
	}
}
```

