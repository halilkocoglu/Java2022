
public class Main {

	public static void main(String[] args) {
		BaseLoanManager [] loanManagers = new BaseLoanManager[] {new TeacherLoanManager(), new AgricultureLoanManager(), new StudentLoanManager()};
		for (BaseLoanManager loanManager : loanManagers) {
			System.out.println(loanManager.calculate(1000));
		}
	}

}
