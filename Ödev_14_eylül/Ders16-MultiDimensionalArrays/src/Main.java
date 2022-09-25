
public class Main {

	public static void main(String[] args) {
		String [][] citiesInTurkey= new String[3][3];
		citiesInTurkey[0][0]="Istanbul";
		citiesInTurkey[0][1]="Bolu";
		citiesInTurkey[0][2]="Duzce";
		citiesInTurkey[1][0]="Konya";
		citiesInTurkey[1][1]="Ankara";
		citiesInTurkey[1][2]="Kayseri";
		citiesInTurkey[2][0]="Aydin";
		citiesInTurkey[2][1]="Izmir";
		citiesInTurkey[2][2]="Manisa";
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(citiesInTurkey[i][j]);
			}
				System.out.println("**********************");
			
		}
	}

}
