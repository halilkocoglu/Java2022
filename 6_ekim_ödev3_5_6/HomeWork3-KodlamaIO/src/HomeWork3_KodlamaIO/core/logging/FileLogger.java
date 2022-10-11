package HomeWork3_KodlamaIO.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {// Logger simulation
		System.out.println("Logged to file: " + data);

	}

}
