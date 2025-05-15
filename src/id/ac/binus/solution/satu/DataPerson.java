package id.ac.binus.solution.satu;

public class DataPerson {
	public static void main(String[] args) {
		Person[] orang = new Person[1];
		
		orang[0] = new Person("0001", "Ervan", "Jl. Aman", "0888111", "ervan.adb@gmail.xom");

		for (Person data : orang) {
			System.out.println(data.getCode());
			System.out.println(data.getName());
			System.out.println(data.getAddress());
			System.out.println(data.getPhone());
			System.out.println(data.getEmail());
		}
	}
}
