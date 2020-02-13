import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger=Logger.getLogger("Log4j_Demo");
		
		PropertyConfigurator.configure("log4j.properties");
		
		logger.info("Sagar working fine");

	}

}
