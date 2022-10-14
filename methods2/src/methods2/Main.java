package methods2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		String message = "The weather is good today.";
		String newMessage = city();
		// String newMessage = message.substring(0, 2);
		System.out.println(newMessage);
		int number = total(15,7);
		System.out.println(number);
		int total = total2(2,3,4);
		System.out.println(total);
		

	}

	public static void add() {
		System.out.println("Added");
	}

	public static void delete() {
		System.out.println("Deleted");
	}

	public static void update() {
		System.out.println("Updated");
	}

	public static int total(int number1,int number2) {
		return number1+number2;
	}
	
	public static int total2(int...numbers) { // üç nokta birden fazla anlamında int array göndermiş gibi
		
		int total=0;
		for (int number : numbers) {
			total+=number;
		}
		return total;
		
	}

	public static String city() {
		return "Ankara";
	}

}
