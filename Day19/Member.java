package pro02.sec2;

public class Member {
	private int no;
	private String id;
	private String pw;
	private String name;
	private String email;
	private String regdate;
	private int point;
	
	public void join(String id, String pw, String name, String email) {
		System.out.println(id+"님 회원가입을 축하드립니다.");
	}
	
	public void login(String id, String pw) {
		System.out.println(id+"님이 로그인하셨습니다.");
	}
	
	public void logout(String id) {
		System.out.println(id+"님이 로그아웃하셨습니다.");
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
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

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Member [no=" + no + ", id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", regdate="
				+ regdate + ", point=" + point + "]";
	}
}
