import java.util.Scanner;

public class GradeA{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Input your grade");
		
		int grade;
		
		grade = input.nextInt();
		
		if (grade <= 100 && grade >= 92){
			System.out.println("A");
		} else if(grade <= 91 && grade >= 87){
			System.out.println("B+");
		} else if (grade <= 86 && grade >= 83){
			System.out.println("B");
		}else if(grade <= 82 && grade >= 79){
			System.out.println("C+");
		} else if (grade <= 78 && grade >= 75){
			System.out.println("C");
		}else if(grade <= 74 && grade >= 70){
			System.out.println("D");
		} else if (grade < 70){
			System.out.println("F");
		}	
	}
}
