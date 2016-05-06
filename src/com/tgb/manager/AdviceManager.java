package com.tgb.manager;

import java.util.List;

import com.tgb.entity.Advice;
import com.tgb.entity.College;

public interface AdviceManager {
	public List<Advice> getAllAdvice();
	
	public List<Advice> getAdviceByCollege(College college);
	
	public void deleteAdvice(int id);
	public void addAdvice(Advice advice);
}
