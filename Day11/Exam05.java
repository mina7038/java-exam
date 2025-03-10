package pro01.sec1;

public class Exam05 {

	public static void main(String[] args) {
		//대입 연산자: =, +=, -=, *=, /=, %=, &=, |=, <<=, >>=,...
		int a=100;	//a저장소(변수)에 100을 저장(대입)하라
		int b=20;
		int c=18;
		int d=17;
		int e=16;
		int f=15;
		a+=50;		//a=a+50
		System.out.println("a+=50 => "+a);	//150
		a-=30;		//a=a-30
		System.out.println("a-=30 => "+a); 	//120
		a*=5;		//a=a*5
		System.out.println("a*=5 => "+a); 	//600
		a/=3;		//a=a/3
		System.out.println("a/=3 => "+a); 	//200
		a%=3;		//a=a%3
		System.out.println("a%=3 => "+a); 	//2
		b&=8;		//b=b&8;	
		System.out.println("b&=8 => "+b);  //
		c|=8;
		System.out.println("c|=8 => "+c);  //
		d^=8;
		System.out.println("d^=8 => "+d);	//
		e<<=2;
		System.out.println("e<<=2 => "+e);  //
		f>>=2;
		System.out.println("f>>= => "+f); 	//
		
		
		
	}

}
