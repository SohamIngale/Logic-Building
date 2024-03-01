//q1: what is wrong in the code?

/*class Pass{
	public static void main(String args[]){
	
	int i = 10;
	while(i<5){
	i++;
	System.out.println(i);
	}
*/

// execution wont be done as i = 10 and condition is asking for less than 5
	





//q2: pass/fail


/*class Pass{
	public static void main(String args[]){
	
	int i = 40;
	if(i>=40){
		System.out.println("passed");
		}
	else{
		System.out.println("failed");
		}	


}}*/








//q3 exclamation marks

/*class Exclamation{
	public static void main(String args[]){
	for(int i=0;i<10;i++){
	System.out.println('!');
	}
	}
}*/

//Result 10 exclamation marks







//q4 rewrite code
/*class Rewrite{
	public static void main(String args[]){
	int num=10;
	while (num<15){
	System.out.println("*");
	num++;
	}
	}
}*/











//q5: assume getnumber()

//assuming user input =0
class Assume{
	public static void main(String args[]){
	int i=10;
	while (i<15){
	i++;
	int j = getnumber();
	if (j==0) {break;}
	else if(j==1){continue;}
	System.out.println(i);
	}
	System.out.println("finished");
}
}


    











