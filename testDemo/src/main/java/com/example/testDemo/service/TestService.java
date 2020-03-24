package com.example.testDemo.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.example.testDemo.pojo.ProjectTestBean;


public interface TestService {
	
	public void insert(ProjectTestBean projectTestBean);
	
	public void update(ProjectTestBean projectTestBean);
	
	public void delete(int id);
	
	public ProjectTestBean find(int id);
	
}
