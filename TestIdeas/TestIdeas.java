package TestIdeas;

import java.security.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestIdeas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       //getting current date and time using Date class
	       DateFormat df = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
	       Date dateobj = new Date();
	       System.out.println(df.format(dateobj));

	       /*getting current date time using calendar class 
	        * An Alternative of above*/
	       Calendar calobj = Calendar.getInstance();
	       System.out.println(df.format(calobj.getTime()));
	}

}
