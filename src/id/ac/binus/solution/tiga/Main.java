package id.ac.binus.solution.tiga;

public class Main {
	public static void main(String[] args) {
		PersonData[] persondata = new PersonData[3];
		
		persondata[0] = new PersonData("01", "Saiful", "Jl. jalan", "08212", "hayo.ngapain@gmail.huyu");
		persondata[1] = new PersonData("02", "Anwar", "Jl. jalan", "01280", "ini.ngapain@gmail.huyu");
		persondata[2] = new PersonData("03", "Joko", "Jl. jalan", "19827", "mau.ngapain@gmail.huyu");

		for (int i = 0; i < 3; i++) {
			System.out.println(persondata[i].getId());
			System.out.println(persondata[i].getNama());
			System.out.println(persondata[i].getAlamat());
			System.out.println(persondata[i].getPhone());
			System.out.println(persondata[i].getEmail());
		}	
	}
}
