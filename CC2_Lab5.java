import java.lang.Math;

public class CC2_Lab5{
	public static void main(String args[]){
		double messageCount = Math.random()*1000;
		
		System.out.println("You have sent" + " " + (int)messageCount + " " + "messages.");
		
		if(messageCount < 200){
			System.out.println("You have incurred no charges.");
		}
		else if(messageCount > 200){
			double charge = (messageCount - 200)*0.50;
			System.out.println("You have incured" + " " + String.format("%.2f", charge) + " " + "in charges");
		}
		
	}
}