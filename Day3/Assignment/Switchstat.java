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
/*class Assume{
	public static void main(String args[]){
	int i=1;
	while (i<10){
	i++;
	int j = 1;
	if (j==0) {break;}
	else if(j==1){continue;}
	System.out.println(i);
	}
	System.out.println("finished");
}
}
*/
/* loop breaks on 0; result - finished
loop goes on from 1 to 9 - result 1,2,3,4,5,6,7,8,9 and respectively for the rest given numbers */









//Q6 Switch 

/*
class Switchstat{
	public static void main(String args[]){
	int i = 8;
	switch(i){
	case 10:
		System.out.println("Congratulations you have full marks");
		break;
	case 9:
		System.out.println("Congratulations you have almost full marks");
		break;
	case 8:
		System.out.println("Congratulations you have done very well");
		break;
	case 7:
		System.out.println("Congratulations you have done well");
		break;
	case 6:
		System.out.println("you did alright");
		break;
	case 5:
		System.out.println("you only got 50%");
		break;
	case 4:
		System.out.println("you got one less than half marks,you need to do more");
		break;
	case 3:
		System.out.println("You have got low marks, see a teacher");
		break;
	case 2:
		System.out.println("You have very low marks, see a teacher");
		break;
	case 1:
		System.out.println("You got only 1 mark, see a teacher");
		break;
	default:
		System.out.println("You have failed Abysmally");
		break;
	}
}
}
*/


















    

//Q7 

class Questionseven{
	public static void main(String args[]){
	
	do{
	int i = 5;
	System.out.println(i);
	}while(i!=0);
	}
}








