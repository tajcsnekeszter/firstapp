package hu.firstapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class App {

	private final List<Integer> list;
	
	public App() {
		this.list = init(100, 100);
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
		System.out.println("A sorozat " + max() + ". eleme a  legnagyobb, értéke " + list.get(max()));
		System.out.println(this);
	}
	
	private int sequenceAdd() {
		int s = 0;
		for (int i = 0; i < list.size(); i++) {
			s += list.get(i);
		}
		return s;
	}
	
	private boolean condition(final int denominator) {
		int i = 0;
		while (i < list.size() && list.get(i)% denominator !=0) {
			i = i + 1;
		}
		return i < list.size();
	}
	
	private int select(final int denominator) {
		int i = 0;
		while (list.get(i)% denominator !=0) {
			i = i + 1;
		}
		return i ;
	}

	private int find(final int denominator) {
		int i = 0;
		while (i < list.size() && list.get(i)% denominator !=0) {
			i = i + 1;
		}
		return i < list.get(i) ? i : -1;
	}

	private int count(final int denominator) {
		int db = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)% denominator ==0 ) {
				db = db + 1;
			}
		}
		return db;
	}

	private int max() {
		int max = 0;
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > list.get(max)) {
				max = i;
			}
			
		}
		return max;
	}

	private List<Integer> init(int size, int bound) {
		Random random = new Random();
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			nums.add(random.nextInt(bound - 1) +1);
		}
		return nums;
	}

	@Override
	public String toString() {
		return "App [x=" + list + "]";
	}

	
}


