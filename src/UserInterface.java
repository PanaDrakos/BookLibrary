import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
	private Scanner scanner;
	private ArrayList<Book> db;
	
	public UserInterface() {
		this.scanner = new Scanner(System.in);
		this.db = new ArrayList<>();
	}
	
	public void start() {
		while (true) {
			System.out.println("Welcome to your library! What would you like to do?");
			System.out.println("1 - Display book total");
			System.out.println("2 - Add book to library");
			System.out.println("3 - Remove book from library");
			System.out.println("4 - Print books in library");
			System.out.println("5 - Add a review to a book");
			System.out.println("6 - Snapshot of your book reviews");
			System.out.println("x - Exit the UI");
			
			String input = scanner.nextLine();
			if (input.equals("1")) {
				if (db.size() == 1) {
					System.out.println("1 book in library");
				} else {
					System.out.println(db.size() + " books in library");
				}
			}
			
			if (input.equals("2")) {
				System.out.println("Name of the book to be added?");
				String name = scanner.nextLine();
				System.out.println("Author of the book?");
				String author = scanner.nextLine();
				System.out.println("How many pages?");
				int pages = Integer.valueOf(scanner.nextLine());
				db.add(new Book(name, author, pages));
			}
			
			if (input.equals("3")) {
				System.out.println("Name of the book to be removed?");
				String name = scanner.nextLine();
				for (Book book: db) {
					if (book.getName().equalsIgnoreCase(name)) {
						db.remove(book);
						break;
					}
				}
			}
			
			if (input.equals("4")) {
				for (Book book: db) {
					System.out.println(book);
				}
			}
			
			if (input.equals("5")) {
				System.out.println("Which book do you want to review?");
				String name = scanner.nextLine();
				for (Book book: db) {
					if (book.getName().equals(name)) {
						Book newBook = book;
						System.out.println("What would you rate this book (out of 5)?");
						double rating = Double.valueOf(scanner.nextLine());
						newBook.getReview().setRating(rating);
						System.out.println("Write your review:");
						String review = scanner.nextLine();
						newBook.getReview().setText(review);
						db.remove(book);
						db.add(newBook);
						System.out.println(db.size());
					}
				}
			}
			
			if (input.equals("6")) {
				for (Book book: db) {
					if (!(book.getReview().getText() == null)) {
						System.out.println(book.getReview());
					}
				}
			}
			
			if (input.equalsIgnoreCase("x")) {
				break;
			}
			scanner.nextLine();
		}
		
	}

}
