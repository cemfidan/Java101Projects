import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your fighter name: ");
		String fighterUser = scanner.nextLine();
		
		Fighter fighter1 = new Fighter(fighterUser, 10, 100, 112, 20);
		Fighter fighter2 = new Fighter("Rival Boxer", 10, 100, 107, 25);
		Match newMatch = new Match(fighter1, fighter2 , 100 , 120);
		newMatch.run();
		scanner.close();
	}
	
}
