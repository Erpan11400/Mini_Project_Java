package id.ac.binus.problems.satu;

/*
 * 
 * Smell code			: Data Class
 * potential cause(s)	: Class hanya menyimpan data Person saya, tidak ada logika dalam class tersebut
 * solution(s)			: Encapsulate Field
 * 
 * Smell code			: Duplicate Code
 * potential cause(s)	: Sudah terdapat constructor using field tetapi masih ada setter dalam class
 * solution(s)			: Delate code
 * 
 * Smell code			: Inappropriate Access Modifier
 * potential cause(s)	: untuk apa jika sebuah encapsulated class menyimpan data yang memiliki access modifier public
 * solution(s)			: Change Access Modifier
 * 
 * Smell code			: Leaky Encapsulation
 * potential cause(s)	: sebuah data langsung diakses
 * solution(s)			: Mengambil dari getter
 * 
 */

public class Person {
	public String code;
	public String name;
	public String address;
	public String phone;
	public String email;
	public Person(String code, String name, String address, String phone, String email) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void viewAllData() {
		System.out.println("Code : " + this.code);
		System.out.println("Name : " + this.name);
		System.out.println("Address : " + this.address);
		System.out.println("Phone : " + this.phone);
		System.out.println("Email : " + this.email);
	}
}
