
public class Main {

	public static void main(String[] args) {
		GameCalculator [] calculators = new GameCalculator[] {new ManGameCalculator(),new WomanGameCalculator(), new KidGameCalculator(), new OlderGameCalculator()};
		
		for (GameCalculator calculator : calculators) {
			System.out.println(calculator.calculate());
			System.out.println(calculator.gameOver());
		}
	}
		
//		Engin Hocanın Çözümü
//		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
//		womanGameCalculator.calculate();
//		womanGameCalculator.gameOver();
}
