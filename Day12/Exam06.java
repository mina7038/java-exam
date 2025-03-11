package pro01.sec1;

public class Exam06 {

	public static void main(String[] args) {
		//증감 연산
		int su=90;
		int da=90;
		//++a / a++  =>  a=a+1 
		System.out.println(su++); //후위연산
		System.out.println(++da); //전위연산
		System.out.println(su);
		System.out.println("*******************************");
		//--a / a--
		System.out.println(su--);
		System.out.println(--da);
		//자바 출력문
		System.out.println();
		System.out.print("김미나 예쁨 주의~!");
		System.out.print("\n미나\t\"바보~!\"");
		System.out.printf("\n나이: %d\n이름: %s", su, "김미나");
		//%d:정수 10진수, %o:정수 8진수, %x:정수 16진수, %f:실수,
		//%b:불리언, %c:1문자, %s:문자열, %n:줄바꿈, %e:지수
		//형식 문자를 활용한 자리 맞추기
		System.out.printf("\n%d%n", 1004);  //
		System.out.printf("%6d%n", 1004);	//6자리 숫자로 표시하되 부족한 앞 자리를 공백으로 채움 
		System.out.printf("%-6d%n", 1004);	//6자리 숫자로 표시하되 부족한 뒤 자리를 공백으로 채움
		System.out.printf("%06d%n", 1004);	//6자리 숫자로 표시하되 부족한 앞 자리는 0으로 채움
		System.out.printf("%,3d%n", 1004);	//천단위 구분기호 출력
		System.out.printf("%f%n", 6234.4567);	//
		System.out.printf("%9.2f%n", 6234.4567);	//
		System.out.printf("8진수: %o%n", 24);		//
		System.out.printf("16진수: %x%n", 29);  //29(10) => 18(1d)
		System.out.printf("논리값: %b%n", 10);	//
		System.out.printf("%c%n", 'k');	//
	}

}
