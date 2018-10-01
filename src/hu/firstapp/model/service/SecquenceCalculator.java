package hu.firstapp.model.service;

import java.util.List;

public class SecquenceCalculator implements SimpleStrategy<Integer> {
	
	private final List<Integer> list;
		
	public SecquenceCalculator(List<Integer> list) {
		this.list = list;
	}

	@Override
	public Integer getResult(int denominator) {
		int sum = 0;
		for (Integer item : list) {
			sum += item;
		}
			return sum;
	}
}
