package lang1;

public class User implements Cloneable {
	
	private int no;
	private String name;
	private String tel;
	
	public User() {
		
	}
	
	public User(int no, String name, String tel) {
		this.no = no;
		this.name = name;
		this.tel = tel;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + no;
//		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
//		result = prime * result + ((user1 == null) ? 0 : user1.hashCode());
//		result = prime * result + ((user2 == null) ? 0 : user2.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		User other = (User) obj;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (no != other.no)
//			return false;
//		if (tel == null) {
//			if (other.tel != null)
//				return false;
//		} else if (!tel.equals(other.tel))
//			return false;
//		if (user1 == null) {
//			if (other.user1 != null)
//				return false;
//		} else if (!user1.equals(other.user1))
//			return false;
//		if (user2 == null) {
//			if (other.user2 != null)
//				return false;
//		} else if (!user2.equals(other.user2))
//			return false;
//		return true;
//	}
	
	// 해시코드 재정의 - 사용자번호가 해시코드값이 되도록 작성
	@Override
	public int hashCode() {
		return no;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if (this == obj) {
			return true;
		}
		
		if (obj instanceof User) {
			User other = (User) obj;
			
			if(this.no == other.no) {
				return true;
			}
			
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", tel=" + tel + "]";
	}
	
	public User copy() throws CloneNotSupportedException {
		User copiedUser = (User) clone();
		return copiedUser;
	}
	
}
