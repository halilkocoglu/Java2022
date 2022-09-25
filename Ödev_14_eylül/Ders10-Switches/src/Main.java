
public class Main {

	public static void main(String[] args) {
		char grade;
		grade='U';
		switch (grade) {
			case 'A': {
				System.out.println("Fabolus. You passed.");
				break;
			}
			case 'B': {
				System.out.println("Great. You passed");
				break;
			}
			case 'C': {
				System.out.println("Good. You passed.");
				break;
			}
			case 'D': {
				System.out.println("Not bad. You passed.");
				break;
			}
			case 'F': {
				System.out.println("What a pity! You failed!");
				break;
			}
		
		default:
			System.out.println("Entered an invaid value!!!");
			break;
		}

	
	}

}
