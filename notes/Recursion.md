Print the Hello world using recursion

```
class Recursion{
	public static void main(String [] args){
		message();
	}
	static void message(){
		System.out.println("Hello world");
		message1();
	}
	static void message1(){
		System.out.println("Hello world");
		message2();
	}
	static void message2(){
		System.out.println("Hello world");
		message3();
	}
	static void message3(){
		System.out.println("Hello world");
		message4();
	}
	static void message4(){
		System.out.println("Hello world");
	}
}
```

Print Numbers from 1 - 5 using recursion

```
class RecursionNumber{
	public static void main(String [] args){
		print1();
	}
	static void print1(){
		System.out.println(1);
		print2();
	}
	static void print2(){
		System.out.println(2);
		print3();
	}
	static void print3(){
		System.out.println(3);
		print4();
	}
	static void print4(){
		System.out.println(4);
		print5();
	}
	static void print5(){
		System.out.println(5);
	}
}

```

- While the function is not finished extremely it will remain in stack.
- When a function finishes executing it is removed from stack and flow of program is restored into where it is called.


Definition : Function that call itself is known as recursion.

```
class Solution{
	public static void main(String [] args){
		print(1);
	}
	static void print(int n){
		if(n == 5){
			System.out.println(5);
			return;
		}
		System.out.println(n);
		// this is called the tail recursion
		// this is the last function call
		print(n+1);
	}
}
```

- Need some base condition where it stops.
- Stack keep getting filling.
- Every cal of function of function will take some memory.
- Memory of computer will exceed the limit known as stack overflow.

[[Recursion-2]]

