```
class Solution{
	static int search(int [] arr, int n){
		if(arr.length == 0) return -1;
		for(int i = 0; i < arr.length; i++){
			int element = arr[i];
			if(element == n){
			return i;
			}
			return -1;
		}
	}
}
```

[[SearchIn2DArray]]