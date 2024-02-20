package Recursion;

class Fibonaci{
	public static void main(String[] args){
		System.out.print(fibonaci(7));
	}

	static int fibonaci(int n){
		if(n < 2){
			return n;
		}
		return fibonaci(n-1) + fibonaci(n-2);
	}
}