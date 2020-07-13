package serialization;

import java.io.Serializable;

public class User implements Serializable {
	
	// 시리얼버전 아이디는 보통 1로 하는 편
	private static final long serialVersionUID = 1L;
	private int no;
	private String userId;
	private String password;
	private String tel;
	private String email;
	
	// transient : 취급하지 않음, 직렬화 대상에서 제외
	private transient UserGrade grade;
	
	public User () {
		
	}

	public User(int no, String userId, String password, String tel, String email) {
		super();
		this.no = no;
		this.userId = userId;
		this.password = password;
		this.tel = tel;
		this.email = email;
	}

	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public UserGrade getGrade() {
		return grade;
	}
	
	public void setGrade(UserGrade grade) {
		this.grade = grade;
	}
	
}
