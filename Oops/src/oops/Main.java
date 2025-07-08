package oops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Author author = new Author("John Doe", "john@example.com", 'M');

	        // Create Book
	        Book book = new Book("Java Programming", author, 599.99, 10);

	        // Print Book Details
	        System.out.println(book);
	}

}
