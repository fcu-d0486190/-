package oop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Coursecode code = new Coursecode();
		Favorate favorate = new Favorate();
		String coursecode, choose;
		String course = "國防";
		boolean found;
		coursecode = scanner.nextLine();// 輸入選課代碼
		if (code.getcoursecode(coursecode)) {
			System.out.println("顯示課程資訊....");// 這裡要輸出相對應的課程
			System.out.println("是否加入我的最愛 y/n");// 選則是否要加入我的最愛
			choose = scanner.nextLine();
			if (choose.equalsIgnoreCase("y")) {//檢查是否加入
				if(favorate.getFavorate(course)){//有
					favorate.setaddremind();//最愛+1
				}
				else{
					
				}
			}
		} else {
			System.out.println("無此代碼請重新輸入  http://查詢選課網址");
		}
	}

}
