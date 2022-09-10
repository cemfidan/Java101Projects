import java.util.Scanner;

public class UserLogin {
	public static void main(String[] args) {
		String userName, password, wrongPassword, newPassword;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Username: ");
		userName = inp.nextLine();
		
		System.out.print("Password: ");
		password = inp.nextLine();
		
		if (userName.equals("patika")) {
			if (password.equals("java123")) {
				System.out.println("You are logged in.");
			}else if (!password.equals("java123")) {
				System.out.println("Your password is wrong.\nDo you want to reset your password?\n1-Yes\n2-No");
				wrongPassword = inp.nextLine();
				switch (wrongPassword) {
					case "1":
						System.out.println("Your new password should not be the same as your old password.\nPlease enter your new password: ");
						newPassword = inp.nextLine();
						if (newPassword == wrongPassword) {
							System.out.println("Could not create password, please enter another password.");
						}else {
							System.out.println("Password created.");
						}
						break;
					case "2":
						System.out.println("Password not reset, please enter another password.");
						break;
				}
			}
		} else {
			System.out.println("Your username is wrong.");
		}
	}
}
