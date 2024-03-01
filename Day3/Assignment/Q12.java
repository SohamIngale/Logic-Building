//Q9 for loop

/*class Demo{
	public static void main(String arg[]){
	for(int i =9; i<=20; i++){
		System.out.println(i);
		}	
	}
}
*/







//Q10

/*class Wrong{
	public static void main(String arg[]){
	if(i=10){
	System.out.println("Success");
	}
	}
}

-- datatype not inserted
*/






//11

/*

class Echo{
	public static void main(String arg[]){
	int i = 1;
	while(i!=0 && i<100){
		System.out.println(i);
		i++;
		}
	}
}
// ------------what i did--------------

*/





/*
import java.util.Scanner;

class EchoNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        while (true) {
            System.out.print("Enter a number (enter 0 to exit): ");
            number = scanner.nextInt();
            
            if (number == 0) {
                System.out.println("Exiting program...");
                break;
            }
            
            System.out.println("You entered: " + number);
        }
        
        scanner.close();
    

******* READ AGAIN READ AGAIN READ AGAIN ********

*/









//Q12

/*
class Q12{
	public static void main(String arg[]){
	int i=16;
	if((i<10) || (i==15)){
	i++;
	System.out.println(i);
	}
	}
}
*/
// when i<10 or i==15 - print's the next number









//Q13

import java.util.Scanner;

class Table{
	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("ENTER A NUMBER: ");
	int num=scanner.nextInt();
	for(int i=1;i>=10;i++){
		System.out.println(i*num);
	}
	
	}
}













