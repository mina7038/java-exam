package pro02.sec2;
//DTO
public class Cart {
	private int cno;
	private String id;
	private int pno;
	private int price;
	private int amount;
	
	public void insCart(String id, int pno, int amount) {
		System.out.println(id+"님이 장바구니에 담기를 하셨습니다.");
	}
	
	public void getCart(int cno) {
		System.out.println(cno+" 상품 정보입니다.");
	}
	
	public void editCart(int cno) {
		System.out.println(cno+" 상품 정보가 변경되었습니다.");
	}
	
	public void delCart(int cno) {
		System.out.println(cno+" 상품 정보가 삭제되었습니다.");
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Cart [cno=" + cno + ", id=" + id + ", pno=" + pno + ", price=" + price + ", amount=" + amount + "]";
	}
	
}
