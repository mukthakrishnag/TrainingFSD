package com.atria.Day6;

public class singleLevelInheritance {
@Override
	public String toString() {
		return "singleLevelInheritance [name=" + name + ", College=" + College + "]";
	}
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return College;
	}
	public void setCollege(String college) {
		College = college;
	}
public singleLevelInheritance(String name, String college) {
		super();
		this.name = name;
		College = college;
	}
public singleLevelInheritance() {
		super();
	}
private String name;
private String College;
}
