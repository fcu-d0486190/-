package oop;

import java.util.Scanner;
import java.util.*;

public class Favorate {
	Scanner scanner = new Scanner(System.in);
	private String[] favorate = new String[5];
	private int remind = 0;
	String choose, temp;
	int pick;
	boolean loop = true;

	public void rewitreFavorate() {//修改我的最愛
		while (loop) {
			System.out.println("是否需要修改/n");
			choose = scanner.nextLine();
			if (choose.equalsIgnoreCase("y")) {
				display_favorate();
				System.out.println("選擇想刪除號碼:");
				pick = scanner.nextInt();
				if (getremind() > pick && pick > 0) {
					for (int i = pick - 1; i < getremind(); i++) {
						favorate[i] = favorate[i + 1];
						setsubremind();
						loop = false;
					}

				} else {
					System.out.println("輸入號碼有誤");
				}
			} else {
				loop = false;
			}
		}
	}

	public boolean getFavorate(String coursuename) {//加我的最愛過程
		if (remind != 5) {
			for (int i = 0; i < remind; i++) {
				if (!(coursuename.equals(favorate[i]))) {
					if (remind == i) {
						break;
					} else {
						continue;
					}
				} else {
					System.out.println("已加過此課程");
					return false;
				}
			}
			System.out.println("成功加入我的最愛");
			return true;
		} else {
			System.out.println("我的最愛已滿");
			rewitreFavorate();
		}
		return false;
	}

	public void setaddremind() {// 控制上限
		remind++;
	}

	public void setsubremind() {// 控制上限
		remind--;
	}

	public int getremind() {// 控制上限
		return remind;
	}

	public void display_favorate() {// 印出我的最愛
		for (int i = 0; i < getremind(); i++) {
			int j = 1;
			System.out.println(j + "." + favorate[i]);
			j++;
		}
	}

}
