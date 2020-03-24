package com.example.testDemo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.testDemo.pojo.ProjectTestBean;

@Mapper
public interface TestProjectDao {
	public void insert(ProjectTestBean projectTestBean);
	
	public void update(ProjectTestBean projectTestBean);
	
	public void delete(int id);
	
	public ProjectTestBean find(int id);
	
	@Select("select * from ")
	public ProjectTestBean selelct();
}
