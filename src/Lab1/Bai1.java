package Lab1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		String name = sc.nextLine();
		System.out.print("Nhap diem: ");
		float mark = sc.nextFloat();
		sc.close();
		System.out.println(name + " co so diem la: " + mark);
	}
}
