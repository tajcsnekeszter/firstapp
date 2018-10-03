package hu.firstapp.model.service;

import java.util.List;

public class SimpleSelect implements SimpleStrategy<Integer> {

	private final List<Integer> list;
	
	public SimpleSelect(List<Integer> list) {
		this.list = list;
	}

	@Override
	public Integer getResult(int denominator) {
		int i = 0;
		while (list.get(i)% denominator !=0) {
			i ++;
		}
		return i;
	}	
}
