package pro02.sec1;

public class Computer {
	int cpu;		//필드(속성): 해당 객체의 값을 저장할 목적
	int memory;
	int hd;
	int keyboard;
	String brand;
	//기본 생성자로 생략이 되어 있으며, 기본으로 제공하며, 객체를 생성하는 역할
	//다만, 기본 생성자외에 다른 생성자를 지정한 경우는 반드시 적시해야함
	/* 직접 타이핑
	public Computer() { }	
	public Computer(int cpu) { this.cpu = cpu; } 
	public Computer(int cpu, int memory) {
		this.cpu = cpu;
		this.memory = memory;
	} 
	public Computer(String brand, int cpu) {
		this.cpu = cpu;
		this.brand = brand;
	} 
	*/
	public Computer() {	}
	public Computer(int cpu) { this.cpu = cpu; }
	public Computer(int cpu, int memory) {
		this.cpu = cpu;
		this.memory = memory;
	}
	public Computer(String brand, int cpu) {
		this.cpu = cpu;
		this.brand = brand;
	}
	public Computer(int cpu, int memory, int hd, int keyboard, String brand) {
		this.cpu = cpu;
		this.memory = memory;
		this.hd = hd;
		this.keyboard = keyboard;
		this.brand = brand;
	}
	
	
	
	
}
/* 클래스는 하나 이상의 멤버를 가짐
class 클래스명 {
	필드타입 필드명;
}
*/ 
