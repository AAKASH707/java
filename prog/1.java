//'has a' relationship is called aggregation
//example : car has a seat 
//(association) has tow types : aggregation(weak relationship) & composition(strong relationship)

public class Aggregation {

	public static void main(String[] args) {
		Seat s1 = new Seat(2000000, "Synthetic");
		Car c1 = new Car("Black", 2020, "Petrol", s1);
		
		System.out.println(s1.price);
		System.out.println(c1.s.material);
		c1.s.fold();

	}

}

class Car {
	String color;
	int modelYear;
	String fuel;
	Seat s;
	
	Car() {}
	
	Car(String color, int modelYear, String fuel, Seat s) {
		this.color = color;
		this.fuel = fuel;
		this.modelYear = modelYear;	
		this.s =s;
		
	}
}

class Seat {
	double price;
	String material;
	
	Seat(){}
	
	Seat(double price, String material) {
		this.material = material;
		this.price = price;
	}
	
	void fold() {
		System.out.println("Foldable");
	}
}

//Contributed by Anshuman 
