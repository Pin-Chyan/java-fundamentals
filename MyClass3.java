public class MyClass3 {


	//----------------------------------------------------------------------------------------------------

	//System.out.println("Part 16");


	static int plusMethod(int x, int y) {
		return x + y;
	}

	static double plusMethod(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		int myNum1 = plusMethod(8, 5);
		double myNum2 = plusMethod(4.3, 6.26);
		System.out.println("int: " + myNum1);
		System.out.println("double: " + myNum2);
	}
	
	
	//----------------------------------------------------------------------------------------------------

	//System.out.println("Part 15");


	//static void myMethod(String fname , int age) {
	//	System.out.println("Welcome to the club " + fname + " age of " + age);
	//}

	//static int sum(int x , int y) {
	//	return (x + y);
	//}

	//static void checkAge(int age) {
	//	if (age >= 18) {
	//		System.out.println("You are legally able to drink since you are " + age);
	//	} else {
	//		System.out.println("Not yet " + age + " you almost to the 18 limit");
	//	}
	//}

	//public static void main(String[] args) {
	//	myMethod("PC", 20);
	//	myMethod("Liam", 19);
	//	myMethod("Panda", 24);
	//	System.out.println(sum(5, 6));
	//	checkAge(20);
	//}

	//----------------------------------------------------------------------------------------------------

}