class Student{

	String name = "Rohan";
	int english=80;
	int maths=70;
	int evs=60;

	
	public static void main(String arg[]){
	
	Student std = new Student();
	String a = std.name;
	float b = std.average();
	int c = std.totalmarks();
	System.out.println("Name: " + a);
	System.out.println("total marks of Rohan: " + c);
	System.out.println("average marks of Rohan: " + b);
	}
	

	int totalmarks(){

	int marks = (english + maths + evs);
	return marks;

	}
	
	float average(){
	float avg = (english + maths + evs)/3;
	return avg;
	}
	
}