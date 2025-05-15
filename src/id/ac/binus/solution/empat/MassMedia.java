package id.ac.binus.solution.empat;

public class MassMedia {

	private String name;
	private int releaseDate;
	private String publisher;

	public MassMedia(String name, int releaseDate, String publisher) {
		super();
		this.name = name;
		this.releaseDate = releaseDate;
		this.publisher = publisher;
	}

	public void reading() {
		System.out.println("Name of Book : " + name);
		System.out.println("Release Date : " + releaseDate);
		System.out.println("Name of Publisher : " + publisher);
	}

	public void published(String date) {
		System.out.println("Publish Date : " + date);
	}

	public void numberOfCopy(int countOfCopy) {
		System.out.println("Number of Copy : " + countOfCopy);
	}
}
