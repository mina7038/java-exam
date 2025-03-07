package pro01.sec1;
//기본 타입은 반드시 초기화가 필요
class Exam {
	int field3;
}

public class Exam02 {
	int field1 = 100;		//필드
	String field2 = "미나"; 	//필드
	public static void main(String[] args) {
		int field1;	//지역변수
		String field2;	//지역변수
		Exam ex1 = new Exam();	//객체: ex1
		//System.out.println(field1);
		System.out.println(ex1.field3);
		//초기값이 선언되어 있지 않으면 메모리 할당이 되지 않아 오류 발생
	}
	
}
