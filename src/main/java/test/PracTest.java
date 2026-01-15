package test;

public class PracTest {
	
	public static void main(String[] args)
	{
		
		int a = 2;
		int b = 4;		
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Hello Java Program..!!! ");
		System.out.println("A values is 2 replace as "  +a);
		System.out.println("B values is 4 replace as"  +b);
		System.out.println("");
	
		
		int n = 4;
		 
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("* ");
		    }
		    System.out.println("");
		}
		
	}
}
