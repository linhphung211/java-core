package Lab1;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao chieu dai: ");
		int length = sc.nextInt();
		System.out.print("Nhap vao chieu rong: ");
		int width = sc.nextInt();
		sc.close();
		int p = (length + width) * 2;
		int s = length * width;
		System.out.println("Chu vi hinh chu nhat: " + p);
		System.out.println("Dien tich hinh chu nhat: " + s);
		System.out.println("Canh nho nhat: " + Math.min(width, length));

	}
}
