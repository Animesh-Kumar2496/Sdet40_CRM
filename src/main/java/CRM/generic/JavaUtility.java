package CRM.generic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This class consist all java reusable acyion
 *  * @author animesh
 *
 */

public class JavaUtility {
	public int getRandomNumber(int limit) {

		return new Random().nextInt(limit);
	}

	public Object convertToAnyDataType(String dataType, DataType statrgey) {
		Object obj = null;
		if (statrgey.toString().equalsIgnoreCase("long"))
			obj = Long.parseLong(dataType);
		else if (statrgey.toString().equalsIgnoreCase("int"))
			obj = Integer.parseInt(dataType);
		else if (statrgey.toString().equalsIgnoreCase("double"))
			obj = Double.parseDouble(dataType);
		return obj;
	}
		
		/**
		 * This method is used to covert current  date time into"dd-mm-yyyy-hh-mm-sss"
		 * @return 
		 */
		public String currentTime() {
			Date date =new Date();
			SimpleDateFormat sdf=new SimpleDateFormat();
			String actualDate=sdf.format(date);
			return actualDate;
		

	}
}