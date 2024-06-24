package Lab6;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		String n, password;
		// do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao username");
		n = sc.nextLine();
		System.out.println("Nhap vao password");
		password = sc.nextLine();
		// } while (n != ("hoidanit") && password.length() <= 6);

		// System.out.println("Ban da nhap dung");
		if (n.equals("hoidanit") && (password.length() > 6)) {
			System.out.println("Valid input");
		}
	}
}
