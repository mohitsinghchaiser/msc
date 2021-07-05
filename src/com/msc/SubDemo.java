package com.msc;
import java.util.*;

public class SubDemo {
	
	public String name;
	public int age;
	public String location;
	public boolean covit;
	
	
	public SubDemo(String name,int age,String location,boolean covit) {
		
		this.name = name;
		this.age = age;
		this.location = location;
		this.covit = covit;
	}
	
	
	
	public String getName() {
		return name;

	}
	
	public void setName(String perName) {
		
		this.name = perName;
	}
	
	public int getAge() {
     return age;
}
	
	public void setAge(int perAge) {
		
		this.age = perAge;
		
	}
	
	public String getLoc() {
		return location;
	}

	public void setLoc(String loc) {
		
		this.location = loc;
	}	
	
	public boolean getResult() {
		
		return covit;
		
	}
	
	public void setResult(boolean result) {
		
		this.covit = result;
		
	}
	
	
	
	
	
	
		
	}