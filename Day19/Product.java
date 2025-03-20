package pro02.sec2;

public class Product {
	private int pno;
	private String cate;
	private String pname;
	private int amount;
	private int price;
	private String remark;
	private String pic;
	
	/*
	상품등록(void register(cate, pname, pic)): OOO이 상품으로 등록되었습니다.	
	상품수정(void modify(pno)):OOO번 상품의 정보가 수정되었습니다.
	상품검색(void search(pno)): OOO번 상품 정보가 검색되었습니다.
	상품삭제(void delete(pno)): OOO번 상품이 삭제되었습니다.
	*/
	public void register(String cate, String pname, String pic) {
		System.out.println(pname+"이 상품으로 등록되었습니다.");
	}
	public void modify(int pno) { 
		System.out.println(pno+"번 상품의 정보가 수정되었습니다.");
	}
	public void search(int pno) {
		System.out.println(pno+"번 상품이 삭제되었습니다.");
	}
	public void delete(int pno) {
		System.out.println(pno+"번 상품 정보가 검색되었습니다.");
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getCate() {
		return cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	@Override
	public String toString() {
		return "Product [pno=" + pno + ", cate=" + cate + ", pname=" + pname + ", amount=" + amount + ", price=" + price
				+ ", remark=" + remark + ", pic=" + pic + "]";
	}
}
