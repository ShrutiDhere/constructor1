// program 2:-Write a parameterized constructor to initialize id and name of the 
// student and display them .

package constructor1;

public class Students {
	int id;
	String name;
     Students(int id , String name) {
    	   this.id=id;
    	   this.name=name;
     }
     
     public void display() {
          System.out.println("Student Details : ");
          System.out.println("Student ID = " + id);
          System.out.println("Student Name = " + name);
     }
     public static void main(String[] args) {
    	 Students s= new Students(1,"Shruti");
    	 s.display();
	}
}

