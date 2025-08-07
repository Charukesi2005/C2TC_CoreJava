//Program to demonstrate abstraction
package com.tnif.dayeight.abstraction;
public class Rectangle extends Shape{
	private float width, height;

	public Rectangle() {
		width = 5.0f;
		height = 2.0f;
	}

	public Rectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}

	@Override
	void calArea() {
		area=width*height;		
	}
	

}
