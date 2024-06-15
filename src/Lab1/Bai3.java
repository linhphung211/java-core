package Lab1;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao canh cua khoi lap phuong: ");
		int a = sc.nextInt();
		sc.close();
		double v = Math.pow(a, 3);
		System.out.println("The tich khoi lap phuong: " + v);
	}
}
