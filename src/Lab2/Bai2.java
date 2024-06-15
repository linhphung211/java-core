package Lab2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = sc.nextInt();
		System.out.println("Nhap b: ");
		int b = sc.nextInt();
		System.out.println("Nhap c: ");
		int c = sc.nextInt();
		sc.close();
		System.out.printf("Bieu thuc vua nhap la: %dx^2 + %dx + %d = 0\n", a, b, c);
		if (a == 0) {
			if (b == 0 && c == 0) {
				System.out.println("Phuong trinh co vo so nghiem");
			} else if (b == 0 && c != 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else {
				float x = (float) -c / b;
				System.out.println("Phuong trinh co nghiem x = " + x);
			}
		}
		if (a != 0) {
			int delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.println("Phuong trinh co nghiem kep la: " + x);
			} else {
				System.out.println("Phuong trinh co 2 nghiem rieng biet: ");
				System.out.println("x1 = " + (float) (-b + Math.sqrt(delta)) / (2 * a));
				System.out.println("x2 = " + (float) (-b - Math.sqrt(delta)) / (2 * a));
			}
		}

	}
}
