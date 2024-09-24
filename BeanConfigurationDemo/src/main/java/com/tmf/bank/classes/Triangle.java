package com.tmf.bank.classes;
public class Triangle {
	public Triangle(String type)
	{
		this.type=type;
	}
	public Triangle(String type,int height)
	{
		this.type=type;
		this.height=height;
	}
	public Triangle(int height,String type) {
		this.type=type;
		this.height=height;
	}
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
