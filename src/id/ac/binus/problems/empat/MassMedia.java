package id.ac.binus.problems.empat;

/*
 * 
 * Smell code			: Unnecessary Abstraction
 * potential cause(s)	: Membuat Class/Interface terlalu banyak: method-method yang fungsinya bisa digabung jadi satu class sederhana, malah dibuat jadi class-class yang berbeda.
 * solution(s)			: Extract a Simple Class
 * 
 * Smell code			: Unnecessary Abstraction
 * potential cause(s)	: Membuat Class/Interface terlalu banyak: method-method yang fungsinya bisa digabung jadi satu class sederhana, malah dibuat jadi class-class yang berbeda.
 * solution(s)			: Extract a Simple Class
 * 
 */

public class MassMedia {

	private int name;
	private int releaseDate;
	private String publisher;
	public MassMedia(int name, int releaseDate, String publisher) {
		super();
		this.name = name;
		this.releaseDate = releaseDate;
		this.publisher = publisher;
	}
	public void reading() {
		
	}
	
}
