
public class Main {

	public static void main(String[] args) {
		String[] students= new String [3];
		students[0]="halil";
		students[1]="ibrahim";
		students[2]="kocoglu";
		
	/*	for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}*/
		for (String student : students) {	//for each
			System.out.println(student); 
		}
		
	}

}
