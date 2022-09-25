
public class Main {

	public static void main(String[] args) {
		// double [] myList=new double[4];
		double[] myList = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		double max = 0;
		for (double nums : myList) {
			total += nums;
			if (max < nums)
				max = nums;
			System.out.println(nums);
		}
		System.out.println(total);
		System.out.println(max);
	}

}
