package LibraryManagementSystem;

import java.util.Scanner;

public class admin extends books {
		static String Id="12345";
		static String Pass="siddhu";
		Scanner ip= new Scanner(System.in);
	public admin() {
		System.out.print("Enter user ID :");
		String id=ip.nextLine();
		System.out.print("Enter password :");
		String pass=ip.nextLine();
		if(Id.equals(id) && Pass.equals(pass)) {
			setBooks();
		}else {
			System.err.println("incorrected password or id.!");
			new admin();
		}
	}
	public void setBooks() {
		System.out.println("1.Add book\n2.delete book\n3.View books.\n4.log out");
		String a=ip.nextLine();
		int b=Integer.parseInt(a);
		switch(b) {
		case 1:
			addBook();
			break;
		case 2:
			deleteBook();
			break;
		case 3:
			viewBook();
			break;
		case 4:
			main.library();
			break;
		default:
			System.err.println("Enter the valid Option..!");
				
		}
	}
	public void addBook() {
		System.out.println("Enter book and author");
		String book = ip.nextLine();
		library.add(book);
		System.out.println("book successfully added");
		setBooks();
	}
	public void deleteBook() {
		for(int i=0;i<library.size();i++) {
			System.out.println((i+1)+"\t"+library.get(i)+"\n");
		}
		System.out.print("Enter the book number :");
		String a=ip.nextLine();
		int j=Integer.parseInt(a);
		library.remove(j-1);
		System.out.println("Book successfully deleted");
		setBooks();
	}
	public void viewBook() {
		System.out.println("1.Library books\n2.Librarian books");
		String a=ip.nextLine();
		int b=Integer.parseInt(a);
		if(b==1) {
		for(int i=0;i<library.size();i++) {
			System.out.println((i+1)+"\t"+library.get(i)+"\n");
		}
		}else if(b==2) {
			for(int i=0;i<user.size();i++) {
				System.out.println((i+1)+"\t"+user.get(i)+"\n");
		   }
		}else {
			viewBook();
		}
		setBooks();
	}
}
