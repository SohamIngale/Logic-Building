class EO{
	public static void main(String arg[]){
	Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
	if(num%2==0){
	System.out.println("it's EVEN");
	}
	else{
	System.out.println("it's ODD");
	}
	}
}