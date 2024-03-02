import java.util.Scanner;

class DatatypeDemo{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);

	//int a = sc.nextInt();
	//float b = sc.nextFloat();
	//char c = sc.next().charAt(0);
	//String STR = sc.next();
	//sc.next();
	//String STR1 = sc.nextLine();
	
	char c='A';
	byte b=10;
	short s=100;
	int i = 1000;

	long l=80000;

	float f = 10.0f;
	double d =100.0;

	
	int i1 = (int)l;

	//System.out.println(i1);


	short s1 = (short)l;
	//System.out.println(s1);

	byte b1 = (byte)130;
	//System.out.println(b1);
	
	
	System.out.println(c);
	int newVar = c;

	System.out.println(newVar);
	int space = 32;
	System.out.println(space);  // 32 
 	System.out.println((char)space+"SPACE"); // _SPACE
	

	//class object example
	//Student obj =   (Employee)newOBJ;

}




}