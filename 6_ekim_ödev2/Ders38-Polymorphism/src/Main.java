
public class Main {

	public static void main(String[] args) {
//		BaseLogger [] loggers = new BaseLogger[] {new FileLogger(), new MailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//		for (BaseLogger logger : loggers) {
//			logger.log("Log Message");
//			
//		}
		
		CustomerManager customerManager = new CustomerManager(new ConsoleLogger());
		customerManager.add();
		
		
	}

}
