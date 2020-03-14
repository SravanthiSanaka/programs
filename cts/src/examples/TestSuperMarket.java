package examples;

abstract class SuperMarket{
	abstract public void payment();
	abstract public void insuranceOnProducts();
	public void selectProducts() {
		System.out.println("goods are selected as per the base company rules");
	}
	public void shipmentOfGoods() {
		System.out.println("goods will be delivered as per base company rule");
	}
}
class Market1 extends SuperMarket{
	public void payment() {
		System.out.println("cash payment only");
	}
	public void insuranceOnProducts() {
		System.out.println("insurance is available");
	}
}
class Market2 extends SuperMarket{
	public void payment() {
		System.out.println("upi payment only");
	}
	public void insuranceOnProducts() {
		System.out.println("ssh is available");
	}
}
public class TestSuperMarket{
	public static void main(String[] args) {
		Market1 m1=new Market1();
		m1.selectProducts();
		m1.shipmentOfGoods();
		m1.payment();
		m1.insuranceOnProducts();
		Market2 m2=new Market2();
		m2.payment();
		m2.insuranceOnProducts();
	}
}