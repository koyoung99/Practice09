package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Goods> gList = new ArrayList<Goods>();

		System.out.println("상품을 입력해주세요(종료 q)");

		boolean a = true;

		while (a) {
			String[] str = sc.nextLine().split(",");

			// 배열을 리스트로 변경

			for (int i = 0; i < str.length; i++) {
				// 리스트출력
				System.out.println(gList.toString());
			}
			if (str.equals("q")) {
				System.out.println("[입력완료]");
				System.out.println("=======================");

				a = false;
			} // if

		} // while
		for (

			int i = 0; i < gList.size(); i++) {
			System.out.println(gList.get(i).toString());
		}
		// 총 상품의 갯수

	}// main()

}// class
