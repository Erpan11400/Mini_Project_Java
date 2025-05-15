package id.ac.binus.solution.empat;

public class Main {
	public static void main(String[] args) {

		MassMedia[] book = new MassMedia[2];

		book[0] = new MassMedia("Agile Manifesto", 12, "Saya Sendiri");
		book[1] = new MassMedia("How to Handle Smell Code", 15, "Bu Dosen");

		for (int i = 0; i < 2; i++) {
			book[i].reading();
			System.out.println();
		}

	}

}
