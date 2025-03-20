package pro02.sec2;

public class Student {
	private int no;
	private int kor;
	private int eng;
	private int mat;
	
	public int comTot() {
		return kor+eng+mat;
	}
	
	public float comAvg() {
		return (kor+eng+mat)/3.0f;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
}
