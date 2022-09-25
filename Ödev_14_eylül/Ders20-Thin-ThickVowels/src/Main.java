
public class Main {
	//Türkçe karakter ile ilgili hata yaratabilir.Onun haricinde çalışıyor. Hata bulursanız yazabilirsiniz.
	// It may create some problems with Turkish chars. except this it works well.
	//En alttaki yorum satırında Engin hocanın çözümü yer alıyor.
	public static void main(String[] args) {
		String letter = "Ü";

		String[] thinVowels = { "E", "İ", "Ö", "Ü" };
		String[] thickVowels = { "A", "I", "O", "U" };
		int thinLen = thinVowels.length;
		int thickLen = thickVowels.length;
		boolean checkLetter = false;
		String[] tVowels = new String[thickLen + thinLen];// Thin +thick vowels.

		System.arraycopy(thickVowels, 0, tVowels, 0, thickLen); // copy array to new array
		System.arraycopy(thinVowels, 0, tVowels, thickLen, thinLen); // concatenate 2 different arrays
		for (String vowel : tVowels) {
			if (letter == vowel) {
				checkLetter = true;
			}
		}
		if (checkLetter == false) {
			System.out.println("Invalid Value!");
			return;
		}

		for (String vowel : thickVowels) {
			if (letter == vowel) {
				System.out.println("Thick Vowel");

			}
		}
		for (String vowel : thinVowels) {
			if (letter == vowel) {
				System.out.println("Thin Vowel");

			}
		}
		/*
		 * char letter1='A'; 
		 * switch (letter1) { 
		 * case 'A': 
		 * case 'I': 
		 * case 'O': 
		 * case 'U':
		 * 		System.out.println("Thick vowel"); 
		 * 		break;
		 * default: System.out.println("Thin vowel"); 
		 * 		break; }
		 */

	}

}
