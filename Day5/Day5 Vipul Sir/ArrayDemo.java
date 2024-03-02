import java.util.*;
class ArrayDemo{

	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);

	/*int arr1[] = {10,20};
	System.out.println(arr[0]);
	System.out.println(arr.length);
*/

	/*int arr[][] = {  { 10,20}, {30,40} }; 
	
	for(int i=0; i < 2; i++){
		for(int j=0; j < 2; j++){
			System.out.print(arr[i][j]+" ");
		}
	System.out.println();	
	}
*/


	/*int arr[][] = new int[2][2];
	for(int i=0; i < 2; i++){
		for(int j=0; j < 2; j++){
			arr[i][j] = sc.nextInt();
		}
	}

	for(int i=0; i < 2; i++){
		for(int j=0; j < 2; j++){
			System.out.print(arr[i][j]+" ");
		}
	System.out.println();	
	}*/
	
	/*int arr[][] = new int[2][2];
	for(int i=0; i < arr.length; i++){
		for(int j=0; j < arr.length; j++){
			arr[i][j] = sc.nextInt();
		}
	}

	for(int i=0; i < arr.length; i++){
		for(int j=0; j < arr.length; j++){
			System.out.print(arr[i][j]+" ");
		}
	System.out.println();	
	}
	// for each loop 
	for(int a[]: arr){
		for(int b : a){
		System.out.print(b+" ");
		}
	}
*/
 // jagged array
//int arr[][] = new int[2][];
//arr[0] = new int[4];
//arr[1] = new int[3]; 

//System.out.println(arr.length);
//System.out.println(arr[0].length);
//System.out.println(arr[1].length);

	/*
	for(int i=0; i < arr.length; i++){
		for(int j=0; j < arr[i].length; j++){
			arr[i][j] = sc.nextInt();
		}
	}

	for(int i=0; i < arr.length; i++){
		for(int j=0; j < arr[i].length; j++){
			System.out.print(arr[i][j]+" ");
		}
	System.out.println();	
	}*/

	int a = 10;

	a = 20; 
	System.out.println(a);

	/*int arr1[] = {10,20};
	arr1 = {1,2};
	System.out.print(arr1[0]);
*/
	int arr[] = new int[5];  

	System.out.println(arr[0]);

	arr[0] = 10;
	System.out.println(arr[0]);

	arr = new int[10];
	arr[0]=10;

	System.out.println(arr[0]+" first assign");
	arr[0]=20;
	System.out.println(arr[0]+ " Second assign");
	
	 

 


} 


}