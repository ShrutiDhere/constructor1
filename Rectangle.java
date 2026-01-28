//program 3:- Create a class Rectangle with non parameterized constructor that sets 
// length = 10 and width = 5 , print area .

package constructor1;

public class Rectangle {
	Rectangle(){
		System.out.println("Area of Rectangle is :- ");
	}
	public int Area(int Length,int Width) {
		int Area = Length * Width;
		System.out.println("Length = " + Length + " &  Width = " + Width + " , Then Area = " + Area );
		  return 0;
	}
	
	public static void main(String[] args) {
		Rectangle R= new Rectangle();
		R.Area(10, 5);
	}
}
