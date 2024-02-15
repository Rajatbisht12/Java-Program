package Patterns;

public class Sixth {
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
