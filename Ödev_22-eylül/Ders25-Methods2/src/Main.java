
public class Main {

	public static void main(String[] args) {
		String message = "Weather is so beautiful today.";
		String newMessage = message.substring(0, 2);
		System.out.println(newMessage);
		int number = plus(5, 7);
		System.out.println(number);
		int total = plus2(2, 3, 4, 5, 6);
		System.out.println(total);
	}

	public static void add() { // void operations(functions)
		System.out.println("Added.");
	}

	public static void delete() {
		System.out.println("Deleted.");
	}

	public static void update() {
		System.out.println("Updated.");
	}

	public static int plus(int num1, int num2) {

		return num1 + num2;
	}

	public static int plus2(int... numbers) { // ... = u can add integer more than one
		int total = 0;
		for (int num : numbers) {
			total += num;
		}
		return total;
	}

	public static String city() {
		return "Ankara";
	}

}
