package Lab3;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bang cuu chuong cua so: ");
		int x = sc.nextInt();
		int i = 1;
		while (i <= 10) {
			System.out.printf("%d x %d = %d\n", x, i, x * i);
			i++;
		}
	}
}
