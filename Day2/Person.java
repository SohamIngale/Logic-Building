class Person{							//made a class
	int age;						//properties of class
	float height;
	float weight;
	
	Person(){					      //default constructor
	age = 17;
	height = 6.1f;
	weight = 56.5f;
	}
	
	Person(int a, float h, float w){		//parameter constructor
	age = a;
	height = h;
	weight = w;
	}
	
	void display(){						//method
	System.out.println("age of person:  "+age);
	System.out.println("height of person : "+height);
	System.out.println("weight of person : "+weight);
	}

	public static void main(String args[]){	
	Person p1 = new Person();			//object creation
	p1.display();
	p1 = new Person(23, 6.1f, 75.5f);		//object creation with values
	p1.display();

	Person p2 = new Person();
	p2 = new Person(30, 5.4f, 60f);			//object creation with values

	p2.display();
	}

}	