package hu.firstapp.model.service;

import java.util.List;

public class SimpleMax implements SimpleStrategy<Integer> {

	private final List<Integer> list;
	
	public SimpleMax(List<Integer> list) {
			this.list = list;
	}

	@Override
	public Integer getResult(int denominator) {
		int max = 0;
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > list.get(max)) {
				max = i;
			}
		}
		return max;
	}
}
