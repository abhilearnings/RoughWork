
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FutureDate {

	public static  void getFutureDate(){
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Calendar cal = Calendar.getInstance();
		System.out.println("My current date is " +dateFormat.format(cal.getTime()));
		cal.add(Calendar.DAY_OF_MONTH, 30);
		String newDate = dateFormat.format(cal.getTime());
	
		System.out.println("My future Date is " +newDate);
		
		//return futureDate;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getFutureDate();

	}

}
