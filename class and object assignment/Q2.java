//Assign and print the roll number, phone number and address of two students 
//having names "Sam" and "John" respectively by creating two objects of class 
//'Student'.
class Student1{
	int roll_no;
	String phone_no;
	String address;
	String name;
}
public class Q2 {

	public static void main(String[] args) {
		Student1 obj1 = new Student1();
		Student1 obj2 = new Student1();
	
		System.out.println("Name:"+(obj1.name = "Sam"));
		System.out.println("Roll no:"+(obj1.roll_no = 1));
		System.out.println("Phone no:"+(obj1.phone_no = "98974512363"));
		System.out.println("Address:"+(obj1.address = "thane,maharashtra\n"));
		
		System.out.println("Name:"+(obj2.name = "John"));
		System.out.println("Roll no:"+(obj2.roll_no =2));
		System.out.println("Phone no:"+(obj2.phone_no = "1456879885"));
		System.out.println("Address:"+(obj2.address = "Mumbai,maharashtra"));
	}

}