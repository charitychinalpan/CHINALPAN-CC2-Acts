import java.io.*;
import java.text.DecimalFormat;

public class Room{
	public static void main(String []args) throws IOException{
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String l="";
		String w="";
		
		System.out.println("Enter length:");
		 l = input.readLine();
		 double length = Double.parseDouble(l);
		System.out.println("Enter width:");
		 w = input.readLine();
		 double width = Double.parseDouble(w);
		 double area=length*width;
		 DecimalFormat dd = new DecimalFormat("###,###.00");
		System.out.println("The floor space of the room is "+ dd.format(area) + " square units.");
		
		}
}