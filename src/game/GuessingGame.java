package game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class theGuessingGame {

	public static void main(String[] args) {

		int inp = 0;

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 1; i <= 16; i++) {
			arr.add(i);
		}
		System.out.println(arr);
		int beg = 1;
		int end = arr.size();

		Random rand = new Random();
		int val = rand.nextInt(16);
		//System.out.println(val);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value between 1-16 : ");

		while (arr.size() > 0) {

			inp = sc.nextInt();

			if (inp > val) {
				end = inp - 1;
				arr.clear();
				for (int i = beg; i <= end; i++) {
					arr.add(i);
				}
				System.out.println("My number is lower than " + inp + ". Guess lower");

			} else if (inp < val) {
				beg = inp + 1;
				arr.clear();
				for (int i = beg; i <= end; i++) {
					arr.add(i);
				}
				System.out.println("My number is higher than " + inp + ". Guess higher");

			} else {
				System.out.println("Yes! That's my number!");
				break;
			}
			System.out.println(arr);
		}
	}

}
