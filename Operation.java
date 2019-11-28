import java.util.Scanner;

public class Operation{
	public static void main(String args []){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of operation:");
	
		int num = in.nextInt();
		int num1;
		int num2;
		int a;
		
		if(num >= 1 && num <= 100){
		  System.out.print("Enter all operation in one line:");
        for(a=1; a<=num; a++){
          String s = "";
          s = in.next();
            if (s.equals("negate")){
              num1 = in.nextInt();
              System.out.println(-num1);
            } else if (s.equals("add")){	
              num1 = in.nextInt();
              num2 = in.nextInt();
              System.out.println(num1 + num2);
            } else if(s.equals("max")){
              num1 = in.nextInt();
              num2 = in.nextInt();
                if(num1 > num2) {
                  System.out.println(num1);
                } else System.out.println(num2);
            }else
           System.out.println("Invalid Input");
       }  
      }else
           System.out.println("Invalid Input");
    }
}