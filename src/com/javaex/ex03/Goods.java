package com.javaex.ex03;

public class Goods {

	private String name;
	private int price;
	private int count;

	public Goods(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}

	public void showInfo() {
		System.out.println(name + "(가격:" + price + "원)이 " + count + "개 입고 되었습니다.");
	}

}
