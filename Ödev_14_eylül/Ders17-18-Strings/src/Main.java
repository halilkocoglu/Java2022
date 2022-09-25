
public class Main {

	public static void main(String[] args) {
		String message = "     Weather is so beautiful today.     ";
		System.out.println(message);
		/*
		 * System.out.println("lenght of message: " + message.length());
		 * System.out.println("5. element: " + message.charAt(4));
		 * System.out.println(message.concat("Heyyo!")); // concatenate //if u wanna
		 * cahange message as a whole, u've to // assign a new variable.
		 * System.out.println(message.startsWith("B")); // if the first letter is 'B' it
		 * turns true.Careful about // lower-upper case.
		 * System.out.println(message.endsWith(".")); // if the last element is dot it
		 * calls true.
		 * 
		 * char[] chars = new char[5]; message.getChars(0, 5, chars, 0); // it calls
		 * specifics chars between the index[0] and index[5](5 is not // involved)
		 * System.out.println(chars);
		 * 
		 * System.out.println(message.indexOf('a')); // finding a letter with letter's
		 * indexes(left to right for first // letter)
		 * System.out.println(message.lastIndexOf('o')); // right to left.
		 */
		String newMessage=message.replace(' ', '-');
		System.out.println(newMessage);
		
		System.out.println(message.substring(5)); // from 5.index
		System.out.println(message.substring(5,17)); //
		
		for (String sentence : message.split(" ")) {
			System.out.println(sentence);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		System.out.println(message.trim()); //delete the spaces in the beginning and end of the sentence. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
