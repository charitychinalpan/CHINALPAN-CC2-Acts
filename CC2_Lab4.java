import java.util.Scanner;

public class CC2_Lab4{
  public static void main(String[] args){
  Scanner myPet=new Scanner(System.in);
  System.out.println("Enter Name:");
  String name = myPet.nextLine();
  System.out.println("Enter Age:");
  int age = myPet.nextInt();
  
  if(name.equals("Jhim") || name.equals ("Ethan")) {
	if(age > 4 && age < 11) {
		System.out.println("Hamster and Dog");}
	else if(age > 11 && age < 16){
		System.out.println("Spider and Dog");}
	else if(age > 15 && age < 21){
		System.out.println("Dog and Snake");}
	else if (age == 21){
		System.out.println("No Pets, Not Interested");}
	
	}
	else if (name.equals("Sally")||name.equals("Joy")){
		if(age > 4&& age < 11) {
		System.out.println("Hamster and Cat");}
	else if(age > 11 && age < 16){
		System.out.println("Cat and Rabbit");}
	else if(age > 15 && age < 21){
		System.out.println("Cat");}
	else if (age >= 21){
		System.out.println("No Pets, Not Interested");}
	}
	else System.out.println("Invalid Input");
    }
 }