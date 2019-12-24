package donguyennhathan.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class BaiTap3 {

	public static void main(String[] args) {
		Calendar cal= Calendar.getInstance();
		int currentYear=cal.get(Calendar.YEAR);
		int currentMonth=cal.get(Calendar.MONTH);
		int currentDay=cal.get(Calendar.DAY_OF_MONTH);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Mời bạn nhập năm sinh: ");
		String birthday= sc.next();
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		Date dateInput;
		try {
			dateInput= sdf.parse(birthday);
			cal.setTime(dateInput);
			int yearOfBirth= cal.get(Calendar.YEAR);
			int monthOfBirth=cal.get(Calendar.MONTH);
			int dayOfBirth=cal.get(Calendar.DAY_OF_MONTH);
			int tuoi=currentYear-yearOfBirth;
			if(monthOfBirth>currentMonth||dayOfBirth>currentDay)
			{
				tuoi=tuoi-1;
			}
			System.out.println("Tuổi của bạn là: "+tuoi);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
