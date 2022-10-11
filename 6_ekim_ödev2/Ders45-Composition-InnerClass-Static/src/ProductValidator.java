
public class ProductValidator {	// you can call method by class name if method is static./rare.  !! but the garbage collector is stay out of the method. 
								// if class has a constructor blocks it does not work with static methods. u've to use 'new' for the constructor.
	static {					
		System.out.println("Static Constructor Example"); //if u want to add a constructor use this fields. You can add static constructor more than once (multiple at same time)
	}
	
	public static boolean isValid(Product product) { 
		if (product.price>0 && !product.name.isEmpty()) {	
			return true;									
		}else {
			return false;
		}
		

	}

//	public static class Anotherclass{  //inner class.  The main (above) class is can not named as static. but inner's can.
//		public static void delete() {
//			
//		}
//		
//		
//		
//		
//	}



}
