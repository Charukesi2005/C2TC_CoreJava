package com.tnif.dayeight;

public class Executor {

	public static void main(String[] args) {
		
	Coder c1;//reference
	
	
	c1=new Student();//Object is Created for Student
	c1.rules();
	
 System.out.println("-----------------------");
 
	c1=new Trainer();//Object is Created for Trainer
	c1.rules();
	}

}
