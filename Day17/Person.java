package pro02.sec1;

public class Person {	//private, default, public
	private String name;
	private int age;
	private String country;
	private float iq;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public float getIq() {
		return iq;
	}
	public void setIq(float iq) {
		this.iq = iq;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", country=" + country + ", iq=" + iq + "]";
	}
	
}