
public class Main {

	public static void main(String[] args) {
		findingNumber();
	}

	public static void findingNumber() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int callable = 5;
		boolean called = false;
		for (int number : numbers) {
			if (callable == number) {
				called = true;
				break;
			}
		}
		if (called == true) {
			sendMessage(callable + " is in the numbers list.");
		} else {
			sendMessage(callable + " is not in the numbers list.");
		}

	}
	public static void sendMessage(String message) {
		System.out.println(message);
	}
}
