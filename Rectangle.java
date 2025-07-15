package abc;
class Rec{
	static void angle(int length,int bredth) 
	{
		int area;
		int perimeter;
		area=length*bredth;
		perimeter=2*length+bredth;
		System.out.println("the area is :"+ area);
		System.out.println("the area is :"+ perimeter);
		
	}

}
public class Rectangle {
	public static void main(String[]args) {
		Rec.angle(4, 6);
	}

}
