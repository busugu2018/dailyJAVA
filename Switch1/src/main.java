
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//If statement
		int value = 3;
		if (value == 1) {
			System.out.println("Value was 1.");
		} else if (value == 2) {
			System.out.println("Value was 2.");
		} else {
			System.out.println("Value was not 1 or 2.");
		}
		
		
		//SWITCH Statement
//		switch(value) {
//			case x:
//				// Code for value == X
//				break;
//			case y:
//				// Code for value == Y
//				break;
//			default:
//				// Code for value == X
//			
//		}
		
		
		
		//Switch Statement for 2 values to test for
		int switchValue = 1;
		
		switch (switchValue) {
			case 1:
				System.out.println("Value was 1.");
				break;
			case 2:
				System.out.println("Value was 2.");
				break;
			default:
				System.out.println("Value was neither 1 or 2.");
				break;
		}
		
		
		//Switch Statement for 5 values to test for
		int switchValue1 = 8;
		
		switch (switchValue1) {
			case 1:
				System.out.println("Value was 1.");
				break;
			case 2:
				System.out.println("Value was 2.");
				break;
			case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
				System.out.println("Was the value 3, 4, 5, 6, 7, 8, 9 or 10?");
				System.out.println("Actually it was a " + switchValue1);
				break;
			default:
				System.out.println("Value was neither 1, 2, 3, 4, 5, 6, 7, 8, 9 or 10.");
				break;
		}
		
		
		//Switch Statement for 100 values to test for
		
		
		//New SWITCH CODE
		int switchCode = 0;
		switch (switchCode) {
			case 1 -> System.out.println("Value was 1.");
			case 2 -> System.out.println("Value was 1.");
			case 3, 4, 5, 6, 7, 8, 9, 10 -> {
				System.out.println("Be precised. Was it a 3, 4, 5, 6, 7, 8, 9 or 10");
			}
			default -> System.out.println("It was neither.");
		}
		
		

		
	}
	
	
//	public static String getQuarter(String month) {
//		
//		String month = "Apr";
//		System.out.println(month + "is in the " + getQuarter(month) + " quarter.");
//		return switch (month) {
//			case "Jan", "Feb", "Mar" -> "1st";
//			case "Apr", "May", "Jun" -> "2nd";
//			case "Jul", "Aug", "Sep" -> "3rd";
//			case "Oct", "Nov", "Dec" -> "4th";
//			default -> {
//				String badResponse = month + " is bad.";
//				yield badResponse;
//			}
//		}		
//	}

}


