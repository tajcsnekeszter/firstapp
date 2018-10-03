package hu.firstapp.model.service;

import java.util.List;

public class SimpleCount implements SimpleStrategy<Integer> {

	private final List<Integer> list;

	
	public SimpleCount(List<Integer> list) {
			this.list = list;
	}

	@Override
	public Integer getResult(int denominator) {
		int db = 0;
		for (Integer item : list) {
				if (item % denominator == 0) {
					db++;
			}
		}
		return db;
	}
}
