import java.util.Scanner;

public class Grade{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Input your grade");
		
		int grade;
		String value="";
		grade = input.nextInt();
		
		if (grade <= 100 && grade >= 92){
			value="A";
		} else if(grade <= 91 && grade >= 87){
			value="B+";
		} else if (grade <= 86 && grade >= 83){
			value="B";
		}else if(grade <= 82 && grade >= 79){
			value="C+";
		} else if (grade <= 78 && grade >= 75){
			value="C";
		}else if(grade <= 74 && grade >= 70){
			value="D";
		} else if (grade < 70 && grade >= 0){
			value="F";
		} else {
      value = "Invalid Input";
		}
			System.out.println(value);
	}
}
