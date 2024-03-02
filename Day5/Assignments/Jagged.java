/*
						//SIMPLE MATRIX
class MatrixDemo{
	public static void main(String args[]){
	
	int m[][] = {{10,20}, {30,40},{50,60}};	
	
	for(int i=0; i<3;i++){
		for(int j=0;j<2;j++){
		System.out.print(m[i][j] + " ");	
		}
	System.out.println();	
	}
	
}}


*/




/*
 						//INPUT VARS IN MATRIX
import java.util.Scanner;
class IPMatrixDemo{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter values for a 2x2 matrix: ");
	int m[][] = new int[2][2];
	
	for(int i=0; i<2;i++){
		for(int j=0;j<2;j++){
		m[i][j] = sc.nextInt();
		}
	}
	System.out.println("The matrix is:  ");
	for(int i=0; i<2;i++){
		for(int j=0;j<2;j++){
		System.out.print(m[i][j] + " ");	
		}
	System.out.println();	
	}
	
}}

*/



							// JAGGED ARRAY
/*
import java.util.Scanner;
class JaggedArray{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter values for a matrix: ");
	int arr[][] = new int [2][];
	arr[0] = new int[4];
	arr[1] = new int [3];
	
	for(int i=0; i<arr.length;i++){
		for(int j=0; j<arr[i].length;j++){
			arr[i][j] = sc.nextInt();
			}}
		
	for(int i=0; i<arr.length;i++){
		for(int j=0; j<arr[i].length;j++){
			System.out.print(arr[i][j]+" " );
			} 
	System.out.println();	
	}	
}			
}
*/


/*  ===================================================================
import java.util.Scanner;
class Jagged{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int arr[][] = new int[3][];
	arr[0] = new int[4];
	arr[1] = new int[5];
	arr[2] = new int[4];

	for(int i=0; i<arr[i].length; i++){
		for(int j=0; j<arr[i].length;j++){
			arr[i][j] = sc.nextInt();
	}}
	
	for(int i=0; i<arr[i].length; i++){
		for(int j=0; j<arr[i].length;j++){
			System.out.print(arr[i][j]+" ");
	}
	System.out.println();
	}	
	}}
======================================================================
*/



					//TYPE CASTING

class Casting{
	public static void main(String args[]){
	
	char c = 'a';
	byte b = 10;
	int i = 1000;
	short s = 100;
	long l = 80000;
	float f = 10.0f;
	double = 200.0
	
	int i1 = b;
	System.out.println(i1);
	
	
	int i2 = (int)b;
	System.out.println("byte "+ i2);
	
	float i3 = (float)s;
	System.out.println(i3);
	

	short i4 = (short)b;
	System.out.println(i4);
}}




































	




