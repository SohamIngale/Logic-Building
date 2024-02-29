class Vehicles{
	String model;
	String colour;
	int price;

	Vehicles(){
	model = "TATA";
	colour = "WHITE";
	price = 1500000;
	}
	
	Vehicles(String m, String c, int p){
	model = m;	
	colour = c;
	price = p;
	}

	void display(){
	System.out.println("model : "+model);
	System.out.println("colour : "+colour);
	System.out.println("price : "+price);
	}

	public static void main(String args[]){
	Vehicles v1 = new Vehicles();
	v1.display();
	
	v1 = new Vehicles("MG" , "BLACK" , 100000);
	v1.display();
	System.out.println("--------------------");
	Vehicles v2 = new Vehicles();
	v2 = new Vehicles("MAHINDRA", "BLUE", 3000000);
	v2.display();
	}
	

}
