import java.util.Scanner;

public class Time{
	public static void main(String []args){
		Scanner T = new Scanner(System.in);
		int minute;
		System.out.println("Enter number of minutes:");
		minute = T.nextInt();
		
		int hour = minute/60;
		int remainMin = minute%60;
		
		System.out.println(minute + " minutes is " + hour +" hour/s"+ " and " + remainMin + " minute/s.");
	}
	}