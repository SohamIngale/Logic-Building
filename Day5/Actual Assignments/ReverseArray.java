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
/*
import java.util.Scanner;
class Ques2{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a digit: ");
	int a = sc.nextInt();
	for(int i =1; i<=a; i++){
		for(int j=1;j<=a-i+1;j++){
			System.out.print("*");
		}
	System.out.println();
	}
	}}

*/





//question3
/*

import java.util.Scanner;
class Ques3{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a digit: ");
	int a = sc.nextInt();

	for(int i =1; i<=a; i++){
		for(int k=i;k<=(a+1)-i;k++){
			System.out.print(" ");
		}
	for(int j=1;j<=i;j++){
			System.out.print("* ");
	}
	System.out.println();
	}
	}}
*/


/*
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
          
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
          for(int k=1;k<=(n+1)-i;k++)
          System.out.print(" ");
 
          // printing '*' in each column.
          for(int j=1;j<=i;j++)
          {
            // We print '*' for each row.
            System.out.print("* ");
          }
 
          System.out.println();
      }
    }
}

*/






//question4
/*
class Ques4 {
	public static void main(String[] args) {
	int arr[]={1,2,3,4,5};
	int sum= 0;
	for(int i=0; i<=arr.length;i++){
		sum = sum+i;
	}
	System.out.println("Sum: " +sum);     
	}
}
*/



//question5



//question6
/*
class ReverseArray{
	public static void main(String args[]){
	int arr[]={1,2,3,4,5};
	System.out.println("Original Array: ");
	for(int i=0; i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}
	System.out.println();
	System.out.println("Reverse Array: ");
	for(int i=arr.length-1; i>=0;i--){                                        //LOGIC EXPLAIN
		System.out.print(arr[i]+" ");
	}}}
*/



//QUESTION7
import java.util.Arrays;
class DupliDemo{
	public static void main(String args[]){
	int arr1[]={1,2,3,4,5};
	int arr2[]={3,4,5,6,7};
	System.out.println("Array1: " + Arrays.toString(arr1));
	
}}
