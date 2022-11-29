package com.xworkz.interviewcodingquestions.code;

public class PaternProgramStar {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			System.out.print(" * ");
		}
		for (int i = 0; i <= 5; i++) {
			System.out.println(" * ");
		}

		System.out.println("============");

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.print(" @ ");
			}

			System.out.println(" ");
		}

		System.out.println("============");

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}

		System.out.println("============");

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (j == 3) {
					System.out.print(" R ");
				} else {
					System.out.print(i);
				}
			}
			System.out.println(" ");
		}

		System.out.println("================");

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i == 2) {
					System.out.print("RASHMI ");
				} else {
					System.out.print(i);
				}
			}
			System.out.println(" ");
		}
		System.out.println("==============");

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("RASHMI ");
			}

			System.out.println(" ");
		}
		System.out.println("==============");

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}

			System.out.println(" ");
		}

		System.out.println("==============");

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			System.out.println(" ");
		}

		System.out.println("==============");

		for (int i = 1; i <= 3; i++) {
			for (int j = i; j <= 3; j++) {
				System.out.print(" # ");
			}

			System.out.println(" ");
		}
		System.out.println("===========");

		for (int i = 1; i <= 3; i++) {
			for (int j = i; j <= 3; j++) {
				System.out.print(j);
			}

			System.out.println(" ");
		}

		System.out.println("===========");

		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("$");
			}
			System.out.println(" ");
		}

		System.out.println("==============");

		int r = 4;
		for (int i = 1; i <= r; i++) {
			for (int j = r - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("$ "); /// triangle=give space
			}
			System.out.println(" ");
		}

		System.out.println("============");

		int q = 4;
		for (int i = 1; i <= q; i++) {
			for (int j = q - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}

		System.out.println("==============");

		int a = 4;
		for (int i = 1; i <= a; i++) {
			for (int j = a - 1; j >= i; j--) {
				if (j == 2) {
					System.out.print("RASHMI");
				} else {
					System.out.print(j);
				}
			}
			for (int k = 1; k <= i; k++) {
				if (k == 2) {
					System.out.print("RASHMI");
				} else {
					System.out.print(k); /// triangle=give space
				}
			}
			System.out.println(" ");
		}

		System.out.println("===========");

		for (int i = 1; i >= 3; i--) {
			for (int j = i; j >= 3; j++) {
				System.out.print("#");
			}

			System.out.println(" ");
		}

	}
}
