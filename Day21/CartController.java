package pro02.sec2;

public class CartController {
	//Controller
	public static void main(String[] args) {
		CartDAO dao = new CartDAO();
		Cart ct = dao.getCart(2);
		System.out.println(ct.toString());
	}

}
