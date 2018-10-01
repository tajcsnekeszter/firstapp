package hu.firstapp.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListGenerator {

	public static List<Integer> getList(int size, int bound) {
		Random random = new Random();
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			nums.add(random.nextInt(bound - 1) +1);
		}
		return nums;
	}
}
