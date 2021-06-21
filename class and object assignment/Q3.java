//Write a program to print the area and perimeter of a triangle having sides 
//of 3, 4 and 5 units by creating a class named 'Triangle' without any 
//parameter in its constructor.

class Triangle{
	int b,h,l;
	Triangle(){
		l = 3;
		b = 4;
		h = 5;
	}
	
	public  int calcPerimeter() {
		return (Integer) (b + l + h);
	}
	
	public float calcArea() {
		return (float)(b*h)/2;
	}
}
public class Q3 {

	public static void main(String[] args) {
		Triangle obj = new Triangle();
		System.out.println("Parameter is:"+obj.calcPerimeter());
		System.out.println("Parameter is:"+obj.calcArea());

	}

}