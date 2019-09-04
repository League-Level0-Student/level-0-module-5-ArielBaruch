package _05_circle_ring;

public class For_Loop_Guantlet {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		for (int a = 100; a > 0; a--) {
			System.out.println(a);
		}
		for (int b = 2; b < 101; b++) {
			if (b % 2 == 0) {
				System.out.println(b);
			}
		}
		for (int c = 1; c < 100; c--) {
			if (c % 2 == 1) {
				System.out.println(c);
			}
		}

		for (int v = 1; v < 500; v++) {
			if (v % 2 == 0) {
				System.out.println(v + " is even");
			} else {
				System.out.println(v + " is odd");
			}
		}

	}
}
