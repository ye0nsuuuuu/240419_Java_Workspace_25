package ex_240509.mini.dto;

public class MemberDTO {
	private int id;
	private String name;
	private String email;
	private String password;
	
	// 생성자, 매개변수가 d개인
	public MemberDTO(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	
	// 게터, 세터들.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
