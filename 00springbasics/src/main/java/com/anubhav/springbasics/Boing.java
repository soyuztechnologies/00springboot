package com.anubhav.springbasics;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Boing implements IWings{

	private int width;
	private int height;
	private String Brand;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	@Override
	public String toString() {
		return "Wings [width=" + width + ", height=" + height + ", Brand=" + Brand + "]";
	}
	
	
}
