package oops;
class Book {
	    private String name;
	    private Author author;  // Author object
	    private double price;
	    private int qtyInStock;

	    // Parameterized Constructor
	    public Book(String name, Author author, double price, int qtyInStock) {
	        this.name = name;
	        this.author = author;
	        this.price = price;
	        this.qtyInStock = qtyInStock;
	    }

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    public Author getAuthor() {
	        return author;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public int getQtyInStock() {
	        return qtyInStock;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public void setQtyInStock(int qtyInStock) {
	        this.qtyInStock = qtyInStock;
	    }

	    // toString method
	    public String toString() {
	        return "Book Name: " + name +
	               "\n" + author +
	               "\nPrice: " + price +
	               "\nQuantity in Stock: " + qtyInStock;
	    }


	}


