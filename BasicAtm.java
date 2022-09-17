import java.util.Scanner;

public class BasicAtm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userName, password;
		int right = 3;
		int balance = 1500;
		int select;
		
		while (0<right) {
		System.out.print("Username: ");
		userName = scanner.nextLine();
		System.out.print("Password: ");
		password = scanner.nextLine();
		
		if (userName.equals("patika") && password.equals("dev123")) {
			System.out.println("Hello, welcome to bank!");
			do {
				System.out.println("*****************\n"
						+ "1-Deposit\n"
						+ "2-Withdrawal\n"
						+ "3-Balance\n"
						+ "4-Log out\n"
						+ "*****************");
				System.out.print("Choice: ");
				select = scanner.nextInt();
				switch (select) {
				case 1:
				System.out.print("Money amount: ");
				int addMoney = scanner.nextInt();
				balance += addMoney;
				break;
				case 2:
					System.out.print("Money amount: ");
					int drawMoney = scanner.nextInt();
					if (balance<drawMoney) {
						System.out.println("Insufficient balance. Your balance: " + balance);
					} else {
						balance -= drawMoney;
					}
					break;
				case 3:
					System.out.println("Balance: " + balance);
					break;
				}
			} while (select != 4);
					System.out.println("Logged out. See you again.");
		} else {
			right--;
			System.out.println("Wrong username or password. Try again.");
			if (right==0) {
				System.out.println("Your account has been blocked, please contact the bank.");
			} else {
				System.out.println("Your Remaining Right: " + right);
			}
		  }
	   }
	}
}
