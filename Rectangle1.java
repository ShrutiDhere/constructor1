// program 4:- Create a class Rectangle with Parameterized constructor to set 
// length and width , and print the area.

package constructor1;

public class Rectangle1 {
	int Length;
	int Width;
	
      Rectangle1(int Length,int Width){
    	    this.Length=Length;
    	    this.Width=Width;
      }
      public void Area() {
    	  int Area=Length*Width;
    	  System.out.println("Area of Rectangle is :- ");
    	  System.out.println("Length = " + Length + " & Width = " + Width);
    	  System.out.println("Area = " + Area);
    	  
    	 
      }
      
      
      public static void main(String[] args) {
		Rectangle1 R=new Rectangle1(10, 5);
		R.Area();
	}
}
