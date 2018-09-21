package com.java.Springpro;

import org.springframework.beans.factory.annotation.Required;

public class AnnotationsDemo {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	@Required
	public void setY(int y) {
		this.y = y;
	}
	
}
