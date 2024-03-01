/*QUESTION 1
class Average{
	public static void main(String args[]){
	
	double[] a = {5,4,3,9,1,7,9};

	double avg = (a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6])/7;
	
	System.out.println("Average of numbers in array is: " + avg);	
}}
*/





/*QUESTION 2
class MinMax{
	public static void main(String args[]){
	
	int[] arr = {5,4,3,9,1,7,9};
	int min = arr[0];
	int max = arr[0];

	for(int i=1; i<arr.length; i++){
		if(arr[i]<min){
			min=arr[i];
			}
		if(arr[i]>max){
			max=arr[i];
			}
		}

	System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
}}
*/


/*REPEAT
class Mix{
	public static void main(String args[]){
	int[] arr={5,4,3,9,1,7,9};
	
	int min = arr[0];
	int max = arr[0];
	
	for(int i= 0; i<arr.length;i++){
	if(arr[i]<min){
		min = arr[i];
	}
	if(arr[i]>max){
		max = arr[i];
	}
	}
	System.out.println("min: "+min);
	System.out.println("max: "+max);
	}
}
*/






//QUESTION3


import java.util.Scanner;
class Addition{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int sum = 0;
	int t;

	for(int i=0; i<a;i++){
		t=2*(i-1);
		if(t%3==0){
			sum = sum+t;
			}
		}
	System.out.println(sum);
	}
}









/*QUESTION4	
class Matrix{
	public static void main(String args[]){
	
	int[] a = {1,2,3};
	int[] b = {4,5,6};
	int[] c = {7,8,9};
	System.out.println("Matrix 1 : ");
	System.out.println(a[0]+" "+a[1]+" "+a[2]);
	System.out.println(b[0]+" "+b[1]+" "+b[2]);
	System.out.println(c[0]+" "+c[1]+" "+c[2]);
	
	System.out.println("-------------------------------------");

	int[] d = {9,8,7};
	int[] e = {6,5,4};
	int[] f = {3,2,1};
	System.out.println("Matrix 2: ");
	System.out.println(d[0]+" "+d[1]+" "+d[2]);
	System.out.println(e[0]+" "+e[1]+" "+e[2]);
	System.out.println(f[0]+" "+f[1]+" "+f[2]);
		
}}
*/









/*QUESTION4
class Matrix{
	public static void main(String args[]){
	
	int[][] matrix1 = {	{1,2,3},
				{4,5,6},
				{7,8,9}
			  }; 


	int[][] matrix2 = {	{9,8,7},
				{6,5,4},
				{3,2,1}
			  };

	int rows = matrix1.length;
	int cols = matrix1[0].length;
	int[][] result = new int[rows][cols];
	
	for(int i =0; i<rows;i++){
		for(int j=0; j<cols; j++){
		result[i][j] = matrix1[i][j]+matrix2[i][j];
		}
	}

	System.out.println("Sum Matrix: ");
	for(int i=0; i<rows; i++){
		for(int j=0; j<cols; j++){
			System.out.println(result[i][j] + " ");
		}
		System.out.println();
	}
		
    }      
}
*/

/// DO AGAIN AND AGAIN AND UNDERSTAND THE LOGIC