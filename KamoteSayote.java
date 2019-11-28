import java.util.Scanner;

public class KamoteSayote{
	public static void main(String []args){
		Scanner K = new Scanner(System.in);
		int n;
		int m;
		int k;
	
		System.out.println("Enter Input: ");
		n = K.nextInt();
		m = K.nextInt();
		k = K.nextInt();
		
		int x = n/m;
		int y = (n%m)*k;
		boolean value = (n >=1 && n <= 1000) && (k <= 1000 && k >=1) && (m >= 1 && m <=1000);
		
		if(value){System.out.println(x + " kamotes " + "\n" + y + " sayotes.");
		}else{
		System.out.println("Invalid Input");	
		}
	}
	}