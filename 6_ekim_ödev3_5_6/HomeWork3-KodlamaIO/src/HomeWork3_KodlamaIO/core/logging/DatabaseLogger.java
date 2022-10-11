package HomeWork3_KodlamaIO.core.logging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) { // Logger simulation
		System.out.println("Logged to database: " + data);

	}

}
