package com.tnif.dayone.encapsulation;

public class Student {
int id;
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
}
@Override
public String toString() {
	return "Student[id=" +id+",name=" +name+"]";
}
}
