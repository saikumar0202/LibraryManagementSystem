package LibraryManagementSystem;

import java.util.Scanner;

public class main {
	
	public static void main(String args[]) {
		library();
	}
	public static void library() {
		Scanner ip = new Scanner(System.in);
		System.out.println("1.admin login\n2.Librarian");
		int a=ip.nextInt();
		switch(a) {
		case 1:
			admin admin= new admin();
			break;
		case 2:
			Librarian librarian =new Librarian();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.err.print("Enter the valid Option :");
			
		}
	}

}
