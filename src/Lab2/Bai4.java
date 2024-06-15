package Lab2;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");
		System.out.println("Nhap tinh nang ban chon theo stt: ");
		int choose = sc.nextInt();
		switch (choose) {
		case 1: {
			System.out.println("<< LUA CHON TINH NANG 1 >>");
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
			break;
		case 2: {
			System.out.println("<< LUA CHON TINH NANG 2 >>");
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
			break;
		case 3: {
			System.out.println("<< LUA CHON TINH NANG 3 >>");
			int sodien;
			do {
				System.out.println("Nhap vao so dien: ");
				sodien = sc.nextInt();
			} while (sodien <= 0);
			if (sodien <= 100) {
				System.out.println("So tien can phai tra la: " + sodien * 1000);
			} else {
				System.out.println("So tien can phai tra la: " + 100 * 1000 + (sodien - 100) * 1500);

			}
		}
			break;
		default:
			System.out.println("Ban da thoat khoi chuong trinh");
			System.exit(0);
		}

	}
}
