package Lab4;

public class Bai1 {
	private String Name;// private: tang tinh bao mat cho du an(encapsulation)
	private double Price;
	private double Tax;

	public Bai1(String name, double price, double tax) {
		this.Name = name;
		this.Price = price;
		this.Tax = tax;
	}

	public Bai1() {

	}

	// khai bao getter setter de co the truy cap duoc nhung noi khac
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		this.Price = price;
	}

	public double getTax() {
		return Tax;
	}

	public void setTax(double tax) {
		this.Tax = tax;
	}

	public Bai1 NhapThongTin(String Name, double Price, double Tax) { // bat buoc phai trar ra 1 obj
		Bai1 b1 = new Bai1(Name, Price, Tax);// thay vi dung void, ta se tra ve 1 doi tuong(pp moi)
		return b1;
	}

	// truyen vao 1 doi tuong va in ra tat ca thuoc tinh cua no
	public void XuatThongTin(Bai1 b1) {
		System.out.println("San pham " + b1.getName() + " co gia thanh " + b1.getPrice() + " dong co muc thue la "
				+ b1.getTax() + " dong!");
	}

	public double getTaxPrice(double Price, double Tax) {
		return Price * Tax;
	}

}
