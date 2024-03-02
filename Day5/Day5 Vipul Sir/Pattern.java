import java.util.Scanner;

class Pattern{
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the value of rows");
	int n = sc.nextInt();

	/*for(int i = 1; i<=5 ; i++){
		for(int j = 1; j<=5 ; j++){
			
			System.out.print("*"+" ");
		}	
	System.out.println();
	}*/

	/*for(int i = 1; i<=n ; i++){
		for(int j = 1; j<=n ; j++){
			
			System.out.print("*"+" ");
		}	
	System.out.println();
	}*/
	
	/*for(int i = 1; i<=n ; i++){
		for(int j = 1; j<=i ; j++){
			
			System.out.print("*"+" ");
		}	
	System.out.println();
	}*/

	
	/*for(int i = 1; i<=n ; i++){
		for(int j = 1; j<=i ; j++){
			
			System.out.print((char)65);
		}	
	System.out.println();
	}*/

	/*for(int i = 1; i<=n ; i++){
		for(int j = 65; j<65+i ; j++){
			
			System.out.print((char)j+" ");
		}	
	System.out.println();
	}*/

/*
i  j     			sop
1  65     			A->ln
   66(F)                        AB->ln
2  65					
   66	
   67(F)
3  
*/

	/*
	System.out.print("* ");
	System.out.print("* * ");
	System.out.print("* * * ");
	System.out.print("* * * *");
	System.out.print("* * * * * ");
	*/
	
	/*int count = 1;
	for(int i = 1; i<=n ; i++){
		for(int j = 1; j<=i ; j++){
			System.out.print(count++ + " ");
		}	
	System.out.println();
	}*/

	/*int count = 1;
	for(int i = 0; i<n ; i++){
		for(int j = 1; j<=i ; j++){
			System.out.print(i+j + " ");
		}	
	System.out.println();
	}*/


	/*char count = 'A';
	for(int i = 1; i<=n ; i++){
		for(int j = 1; j<=i ; j++){
			System.out.print(count++ + " ");
		}	
	System.out.println();
	}*/

	
	for(int i = 1; i<=n ; i++){
		for(int j = 1; j<=n-i+1 ; j++){
			
			System.out.print("* ");
		}	
	System.out.println();
	}
	


	}
}