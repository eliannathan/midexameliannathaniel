import java.util.*;

public class Main {
	
	private Scanner sc = new Scanner(System.in);	
	protected String username,password,email,fName,lName,gender,dob;
	protected String mainLevel,level1 = "Basic",level2 ="Silver",level3 = "Golden",level4 ="Platinum";
	int input,totalPoint,pointAmount = 0,point,transactionTotal = 0,transaction;
	
	public Main(){
		register();
		purchase();
	}

	private void register() {
		System.out.print("\nPlease Register!");
		do {
			System.out.print("\nInput username [5-15 characters]: ");
			username = sc.nextLine();
		} while (username.length()<5||username.length()>15);
		do {
			System.out.print("Input password [5-15 characters]: ");
			password = sc.nextLine();
		} while (password.length()<5||password.length()>15);
		do {
			System.out.print("Input email [@gmail.com]: ");
			email = sc.nextLine();
		} while (!email.endsWith("@gmail.com"));
		do {
			System.out.print("Input first name [5-10 characters]: ");
			fName = sc.nextLine();
		} while (fName.length()<5||fName.length()>10);
		do {
			System.out.print("Input last name [5-10 characters]: ");
			lName = sc.nextLine();
		} while (lName.length()<5||lName.length()>10);
		do {
			System.out.print("Input gender [Female | Male] [Case Sensitive]: ");
			gender = sc.nextLine();
		} while (!gender.equals("Female") && !gender.equals("Male"));
		do {
			System.out.print("Input date of birth [5-20 characters]: ");
			dob = sc.nextLine();
		} while (dob.length()<5 || dob.length()>20);
	}
	
	public void purchase() {
		if (transactionTotal <50) {
			mainLevel = level1;
		} else if (transactionTotal <100) {
			mainLevel = level2;
		} else if (transactionTotal <150) {
			mainLevel = level3;
		} else if (transactionTotal >150) {
			mainLevel = level4;
		}
		do {
			System.out.print("\nWhat would you like to do? your rank is "+mainLevel 
					+ "\n1. Input Transaction" 
					+ "\n2. Trade Points" 
					+ "\n3. Exit"
					+ "\n>> ");
			input = catchs();
			switch (input) {
			case 1:
				inputTransaction();
				break;
			case 2:
				tradePoints();
			}
		} while (input != 3);
	}

	private void inputTransaction() {
		do {
			System.out.print("How much will your transaction be? [Max. 300000]: ");
			transaction = sc.nextInt();
			sc.nextLine();
		} while (transaction <0 || transaction >300000);
		transactionTotal++;
		if (transactionTotal <50) {
			basic b = new basic(1, transaction, level1);
			totalPoint += b.addPoint();
			b.print();
		} else if (transactionTotal <100) {
			silver s = new silver(2, transaction, level2);
			totalPoint += s.addPoint();
			s.print();
		} else if (transactionTotal <150) {
			golden g = new golden(3, transaction, level3);
			totalPoint += g.addPoint();
			g.print();
		} else if (transactionTotal >150) {
			platinum p = new platinum(4, transaction, level4);
			totalPoint += p.addPoint();
			p.print();
		}
		System.out.println("You now have "+totalPoint+" point(s)");
		
	}
	
	public void tradePoints() {
		do {
			System.out.print("\nYou now have " + totalPoint+" points(s)" 
					+ "\nWhat would you like to trade?"
					+ "\n1. Doll			10 points" 
					+ "\n2. Candy		3  points"
					+ "\n3. Toy 			8  points" 
					+ "\n4. Water Bottle 	15 points" 
					+ "\n5. Exit" + "\n>> ");
			input = catchs();
			switch (input) {
			case 1:
				if((totalPoint - 10) < 0 ){
					System.out.println("Sorry! You dont have enough points!");
				} else {
					totalPoint -= 10;	
					System.out.println("\nTrade Success! Enjoy your item");
				}
				break;
			case 2:
				if((totalPoint - 3) < 0 ){
					System.out.println("Sorry! You dont have enough points!");
				} else {
					totalPoint -= 3;
					System.out.println("\nTrade Success! Enjoy your item");
				}
				break;
			case 3:
				if((totalPoint - 8) < 0 ){
					System.out.println("Sorry! You dont have enough points!");
				} else {
					totalPoint -= 8;
					System.out.println("\nTrade Success! Enjoy your item");
				}
				break;
			case 4:
				if((totalPoint - 15) < 0 ){
					System.out.println("Sorry! You dont have enough points!");
				} else {
					totalPoint -= 15;
					System.out.println("\nTrade Success! Enjoy your item");
				}
				break;
			}
		} while (input != 5);
		
	}
	
	public int catchs(){
		int a;
		try {
			a = sc. nextInt();
		} catch (Exception e) {
			a = -1;
			System.out.println("\nPlease input numbers only!");
		}
		sc.nextLine();
		return a;	
	}
	
	public static void main(String []args) {
		new Main();
	}
	
}
