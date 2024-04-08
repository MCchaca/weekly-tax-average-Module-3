
public class weeklytax {
	
	public static double taxcalc(double income) { //need elifs
		if (income < 500) {
			return income * 0.10;
		} else if (income < 1500) {
			return income * 0.15;
		} else if (income < 2500){
			return income * 0.20;
		} else {
			return income * 0.30;
		}
	}

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		double totalincome = 0;
		int week = 1; //cant have less than 1 week
		
		System.out.println("Enter the number of weeks beiong calculated: ");
		int numweeks = scanner.nextInt(); //need a loop to count weeks up to user input
		while (week <= numweeks) {
			System.out.println("Enter income for week" + week + ": $");
			totalincome += scanner.nextDouble();
			week++; //this while loop prompts user for income each week and then adds weeks until it hits users week input
		}
		
		double averagetaxheld = taxcalc(totalincome / numweeks); //had to search this next lines format
		System.out.printf("Average weekly tax withholding is: $" + averagetaxheld + " with a total income of " + totalincome);
//had to change to printf because of the multiple args
	}

}
