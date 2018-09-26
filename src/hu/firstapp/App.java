package hu.firstapp;

import java.util.Arrays;
import java.util.Random;

public class App {

	private final int[] x;
	
	public App() {
		this.x = init(100, 100);
	}
	
	public static void main(String[] args) {
	App app = new App();
	app.run();
	}
	
	private void run() {
		System.out.println(this);
		System.out.println("A sorozat összege: " + sequenceAdd());
		int denominator = 4;
		if (condition(denominator)) {
			System.out.println("A sorozatban van " + denominator + "-al osztható szám");
			System.out.println("A sorozat " + select(denominator) + ". eleme az!");
			
		} else {
			System.out.println("A sorozatban nincs " + denominator + "-al osztható szám");
		}
		
		denominator = 37;
		System.out.println("A sorozat " + find(denominator) + ". eleme osztható " + denominator + "-al");
		System.out.println("A sorozatban " + count(denominator) + " db " + denominator + "-al osztható szám van!");
		System.out.println("A sorozat " + max() + ". eleme a  legnagyobb, értéke " + x[max()]);
		System.out.println(this);
		System.out.println("Egyszerû kiválasztásos rendezéssel:");
		System.out.println(printNums(simpleSort(x)));
		System.out.println(this);
		System.out.println(printNums(bubbleSort(x)));
	}
	
	private int sequenceAdd() {
		int s = 0;
		for (int i = 0; i < x.length; i++) {
			s = s + x[i];
		}
		return s;
	}
	
	private boolean condition(final int denominator) {
		int i = 0;
		while (i < x.length && x[i]% denominator !=0) {
			i = i + 1;
		}
		return i < x.length;
	}
	
	private int select(final int denominator) {
		int i = 0;
		while (x[i]% denominator !=0) {
			i = i + 1;
		}
		return i ;
	}

	private int find(final int denominator) {
		int i = 0;
		while (i < x.length && x[i]% denominator !=0) {
			i = i + 1;
		}
		return i < x.length ? i : -1;
	}

	private int count(final int denominator) {
		int db = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i]% denominator ==0 ) {
				db = db + 1;
			}
		}
		return db;
	}

	private int max() {
		int max = 0;
		for (int i = 1; i < x.length; i++) {
			if (x[i] > x[max]) {
				max = i;
			}
			
		}
		return max;
	}
	
	private int[] simpleSort(final int[] x) {
		int[] nums = x.clone();
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int p = nums[i];
					nums[i] = nums[j];
					nums[j] = p;
				}
			}
		}
		return nums;
	}

	private int[] bubbleSort(final int[] x) {
		int[] nums = x.clone();
		for (int i = nums.length - 1; i > 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int p = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = p;
				}
			}
		}
		return nums;
	}

	
	public String printNums(final int[] x) {
		return "App [x=" + Arrays.toString(x) + "]";
	}
	
	private int[] init(int size, int bound) {
		Random random = new Random();
		int[] nums = new int[size];
		for (int i = 0; i < nums.length; i++) {
			nums [i] = random.nextInt(bound - 1) +1;
		}
		return nums;
	}

	@Override
	public String toString() {
		return "App [x=" + Arrays.toString(x) + "]";
	}
}


