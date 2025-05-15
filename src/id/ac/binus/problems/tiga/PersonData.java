package id.ac.binus.problems.tiga;

/*
 * 
 * Smell code			: Inappropriate Access Modifier
 * potential cause(s)	: untuk apa jika sebuah encapsulated class menyimpan data yang memiliki access modifier public 
 * solution(s)			: Change Access Modifier
 * 
 * Smell code			: Data Class
 * potential cause(s)	: Class ini dapat dijadikan sebuah object
 * solution(s)			: Create Object
 * 
 * Smell code			: Leaky Encapsulation
 * potential cause(s)	: sebuah data langsung diakses
 * solution(s)			: Mengambil dari getter
 * 
 */

public class PersonData {

	public String id;
	public String nama;
	public String alamat;
	public String phone;
	public String email;
	
}
