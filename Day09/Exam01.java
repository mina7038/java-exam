package pro01.sec1;

public class Exam01 {

	public static void main(String[] args) {
		//변수 선언 및 값 할당
		//변수 선언 문법
		//타입 변수명 = 값;
		//기본타입(자료형) -> 8가지이며, 모두 소문자로 시작됨
		boolean p = true;	//1Byte
		byte k = 127;	//1Byte 정수형 -128 ~ 127
		char n = 'K';	//2Byte 문자형
		short a = 32767;	//단정도(2Byte) 정수형 -> -32768 ~ +32767  
		int b = 327680000;		//일반(4Byte) 정수형 -> 2의 32승(- ~ +)
		long c = 327680000L;		//배정도(8Byte) 정수형 -> 2의 64승 
		float d = 100.00f;		//실수형(4Byte)
		double e = 123.123d;	//배정도 실수형(8Byte)
		
		//참조형: 각 타입에 따른 여러 메서드를 지원하며, 가공과 값 전달이 자유롭다. 
		Byte a1 = 127;
		Character b1 = 'D';
		Short c1 = 120;
		Integer d1 = 12800;
		Long e1 = 12800L;
		Float f1 = 31.408F;
		Double g1 = 31.123456D;
		
	}

}
