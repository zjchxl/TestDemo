package com.example.testDemo.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.example.testDemo.dao.TestProjectDao;
import com.example.testDemo.pojo.ProjectTestBean;

@ComponentScan({"com.example.testDemo.dao"})
@Service("testService")
public class TestServiceImpl implements TestService {

	@Autowired
	private TestProjectDao testProject;
	
	@Override
	public void insert(ProjectTestBean projectTestBean) {
		testProject.insert(projectTestBean);
	}

	@Override
	public void update(ProjectTestBean projectTestBean) {
		testProject.update(projectTestBean);
	}

	@Override
	public void delete(int id) {
		testProject.delete(id);
	}

	@Override
	public ProjectTestBean find(int id) {
		return testProject.find(id);
	}

}
