package PrinciplesOfOOP;

public class Book {
	String bookID; 
	String title; 
	String genre; 
	String author;
	boolean isIssued; 
	
	public Book()
	{
		
	}
	public Book(String bookID, String title, String genre, String author, boolean isIssued) {
		this.bookID = bookID; 
		this.title = title; 
		this.genre = genre; 
		this.author = author; 
		this.isIssued = isIssued ; 
	}
	
	public Book(String title, String author, String genre) {
		this.title = title; 
		this.genre = genre; 
		this.author = author;
	}
	
	public void displayBookDetails() { 
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Genre: "+genre);
		System.out.println("BookID: "+bookID);
		System.out.println("Currently issued: "+isIssued);
	}
}
