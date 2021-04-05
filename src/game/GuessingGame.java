package game;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		int guess = 0;
		for (int i = 1; i <= 16; i++) {
			System.out.print(i + " ");
		}
		Random rand = new Random();
		int val = rand.nextInt(16);
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter a value between 1-16 : ");
		int beg = 1;
		int end = 16;
		while (beg <= end) {
			guess = sc.nextInt();
			if (guess > val) {
				end = guess - 1;
				System.out.println("My number is lower than " + guess + ". Guess lower!");
				for (int i = beg; i <= end; i++) {
					System.out.print(i + " ");
				}
			} else if (guess < val) {
				beg = guess + 1;
				System.out.println("My number is higher than " + guess + ". Guess higher!");
				for (int i = beg; i <= end; i++) {
					System.out.print(i + " ");
				}
			} else {
				System.out.println("Yes! That's my number!");
				break;
			}
			System.out.println();
		}
	}

}
