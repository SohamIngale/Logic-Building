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
class Ques5 {
	public static void main(String[] args) {
	int arr[]={5,3,9,7,1};
	int temp=0;	
	int total=0;
	for(int i=0; i<total;i++){
		for(int j=i+1; j<total;j++){
	
			if(arr[i]>arr[j]){
			temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}}}
			System.out.println(arr[total-2]); 
}}





