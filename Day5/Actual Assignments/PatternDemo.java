/*
import java.util.Scanner;
class PatternDemo{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a digit: ");
	int a = sc.nextInt();
	for(int i =0; i<=a; i++){
		for(int j=0;j<=i;j++){
			System.out.print("*");
		}
	System.out.println();
	}
	}}

*/


//question2

import java.util.Scanner;
class Ques2{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a digit: ");
	int a = sc.nextInt();
	for(int i =0; i<=a; i++){
		for(int j=0;j<=a-1+i;j++){
			System.out.print("*");
		}
	System.out.println();
	}
	}}










