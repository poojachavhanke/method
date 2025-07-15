package abc;

class Function{
	int a;
	int b;

	static void add(int a,int b)
	{
		int c;
		int d;
		int e;
		int f;
		int g;
		c=a+b;
		d=a-b;
		e=a*b;
		f=a/b;
		g=a%b;
		
		System.out.println("the addition "+c);
		System.out.println("the subtraction "+d);
		System.out.println("the multiplication "+e);
		System.out.println("the division "+f);
		System.out.println("the modulo "+g);
		
		}
    }
    

public class arithmatic {
	public static void main(String[] args)
	{
	
     Function.add(100,50);
    
}
}
