
public class Main {

	public static void main(String[] args) {
		//reference type
		//CustomerManager customerManager = new CustomerManager(); //'new CustomerManager' will send in the garbage collector and the code line turn into the below line.
		CustomerManager customerManager; 
		CustomerManager customerManager2= new CustomerManager();  //stack and heap in the memory.
		customerManager=customerManager2; //customerManager2's reference become(put in the) customerManager's reference
		customerManager.Add();			 //i mean if customerManager's reference is 101 and customerManager2's reference 102
		customerManager.Remove();		//it become 102 for both of them
		customerManager.Update();
		
		int num1=10;
		int num2=20;
		num2=num1;
		num1 =30;
		System.out.println(num2);
		
		int[] numbers1 = new int[] {1,2,3};
		int[] numbers2 = new int[] {4,5,6};
		numbers2=numbers1;
		numbers1[0]=10;
		System.out.println(numbers2[0]);
	}
	
}


