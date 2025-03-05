
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char charValue = 'A';
		switch (charValue) {
		case 'A':
			System.out.println("A is able");
			break;
		case 'B':
			System.out.println("B is Baker");
			break;
		case 'C':
			System.out.println("C is Charlie");
			break;
		case 'D':
			System.out.println("D is dog");
			break;
		case 'E':
			System.out.println("E is Easy");
			break;
		default:
			System.out.println("Letter " + charValue + " was not found in the switch");
	        break;	
		}
		
		
		
		
		
		
		
		//Password is ABCD1234 --- we wanna identify what characters 
		// are in it
		String passWord = "7";
		switch (passWord) {
		case "A":
			System.out.println("A is part of the password");
			break;
		case "B":
			System.out.println("B is part of the password");
			break;
		case "C":
			System.out.println("C is part of the password");
			break;
		case "D":
			System.out.println("D is part of the password");
			break;
		case "1":
			System.out.println("1 is part of the password");
			break;
		case "2":
			System.out.println("2 is part of the password");
			break;
		case "3":
			System.out.println("3 is part of the password");
			break;
		case "4":
			System.out.println("4 is part of the password");
			break;
		default:
			System.out.println("The value " + passWord + " is not part of the password");
	        break;	
		}
		
		
		
		
		
		//Enhanced SWITCH
		
//		switch (passWord) {
//			case "A":
//			case "B":
//			case "C":
//			case "D":
//			case "1":
//			case "2":
//			case "3":
//			case "4":
//				return " is part of the passWord";
//	
//		}
//		
		
		
		// Day of the week exercise:
		int weekDay = 6;
		switch (weekDay) {
			case 0 -> 1
			
		}
		
		
	}

}
