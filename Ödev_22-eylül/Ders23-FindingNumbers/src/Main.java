
public class Main {

	public static void main(String[] args) {
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
			System.out.println(callable + " is in the numbers list.");
		} else {
			System.out.println(callable + " is not in the numbers list.");
		}

	}

}
