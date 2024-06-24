package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<>();
		System.out.println("Nhap vao 1 so thuc bat ki: ");
		Scanner sc = new Scanner(System.in);
		while (true) {
			Double x = sc.nextDouble();
			a.add(x);
			sc.nextLine();
			System.out.println("Nhap them (Y/N)?");
			String t = sc.nextLine();

			if (t.equals("N") || t.equals("n")) {
				break;
			}

		}
		double sum = 0;
		for (int i = 0; i < a.size(); i++) {

			sum += a.get(i);
		}
		System.out.println(sum);

	}
}
