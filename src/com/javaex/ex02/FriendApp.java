package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Friend> fList = new ArrayList<Friend>();

		System.out.println("친구를 3명 등록해주세요");

		for (int i = 0; i < 3; i++) {
			String name = sc.next();
			String hp = sc.next();
			String school = sc.next();
			fList.add(new Friend(name, hp, school));
		}

		for (int i = 0; i < fList.size(); i++) {
			System.out.println(fList.get(i).toString());
		}

	}

}