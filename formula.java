package abc;
   class form{
	   static void cub(float a)
	   {
		   float square;
		   float cube;
		   square = a*a;
		   cube = a*a*a;
		   System.out.println("the square is :"+square);
		   System.out.println("the cube is :"+cube);
	   }
   }

public class formula {
	public static void main(String[] args) {
		form.cub(0.2f);
	}

}
