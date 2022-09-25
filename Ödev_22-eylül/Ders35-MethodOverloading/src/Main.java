
public class Main {

	public static void main(String[] args) {
		FourTransaction fourTransaction = new FourTransaction();
		int total= fourTransaction.plus(3,2);
		System.out.println(total);
		int total1=fourTransaction.plus(2,3,4);
		System.out.println(total1);

	}

}
