package id.ac.binus.problems.tiga;

/*
 * 
 * Smell code			: Feature Envy
 * potential cause(s)	: sebuah class lebih banyak mengakses data dari class lain
 * solution(s)			: Move Method
 * 
 */

public class Mahasiswa {
	
	PersonData persondata;

	public String getId() {
		return persondata.id;
	}
	public void setId(String id) {
		this.persondata.id = id;
	}
	public String getNama() {
		return persondata.nama;
	}
	public void setNama(String nama) {
		this.persondata.nama = nama;
	}
	public String getAlamat() {
		return persondata.alamat;
	}
	public void setAlamat(String alamat) {
		this.persondata.alamat = alamat;
	}
	public String getPhone() {
		return persondata.phone;
	}
	public void setPhone(String phone) {
		this.persondata.phone = phone;
	}
	public String getEmail() {
		return persondata.email;
	}
	public void setEmail(String email) {
		this.persondata.email = email;
	}

}
