package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Goods> gList = new ArrayList<Goods>();
		int sum = 0;

		System.out.println("상품을 입력해주세요(종료 q)");

		while (true) {
			String str = sc.nextLine();

			if (str.equals("q")) {
				System.out.println("[입력완료]");
				System.out.println("==============");
				break;
			}
			String[] goods = str.split(",");

			String name = goods[0].trim();
			int price = Integer.parseInt(goods[1].trim());
			int count = Integer.parseInt(goods[2].trim());

			Goods newGoods = new Goods(name, price, count);
			gList.add(newGoods);

			sum += count;

		}
		for (Goods goods : gList) {
			goods.showInfo();
		}
		System.out.println("모든 상품의 갯수는 " + sum + "개입니다.");

	}// main()

}// class
