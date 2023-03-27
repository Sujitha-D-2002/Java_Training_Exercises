import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class TravelTime {
	static int day,month,year,hour,min;
	static LocalDateTime dateNew;
	static void findNoOfDays(int speed,int distance) {
		dateNew = LocalDateTime.of(year, month, day,hour,min);
		//System.out.println(dateNew);
		int time=distance/speed;
		//System.out.println(time);
		
		int noOfDays=time/8;
		int timeBal=time%8;
		if(timeBal!=0) {
			noOfDays++;
		}
		System.out.println("No of Days:"+noOfDays+" No of hours: "+timeBal);
		 
		int i=0;
		LocalDate date=dateNew.toLocalDate();
		while(i<(noOfDays-1)) {
			if(isHoliday(date)) {
				date=date.plusDays(1);
			}
			else {
				i++;
				date=date.plusDays(1);
			}
		}
		System.out.println("Arrival Date: "+date);
		System.out.print("Arrival Time: "+(hour+timeBal)+":"+min);
		
	}
	static boolean isHoliday(LocalDate date) {
		if(date.getDayOfWeek().getValue()==7||date.getDayOfYear()==1||date.getDayOfYear()==15||date.getDayOfYear()==197||date.getDayOfYear()==361) {
			return true;
		}
		if(date.getDayOfWeek().getValue()==6) {
			return true;
		}
		return false;
	}
	static boolean validateDate(String date){
		String datesplit[]=date.split("/");
		boolean flag=true;
		if(!(Integer.parseInt(datesplit[0])>0 && Integer.parseInt(datesplit[0])<=31)) {
			System.out.println("Invalid Day..!!");
			flag=false;
		}
		else {
			day=Integer.parseInt(datesplit[0]);
		}
		if(!(Integer.parseInt(datesplit[1])>0 && Integer.parseInt(datesplit[1])<=12)) {
			System.out.println("Invalid Month..!!");
			flag=false;
		}
		else {
			month=Integer.parseInt(datesplit[1]);
		}
		if(!(datesplit[2].length()==4 && Integer.parseInt(datesplit[2])<=2023)) {
			System.out.println("Invalid Year..!!");
			flag=false;
		}
		else {
			year=Integer.parseInt(datesplit[2]);
		}
		return flag;
	}
	static boolean validateTime(String time){
		boolean flag=true;
		String timesplit[]=time.split(":");
		if(!(Integer.parseInt(timesplit[0])>0 && Integer.parseInt(timesplit[0])<=24)) {
			System.out.println("Invalid hour..!!");
			flag=false;
		}
		else {
			hour=Integer.parseInt(timesplit[0]);
		}
		if(!(Integer.parseInt(timesplit[1])>0 && Integer.parseInt(timesplit[1])<=60)) {
			System.out.println("Invalid minute..!!");
			flag=false;
		}
		else {
			min=Integer.parseInt(timesplit[1]);
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Speed: ");
		int speed=sc.nextInt();
		System.out.println("Enter the Distance: ");
		int distance=sc.nextInt();
		System.out.println("Enter the Start Date(dd/mm/yyyy): ");
		String startDate=sc.next();
		boolean date=validateDate(startDate);
		System.out.println("Enter the Start Time(hrs:min): ");
		String startTime=sc.next();
		boolean time=validateTime(startTime);
		sc.close();
		if(date && time) {
			findNoOfDays(speed,distance);
		}
	}

}
