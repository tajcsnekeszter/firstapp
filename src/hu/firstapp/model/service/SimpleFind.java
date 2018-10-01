package hu.firstapp.model.service;

import java.util.List;

public class SimpleFind implements SimpleStrategy<Integer> {

	private final List<Integer> list;
	
	public SimpleFind(List<Integer> list) {
			this.list = list;
	}

	@Override
	public Integer getResult(int denominator) {
		int i = 0;
		while (i < list.size() && list.get(i)% denominator !=0) {
			i++;
		}
		return i < list.get(i) ? i : -1;
	}

}
