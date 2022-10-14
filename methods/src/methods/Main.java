package methods;

public class Main {

	public static void main(String[] args) {

		numberPuzzler();
		numberPuzzler();
		numberPuzzler();
		numberPuzzler();

	}

	// camel casing
	public static void numberPuzzler() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int findNumber = 6;
		boolean isThere = false;

		for (int number : numbers) {
			if (number == findNumber) {
				isThere = true;
				break;

			}

		}

		if (isThere) {
			sendAMessage("Number is available: " + findNumber);
		} else {
			sendAMessage("Number is not avaliable:" + findNumber);
			
		}

	}

	public static void sendAMessage(String message) {
		System.out.println(message);
	}

}
