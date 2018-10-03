package hu.firstapp.model.service;

import java.util.List;

public class SimpleCondition implements SimpleStrategy<Boolean> {
	
	private final List<Integer> list;
	

	public SimpleCondition(List<Integer> list) {
		this.list = list;
	}


	@Override
	public Boolean getResult(int denominator) {
		int i = 0;
		while (i < list.size() && list.get(i)% denominator !=0) {
			i++;
		}
		return i < list.size();
	}
}
