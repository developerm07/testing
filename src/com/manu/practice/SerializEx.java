package com.manu.practice;

import java.io.Serializable;

public class SerializEx implements Serializable{

	private String name;
	private String sal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	
	@Override
    public String toString() {
        return new StringBuffer(" Name: ").append(this.name)
                .append(" Sal : ").append(this.sal).toString();
    }
	
}
