
public class Main {

	public static void main(String[] args) {
		int first;
		int second;
		int thirth;
		int largestNum;
		largestNum=0;
		first=5;
		second=4;
		thirth=6;
		if(first>largestNum) {
			largestNum=first;
		}
		if (second>largestNum) {
			largestNum=second;
		}
		if (thirth>largestNum) {
			largestNum=thirth;
		}
		System.out.println("The Largest number: "+largestNum);
/*Alternative Way
 * 		int first;
		int second;
		int thirth;
		int largestNum;
 * 		
		first=5;
		second=4;
		thirth=6;
		largestNum=first;
		
		if (second>largestNum) {
			largestNum=second;
		}
		if (thirth>largestNum) {
			largestNum=thirth;
		}
 */
	}

}
