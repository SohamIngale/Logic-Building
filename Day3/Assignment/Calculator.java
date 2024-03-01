import java.util.Scanner;
class Calculator{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number 1: ");
	int a = sc.nextInt();

	System.out.println("enter a function + , - , * , / : ");
	char c =sc.next().charAt(0);

	System.out.println("enter a number 2: ");
	int b =sc.nextInt();


	switch(c){
	case '+':
		int addition = a+b;
		System.out.println("Addition is: " + addition);
		break;
	case '-':
		int sub = a-b;
		System.out.println("Subtraction is: " + sub);
		break;
	case '*':
		int mult = a*b;
		System.out.println("Multiplication is: " + mult);
		break;

	case '/':
		int divide = a/b;
		System.out.println("Division is: " + divide);
		break;


	default:
		System.out.println("Hagg diya bhai");
		break;	
	}
}}