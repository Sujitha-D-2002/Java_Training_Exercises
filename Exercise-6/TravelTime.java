import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

public class TravelTime {
	static int day, month, year, hour, min;
	static LocalDateTime dateNew;

	
	/*
	 * findNoOfDays method checks for no of days needed for travel
	 */
	static void findNoOfDays(int speed, int distance) {
		dateNew = LocalDateTime.of(year, month, day, hour, min);
		int time = distance / speed;

		int noOfDays = time / 8;
		int timeBal = time % 8;
		if (timeBal != 0) {
			noOfDays++;
		}
		System.out.println("No of Days:" + noOfDays + " No of hours: " + timeBal);

		int i = 0;
		LocalDate date = dateNew.toLocalDate();
		while (i < (noOfDays - 1)) {
			if (isHoliday(date)) {
				date = date.plusDays(1);
			} else {
				i++;
				date = date.plusDays(1);
			}
		}
		System.out.println("Arrival Date: " + date);
		System.out.print("Arrival Time: " + (hour + timeBal) + ":" + min);

	}

	
	/**
	 * isHoliday() method checks wheather the travelling date have any holidays
	 */
	static boolean isHoliday(LocalDate date) {
		if (date.getDayOfWeek().getValue() == 7 ||(date.getMonth().getValue() == 1 && date.getDayOfMonth()==1) || (date.getMonth().getValue() == 15 && date.getDayOfMonth()==8)
				||(date.getMonth().getValue() == 1 && date.getDayOfMonth()==26)) {
			return true;
		}
		Locale locale = Locale.ROOT;
		int weekOfMonth = date.get(WeekFields.of(locale).weekOfMonth());
		if (date.getDayOfWeek().getValue() == 6 && weekOfMonth==2) {
			return true;
		}
		return false;
	}

	/**
	 * Here validateDate() method validates the date
	 */
	static boolean validateDate(String date) {
		String datesplit[] = date.split("/");
		boolean flag = true;
		if (!(Integer.parseInt(datesplit[0]) > 0 && Integer.parseInt(datesplit[0]) <= 31)) {
			System.out.println("Invalid Day..!!");
			flag = false;
		} else {
			day = Integer.parseInt(datesplit[0]);
		}
		if (!(Integer.parseInt(datesplit[1]) > 0 && Integer.parseInt(datesplit[1]) <= 12)) {
			System.out.println("Invalid Month..!!");
			flag = false;
		} else {
			month = Integer.parseInt(datesplit[1]);
		}
		if (!(datesplit[2].length() == 4)) {
			System.out.println("Invalid Year..!!");
			flag = false;
		} else {
			year = Integer.parseInt(datesplit[2]);
		}
		return flag;
	}

	/**
	 * Here validateTime() method validates the time
	 */
	static boolean validateTime(String time) {
		boolean flag = true;
		String timesplit[] = time.split(":");
		if (!(Integer.parseInt(timesplit[0]) > 0 && Integer.parseInt(timesplit[0]) <= 24)) {
			System.out.println("Invalid hour..!!");
			flag = false;
		} else {
			hour = Integer.parseInt(timesplit[0]);
		}
		if (!(Integer.parseInt(timesplit[1]) > 0 && Integer.parseInt(timesplit[1]) <= 60)) {
			System.out.println("Invalid minute..!!");
			flag = false;
		} else {
			min = Integer.parseInt(timesplit[1]);
		}
		return flag;
	}

	
	/*
	 * Getting the date,speed,time and distance from the user
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Speed: ");
		int speed = sc.nextInt();
		System.out.println("Enter the Distance: ");
		int distance = sc.nextInt();
		System.out.println("Enter the Start Date(dd/mm/yyyy): ");
		String startDate = sc.next();
		boolean date = validateDate(startDate);
		System.out.println("Enter the Start Time(hrs:min): ");
		String startTime = sc.next();
		boolean time = validateTime(startTime);
		sc.close();
		if (date && time) {
			findNoOfDays(speed, distance);
		}
	}

}
