package pro01.sec1;

public class Exam04 {

	public static void main(String[] args) {
		int a, b, c, d, e, f, g;
		a=100;
		b=85;
		//산술 연산
		c=a+b;
		System.out.println("a+b="+c);
		d=a-b;
		System.out.println("a-b="+d);
		e=a*b;
		System.out.println("a*b="+e);
		f=a/b;
		System.out.println("a/b="+f);
		g=a%b;
		System.out.println("a%b="+g);
		//비교 연산 -> 결과는 논리값(true 또는 false)
		System.out.println("a==b : "+(a==b));	//동등
		System.out.println("a!=b : "+(a!=b));	//불일치
		System.out.println("a>b : "+(a>b));	//초과(크다) -> 후
		System.out.println("a>=b : "+(a>=b)); //이상(크거나 같다) -> 이후
		System.out.println("a<b : "+(a<b));	//미만(작다) -> 전
		System.out.println("a<=b : "+(a<=b));	//이하(작거나 같다) -> 이전
		
		int h = 90;
		//논리 연산 -> 결과는 논리값(true 또는 false)
		//and(&&), or(||), not(!)
		System.out.println("a>b && b>h : "+(a>b && b>h));	
		//조건1 && 조건2 -> 두 조건이 모두 만족해야 참 
		System.out.println("a>b || b>h : "+(a>b || b>h));	
		//조건1 || 조건2 -> 두 조건 어느 하나만이라도 만족하면 참
		System.out.println("!(a>b) : "+(!(a>b)));
		
		//비트(2진수) 연산자 : &, |, ~, ^, <<, >>, >>>
				 //64  32 16 8 4 2 1 
		c = 20;	//		1  0 1 0 0 -> 20
				//	  1 0  1 0 0 0 -> 40 왼쪽 시프트 1회차
				//  1 0 1  0 0 0 0 -> 80 왼쪽 시프트 2회차
				//	  	   1 0 1 0 -> 10 오른쪽 시프트 1회차
				//  	     1 0 1 -> 5 오른쪽 시프트 2회차
		a = 15;	//00001111
		b = 19;	//00010011
				//00011100 => 28 ^결과
				//00011111 => 31 |결과
				//00000011 => 3  &결과
				//15   14   13 12 11 10 9 8 7 6 5 4 3 2 1 0   : 보수(Complement)
				//-16 -15  -14 ~                          -1
		System.out.println("a & b => "+(a & b));	//AND
		System.out.println("a | b => "+(a | b));	//OR
		System.out.println("a ^ b => "+(a ^ b));	//XOR
		System.out.println("~a => "+(~a));	//NOT(Complement)
		System.out.println("c >> 2 => "+(c >> 2));	//Right Shift
		System.out.println("c << 2 => "+(c << 2));	//Left Shift
		System.out.println("c >>> 2 => "+(c >>> 2));	//Double Right Shift
	}

}
