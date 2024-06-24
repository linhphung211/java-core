package Lab6;

import java.util.ArrayList;

public class Bai21 {
	public static void main(String[] args) {
		Bai2 b21 = new Bai2("Linh", "1");
		Bai2 b22 = new Bai2("Nguyen Tu", "2");
		Bai2 b23 = new Bai2("Lan", "3");
		Bai2 b24 = new Bai2("Nguyen Ly", "4");
		Bai2 b25 = new Bai2("Tuan", "5");

		ArrayList<Bai2> a = new ArrayList<>();
		a.add(b21);
		a.add(b22);
		a.add(b23);
		a.add(b24);
		a.add(b25);

		System.out.println("arr: " + a.toString());

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getName().startsWith("Nguyen")) {
				System.out.println("Start with Nguyen: " + a.get(i));

			}

		}

	}
}
