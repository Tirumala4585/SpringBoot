package com.tmf.bank.classes;
public class Triangle {
	private String type;
	private int height;
	public void setType(String type)
	{
		this.type=type;
	}
	public void setHeight(int height)
	{
		this.height=height;
	}
	public void draw()
	{
		System.out.println("Type : "+type);
		System.out.println("Height : "+height);
	}
}
