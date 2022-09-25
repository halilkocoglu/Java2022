
public class Main {

	public static void main(String[] args) {
		int number;
		number=28;
		int total;
		total=0;
		for (int i = 1; i < number; i++) {
			if (number %i==0) {
				total+=i;
			}
		}
		if(number==total) {
			System.out.println(number + " is a perfect number.");
		}
		else {
			System.out.println(number+" is not a prefect number.");
		}
	}

}
