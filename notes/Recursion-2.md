Why recursion ?

- It help us solving bigger/complex  problem in a simple way.
- Can convert recursion solution into iteration & vice-versa.
- Space Complexity is not constant because of recursive calls.
- It helps us in breaking down bigger problem into smaller problem.


```
	main() - > print(1) - > print(2) -> print(3) -> print(4) -> print(5)
```


Fibonacci Numbers:


| 0   | 1   | 2   | 3   | 4   | 5   | 6   | 7   |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 0   | 1   | 1   | 2   | 3   | 5   | 8   | 13  |


Code:

```
class Fibonaci{
	public static void main(String[] args){
		System.out.print(fibonaci(6));
	}

	static int fibonaci(int n){
		if(n < 2){
			return n;
		}
		return fibonaci(n-1) + fibonaci(n-2);
	}
}
```

Binary search using recursion:

$$
F(N) = O(1) + F(N/2)
$$

code:

```
class BS{
	public static void main(String [] args){
		int [] arr = {1, 2, 3, 4, 55, 66, 78};
		int target = 4;
		System.out.println(search(arr, target, 0, arr.length - 1));
	}
	static int search(int [] arr, int target, int s, int e){
		if(s > e) return -1;
		int m = s + (e - s) / 2;
		if(arr[m] == target) return m;
		if(target < arr[m]){
			return search(arr, target, s, m-1);
		}
		return search(arr, target, m+1, e);
	}
}
```

