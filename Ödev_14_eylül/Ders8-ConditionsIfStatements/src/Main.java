
public class Main {

	public static void main(String[] args) {
		boolean currencyUp=true;
		int currency;
		int currencyYesterday;
		currency=20;
		currencyYesterday= 21;
		//String equal="Currency is stable: "+currency;
		
		if(currency>currencyYesterday) {
			currencyUp=true;
		}
		else if (currency<currencyYesterday) {
			currencyUp=false;
		}
//Boolean tanımlamamış olsaydık 'else' ile eşitlik durumunu da yazabilirdik.
		if(currencyUp==true) {
			System.out.println("Currency going up");
		}
		 else if(currencyUp==false) {
			System.out.println("Currency going down");
		}

	}

}
