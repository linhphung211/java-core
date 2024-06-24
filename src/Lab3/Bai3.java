package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap kich thuoc mang: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Nhap cac phan tu mang: ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array ban dau: " + Arrays.toString(a));
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Array sau khi sap xep lai: " + Arrays.toString(a));
		// System.out.println("Phan tu lon nhat trong mang la: " + a[a.length - 1]);
		// System.out.println("Phan tu be nhat trong mang la: " + a[0]);
		int max = a[1];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Phan tu lon nhat trong mang la: " + max);
		int min = a[1];
		for (int j = 0; j < a.length; j++) {
			if (a[j] < min) {
				min = a[j];
			}
		}
		System.out.println("Phan tu be nhat trong mang la: " + min);
	}
}
