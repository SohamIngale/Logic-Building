class Room{
	
	
	int height=10;
	int width=11;
	int breadth=12;

	public static void main(String arg[]){
	
	Room r = new Room();
	int a = r.volume();
	System.out.println("Volume of Room is : " + a);
	}

	int volume(){

	int volume1 = height*width*breadth;
	//System.out.println(volume1);
	return volume1;
	}
	}


