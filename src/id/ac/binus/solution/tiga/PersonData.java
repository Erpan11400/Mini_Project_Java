package id.ac.binus.solution.tiga;

public class PersonData {

	private String id;
	private String nama;
	private String alamat;
	private String phone;
	private String email;

	public PersonData(String id, String nama, String alamat, String phone, String email) {
		super();
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
		this.phone = phone;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}

	public String getNama() {
		return nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

}
