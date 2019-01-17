import java.util.Scanner;

/**
 * @author Rawda Yasser
 * 
 */

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		Menu.showMenu();
		choice = scanner.nextInt();
		while(choice != -1) {
			switch (choice) {
			case 1:
				Menu.createThreadWay1();
				break;
			case 2:
				Menu.createThreadWay2();
				break;
			
			default:
				break;
			}
			
			choice = scanner.nextInt();
			
		}
		
		scanner.close();
		
	}

	
}
