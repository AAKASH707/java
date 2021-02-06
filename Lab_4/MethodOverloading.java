package Aggregation;

public class MethodOverload {

	public static void main(String[] args) {
		info(null);

	}
	
	static void info(String name) {
		System.out.println("xyz");
	}
	
	static void info(String name,int age) {
		System.out.println("xyz");
		System.out.println("xx");
	}

}
