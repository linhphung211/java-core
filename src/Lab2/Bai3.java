package Lab2;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		int sodien;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Chuong trinh tinh tien dien");
			System.out.println("Nhap vao so dien: ");
			sodien = sc.nextInt();
		} while (sodien <= 0);
		if (sodien <= 100) {
			System.out.println("So tien can phai tra la: " + sodien * 1000);
		} else {
			System.out.println("So tien can phai tra la: " + 100 * 1000 + (sodien - 100) * 1500);

		}
	}
}
