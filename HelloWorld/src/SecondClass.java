
public class SecondClass {
	public static void main(String[] args) {
		//HelloWorld
		System.out.print("Hello Boy"); //print alone, keeps everything on the same line
		System.out.println("Hello World");// Use println instead
		System.out.println("Hello Tim");
		
		
		//Booleean
		boolean isAlien = false; //assignment
		if (isAlien == false)
			System.out.println("It's not an alien"); //test
		
		boolean isMan = true;
		if (isMan == true)
			System.out.println("The applicant is a man!");
		
		boolean isBlack = true;
		if (isBlack == true)
			System.out.println("The applicant is Black!");

		// Code Block
		boolean isBlue = true;
		if (isBlue == true) {
			System.out.println("The applicant is Blue");
		}
		
		boolean isYellow = true;
		if (isYellow == true) {
			System.out.println("The applicant is Yellow");
			System.out.println("We love our Yellow people.");
		}
		
		
		
		//Int and equals
		int topScore = 100;
		if (topScore == 100){
			System.out.println("You got the highest score.");
		}
		
		int midScore = 80;
		if (midScore == 80) {
			System.out.println("You got a mid Score!");
		}

		int midScore1 = 79;
		if (midScore1 != 80) {
			System.out.println("You got a different score!");
		}	
		
		int lowScore = 79;
		if (lowScore < 80) {
			System.out.println("You got a C!");
		}		
		
		//Else
		boolean isWhite = false; //Racist code
		if (isWhite == true)
			System.out.println("The applicant is White!");
		else
			System.out.println("Rejected");
		
	}
}
