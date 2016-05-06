package com.tgb.dao;

import java.util.List;

import com.tgb.entity.Advice;
import com.tgb.entity.School;

public interface AdviceDao {
	public List<Advice> getAllAdvice();
	public void deleteAdviceById(int id);
	public void addAdvice(Advice advice);
}
