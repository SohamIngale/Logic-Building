class Box{
	float height;
	float width;
	float breadth;
	
	Box(float h, float w, float b){
		height = h;
		width = w;	
		breadth = b;
}
	
	void getVolume(){
	float vol = height*width*breadth;
	System.out.println("Volume of the box : " + vol);
}

	void getArea(){
	float area = width*breadth;
	System.out.println("Area of the box : " + area);
}

	public static void main(String args[]){
		Box box1 = new Box(2.4f,4.4f,3.2f);
		Box box2 = new Box(3.2f,5.6f, 9.5f);
		box1.getVolume();
		box2.getVolume();
		box1.getArea();	
		box2.getArea();
}
}