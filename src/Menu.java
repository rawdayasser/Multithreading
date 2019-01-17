
public class Menu {

	public static void showMenu() {
		System.out.println("Menu\n1 Create Thread Way 1"
				+ "\n2 Create Thread Way 2"
				+ "\npress -1 to quit...");
	}
	public static void createThreadWay1() {
		Create1 t1 = new Create1();
		t1.start();
	
	}
	public static void createThreadWay2() {
		Create1 t1 = new Create1();
		t1.start();
	
	}
		
}
