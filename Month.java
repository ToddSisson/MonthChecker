package num4;

public class Month {

	private int monthNumber;

	public Month(){
		monthNumber = 1;
	}

	public Month(int monthNumber) throws InvalidMonthNumber {
		if (monthNumber < 1 || monthNumber > 12){
			throw new InvalidMonthNumber();
		}
		else
			this.monthNumber = monthNumber;
	}

	public Month(String month) throws InvalidMonthName{
		switch (month) {
		case "January":
		case "january":
			monthNumber = 1;
			break;
		case "February":
		case "february":
			monthNumber = 2;
			break;
		case "March":  
		case "march":  
			monthNumber = 3;
			break;
		case "Arpil":  
		case "arpil":  
			monthNumber = 4;
			break;
		case "May":  
		case "may":  
			monthNumber = 5;
			break;
		case "June": 
		case "june": 
			monthNumber = 6;
			break;
		case "July": 
		case "july": 
			monthNumber = 7;
			break;
		case "August":
		case "august":
			monthNumber = 8;
			break;
		case "September":
		case "september":
			monthNumber = 9;
			break;
		case "October":
		case "october":
			monthNumber = 10;
			break;
		case "November":
		case "november":
			monthNumber = 11;
			break;
		case "December":
		case "december":
			monthNumber = 12;
			break;
		default:
			throw new InvalidMonthName();
		}
	}

	public void setMonthNumber(int monthNumber){
		if (monthNumber < 1 || monthNumber > 12){
			monthNumber = 1;
		}
		else
			this.monthNumber = monthNumber;
	}

	public String getMonthName(){
		switch (monthNumber) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Invalid month";
		}
	}
	
	public String toString(){
		return getMonthName();
	}
	
	public boolean equals(Month test){
		return (monthNumber == test.monthNumber);
	}
	
	public boolean greaterThan(Month test){
		return (monthNumber > test.monthNumber);
	}
	
	public boolean lessThan(Month test){
		return (monthNumber < test.monthNumber);
	}
}