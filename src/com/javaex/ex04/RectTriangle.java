package com.javaex.ex04;

public class RectTriangle extends Shape implements Resizeable {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	public double getArea() {
		return width * height * 0.5;
	}

	@Override
	public double getPerimeter() {
		return (double) Math.pow(width, height);
	}

	@Override
	public void resize(double s) {
		width = s * width;
		height = s * height;
	}

}