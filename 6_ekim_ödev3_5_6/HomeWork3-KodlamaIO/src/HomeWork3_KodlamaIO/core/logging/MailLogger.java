package HomeWork3_KodlamaIO.core.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {// Logger simulation
		System.out.println("E-mail sent: " + data);

	}

}
