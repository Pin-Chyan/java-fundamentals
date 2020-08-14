package oop;

//public class MyClass {
//	int x = 5;
//	int y = 3;
//}

//public class MyClass {
//	String fname = "John";
//	String sname = "Doe";
//	int age = 24;
//}

//public class MyClass {
//	static void myMethod() {
//		System.out.println("Hello World!");
//	}

//	public static void main(String[] args) {
//		myMethod();
//	}
//}

public class MyClass {
	// Static Method
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects");
	}

	// Public Method
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects");
	}

	public static void main(String[] args) {
		myStaticMethod(); // Call the static method
		// myPublicMethod(); This would compile an error
	
		MyClass myObj = new MyClass(); // Create an object of MyClass
		myObj.myPublicMethod(); // Call the public method on the object
	}
}