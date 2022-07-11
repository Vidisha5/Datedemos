import java.text.DateFormat;
import java.util.Date;

public class Dateone {

	
	public static void main(String[] args) {
		Date d=new Date(1123631685981L);
		DateFormat dateformat=DateFormat.getDateInstance();
		System.out.println(dateformat.format(d));
	}
}
