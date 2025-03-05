
public class switch2 {
	public static String getQuarter(String month) {
		return switch (month) {
			case "Jan", "Feb", "Mar" -> "1st";
			case "Apr", "MAY", "JUNE" -> "2nd";
			case "JULY", "AUGUST", "SEPT" -> "3rd";
			case "OCT", "NOV", "DEC" -> "4th";
			default -> {
				String badResponse = month + " is bad";
				yield badResponse;
			}
		
		}
	}
}
