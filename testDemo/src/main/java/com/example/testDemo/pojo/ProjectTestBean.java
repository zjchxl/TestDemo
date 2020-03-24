package com.example.testDemo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

public class ProjectTestBean {
	private String pro_no;
	private String pro_fuction;
	private String pro_id;
	private String inpute_date;
	private String pro_estiscale;
	private String pro_budget;
	private String input_state;
	
	@Override
	public String toString() {
		return "ProjectTestBean [pro_no=" + pro_no + ", pro_fuction=" + pro_fuction + ", pro_id=" + pro_id
				+ ", inpute_date=" + inpute_date + ", pro_estiscale=" + pro_estiscale + ", pro_budget=" + pro_budget
				+ ", input_state=" + input_state + "]";
	}
	public String getPro_no() { 
		return pro_no;
	}
	public void setPro_no(String pro_no) {
		this.pro_no = pro_no;
	}
	public String getPro_fuction() {
		return pro_fuction;
	}
	public void setPro_fuction(String pro_fuction) {
		this.pro_fuction = pro_fuction;
	}
	public String getPro_id() {
		return pro_id;
	}
	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}
	public String getInpute_date() {
		return inpute_date;
	}
	public void setInpute_date(String inpute_date) {
		this.inpute_date = inpute_date;
	}
	public String getPro_estiscale() {
		return pro_estiscale;
	}
	public void setPro_estiscale(String pro_estiscale) {
		this.pro_estiscale = pro_estiscale;
	}
	public String getPro_budget() {
		return pro_budget;
	}
	public void setPro_budget(String pro_budget) {
		this.pro_budget = pro_budget;
	}
	public String getInput_state() {
		return input_state;
	}
	public void setInput_state(String input_state) {
		this.input_state = input_state;
	}
	
}
