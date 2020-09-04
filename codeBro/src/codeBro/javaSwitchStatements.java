package codeBro;

public class javaSwitchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String month = "December";
		if(month == "January") {
			System.out.println("It is January and very cold outside.");
		}
		else if(month == "February") {
			System.out.println("It is February and very cold outside.");
		}
		else if(month == "March") {
			System.out.println("It is March and it's getting warmer outside.");			
		}
		else if(month == "April") {
			System.out.println("It is April and it's getting warmer outside.");
		}
		else if(month == "May") {
			System.out.println("It is May and it's getting warmer outside.");
		}
		else if(month == "June") {
			System.out.println("It is June and it's hot outside.");
		}
		else if(month == "July") {
			System.out.println("It is July and it's hot outside.");			
		}
		else if(month == "August") {
			System.out.println("It is August and it's hot outside.");
		}
		else if(month == "September") {
			System.out.println("It is September and it's getting cold outside.");
		}
		else if(month == "October") {
			System.out.println("It is October and it's getting cold outside.");
		}
		else if(month == "November") {
			System.out.println("It is November and it's very cold outside.");			
		}
		else if(month == "December") {
			System.out.println("It is December and it's very cold outside.");
		}
		
		
		String month2  = "january";
		
		switch(month2.toLowerCase()) {
		
		case "january": System.out.println("The month is Juanary");
		break;
		
		case "February":System.out.println("The month is February");
		break;
		
		case "March": System.out.println("The month is March");
		break;
		
		case "April":System.out.println("The month is April");
		break;
		
		case "May": System.out.println("The month is May");
		break;
		
		case "June":System.out.println("The month is June");
		break;
		
		case "July": System.out.println("The month is July");
		break;
		
		case "August":System.out.println("The month is August");
		break;
		
		case "September": System.out.println("The month is September");
		break;
		
		case "October":System.out.println("The month is October");
		break;
		
		case "November": System.out.println("The month is November");
		break;
		
		case "December":System.out.println("The month is December");
		break;
		
		default: System.out.println(month2 + " is not a month.");
		}
			

	}

}
