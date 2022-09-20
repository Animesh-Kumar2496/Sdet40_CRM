package CRM.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class is reusable method to handle property file 
 * @author animesh
 *
 */

public class FileUtility {
	

		Properties pro;

		public String getDataFromPropertyFile(String key) {
			return pro.getProperty(key);
		}

		public void initializePropertyFile(String filePath) throws IOException {
			FileInputStream file = new FileInputStream(filePath);
			pro = new Properties();
			pro.load(file);
		}
	
}
