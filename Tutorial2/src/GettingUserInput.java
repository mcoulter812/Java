import java.util.Scanner;

import javax.swing.plaf.basic.BasicToolBarUI.DockingListener;

public class GettingUserInput {
	public static void main (String args[]){
		String name;
		System.out.println("Please enter your name");
		Scanner scanner = new Scanner(System.in);
		name= scanner.nextLine();
		System.out.println("Hello " + name);
		/*int age=scanner.nextInt();
		if(age<18){
			System.out.println("Sorry you're not old enough to play the new South Park game.");
		}
		else {
			System.out.println("Congratulations you can now play South Park");
		}*/
		//Remember to close the Scanner
		System.out.println("What is the name of your Dog?");
		String dogName=scanner.nextLine();
		System.out.println("What is the colour of" + dogName +"?");
		String colour=scanner.nextLine();
		System.out.println("What is the Owner name of" + dogName +"?");
		String ownerName=scanner.nextLine();
		System.out.println("What iss the breed of" + dogName +"?");
		String breed=scanner.nextLine();
		System.out.println("What is the age of" + dogName +"?");
		int dogAge=scanner.nextInt();
		System.out.println("How many spots does"  + dogName + "have?");
		int spots=scanner.nextInt();
		/*System.out.println("Is" + dogName + "Male? Y/N");
		String answer=scanner.nextLine();
		boolean isMale=true;
		if(answer=="Y"||answer=="y"){
			isMale=true;
		}
		else if (answer=="N"||answer=="n"){
			isMale=false;
		}
		else{
			System.out.println("You Have Failed");
			System.exit(1);
		}*/
		boolean isMale=true;
		Dog created =new Dog(dogName,colour,ownerName,breed,dogAge,spots,isMale);
		created.bark();
		created.goForAWalk(5);
		created.howOld();
		System.out.println(created.getDetails());
		
	}
}
