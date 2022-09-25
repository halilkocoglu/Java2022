
public class Main {

	public static void main(String[] args) {
		int friend1;
		int friend2;
		int total1 = 0;
		int total2 = 0;
		friend1 = 220;
		friend2 = 284;
		for (int i = 1; i < friend1; i++) {
			if (friend1 % i == 0) {
				total1 += i;
			}
		}
		for (int i = 1; i < friend2; i++) {
			if (friend2 % i == 0) {
				total2 += i;
			}
		}
		if (total2 == friend1 && total1 == friend2) {
			System.out.println(friend1 + " and " + friend2 + " are friendly numbers.");
		} else {
			System.out.println(friend1 + " and " + friend2 + " are not friendly numbers.");
		}

	}

}
