
public class Main {

	public static void main(String[] args) {
		
		
		CreditUI creditUI =new CreditUI();
		creditUI.CreditCalculate(new OgretmenKrediManager());
		creditUI.CreditCalculate(new TarimKrediManager());
		creditUI.CreditCalculate(new AskerKrediManager());
	}

}
