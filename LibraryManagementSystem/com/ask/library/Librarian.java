package LibraryManagementSystem;

import java.util.Scanner;

public class Librarian extends books {
	Scanner ip= new Scanner(System.in);
	public Librarian() {
		setBooks();
	}
	public void setBooks() {
		System.out.println("1.take book\n2.return book\n3.View books.\n4.back");
		String a=ip.nextLine();
		int b=Integer.parseInt(a);
		switch(b) {
		case 1:
			takeBook();
			break;
		case 2:
			returnBook();
			break;
		case 3:
			viewBook();
			break;
		case 4:
			back();
			break;
		default:
				
		}
	}
	public void takeBook() {
		for(int i=0;i<library.size();i++) {
			System.out.println((i+1)+"\t"+library.get(i)+"\n");
		}
		System.out.print("Enter the book number what you want to take :");
		String a=ip.nextLine();
		int j=Integer.parseInt(a);
		user.add(library.get(j-1));
		library.remove(j-1);
		System.out.println("book successfully added to your account ");
		setBooks();
	}
	public void returnBook() {
		for(int i=0;i<user.size();i++) {
			System.out.println((i+1)+"\t"+user.get(i)+"\n");
		}
		System.out.print("Enter the book number what you want to return :");
		String a=ip.nextLine();
		int j=Integer.parseInt(a);
		library.add(user.get(j-1));
		user.remove(j-1);
		System.out.println("Book successfully returned");
		setBooks();
	}
	public void viewBook() {
		System.out.println("1.Library books\n2.Your books");
		String a=ip.nextLine();
		int b=Integer.parseInt(a);
		if(b==1) {
			System.out.println("\nLibrary books\n");
		for(int i=0;i<library.size();i++) {
			System.out.println((i+1)+"\t"+library.get(i)+"\n");
		}
		}else if(b==2) {
			System.out.println("\nYour books\n");
			for(int i=0;i<user.size();i++) {
				System.out.println((i+1)+"\t"+user.get(i)+"\n");
		   }
		}else {
			viewBook();
		}
		setBooks();
	}
	public void back() {
		main.library();
		
	}

}
