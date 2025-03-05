
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int int1 = 5;

		double kilometers = (100 * 1.609344);
		System.out.println(kilometers);
		
		boolean gameOver = true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		
		if (score == 5000) {
			System.out.println("Your score was 5000");
		}
		
		
		//Night club age limit
		
		int age = 18;
		if (age >= 18) {
			System.out.println("Let them in.");
		}else {
			System.out.println("Can't get in.");
		}
		
		int age1 = 17;
		if ((age1 > 18) && (age1 <= 21)) {
			System.out.println("Can get in but can't drink alcohol.");
		}else if (age1 >= 21) {
			System.out.println("Can get in and drink alcohol.");
		}else {
			System.out.println("Can't get in.");
		}
		
		//
		
		
		// Addition
		
		int mangoPrice = 1;
		int bananaPrice = 2;
		
		/*if (mangoPrice++){
			System.out.println();
		}*/
		
		boolean goodDay = true;
		int sales = 5000;
		int numberOfClients = 5;
		int unitSold = 1000;
		int unitMake = 300;
		
		int finalSales = sales;
		if (goodDay == true) {
			unitSold -= unitMake; //  unitSold = unitSold - unitMake;
			System.out.println("Because our benefice is greater than 300.");
		}

		
		

	}
	
	public static void calculateScore(){
		
	}

}
