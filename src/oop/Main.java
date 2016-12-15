package oop;

import java.util.Scanner;

public class Main {

	public static void main(String[] argc) {
		Scanner scanner = new Scanner(System.in);
		Favorate favorate = new Favorate();

		while (true) {
			System.out.println("輸入功能代碼");
			int num = scanner.nextInt();
			switch (num) {
			case 1: {// 加入我的最愛
				String coursecode, choose;
				boolean found;
				System.out.println("輸入選課代碼:");
				coursecode = scanner.next();// 輸入選課代碼
				if (favorate.getcoursecode(coursecode)) {
					System.out.println("顯示課程資訊");// 這裡要輸出相對應的課程

					System.out.println("1.我的最愛\n2.修改我的最愛\n3.無動作");
					choose = scanner.next();
					switch (choose) {
					case "1": {
						System.out.println("是否加入我的最愛y/n");// 選則是否加入我的最愛
						choose = scanner.next();
						if (choose.equalsIgnoreCase("y")) {// 檢查是否有加入
							if (favorate.getFavorate(favorate.getcoursename(coursecode))) {// 有
							}
						} else {
							System.out.println("無此代碼請重新輸入  http://查詢選課網址");
						}
						break;
					}
					case "2": {
						favorate.display_favorate();
						favorate.rewitreFavorate();
						break;
					}

					case "3": {

						break;
					}
					}
				}
				break;
			}
			case 2: {
				break;
			}
			case 3: {
				break;
			}
			case 4: {
				break;
			}
			case 5: {
				break;
			}
			case 6: {
				break;
			}
			}
		}
	}

}