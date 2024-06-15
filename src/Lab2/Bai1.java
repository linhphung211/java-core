package Lab2;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		int a = sc.nextInt();
		System.out.println("Nhap b: ");
		int b = sc.nextInt();
		System.out.printf("Bieu thuc vua nhap la: %dx + %d = 0\n", a, b);
		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh co vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			float x = (float) -b / a;
			System.out.println("Phuong trinh co nghiem x = " + x);
		}

	}
}
