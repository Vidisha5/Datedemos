import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Dateparsedemo {

	
	public static void main(String[] args) {
		Date d=new Date(1000000000000L);
		DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df.format(d));
		
		String s=df.format(d);
		
		System.out.println(s);
	
		try {
			Date date=df.parse(s);
			System.out.println(date.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
