package Lab4;

public class Bai2 {

	public static void main(String[] args) {
		Bai1 a = new Bai1();// de su dung class can tao ra ban sao cua no(keyword new)

		Bai1 b = a.NhapThongTin("Sua", 10000, 200);// Ham lay tu nhung doi tuong duoc new
		a.XuatThongTin(b);
		System.out.println("tax = " + a.getTaxPrice(b.getPrice(), b.getTax()));

	}
}
