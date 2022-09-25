
public class Main {

	public static void main(String[] args) {
		boolean isItPrime = true;
		int number;
		number = 0;
		if (number == 1) {
			System.out.println(number + " is not a prime number.");
			return;
		}
		if (number < 1) {
			System.out.println(" is an invalid value.");
			System.out.println("Please enter a value grater than " + number);
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isItPrime = false;
			}

		}

		if (isItPrime == true) { // u can write 'isPrime' instead of 'isPrime==True' its mean same thing
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}

	}

}
