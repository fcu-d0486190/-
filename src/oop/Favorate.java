package oop;
import java.util.Scanner;

public class Favorate {
	Scanner scanner = new Scanner(System.in);
	private String[] favorate = {"null","null","null","null","null","null"};
	private int remind = 0;//目前有幾個我的最愛
	String choose, temp;
	int pick;//選擇我要刪的代碼
	boolean loop = true;
	
	////////////////////////////////
	private String[] coursecode = {"1","2","3","4","5","6"};//選課代碼
	private String[] coursename = {"國防","計概","資料結構","微積分","戀愛心理學","物理"};
	String coursenames;
	public boolean getcoursecode(String code){
		boolean found = false;
		for(String coursecode : coursecode){
			if(code.equals(coursecode)){
				found = true;
			}
		}
		return found;
	}
	public String getcoursename(String code){
		if(code.equals("1")){
			coursenames = getcoursename(0);
		}
		else if(code.equals("2")){
			coursenames =  getcoursename(1);
		}
		else if(code.equals("3")){
			coursenames = getcoursename(2);
		}
		else if(code.equals("4")){
			coursenames = getcoursename(3);
		}
		else if(code.equals("5")){
			coursenames =  getcoursename(4);
		}
		else if(code.equals("6")){
			coursenames =  getcoursename(5);
		}
		return coursenames;
	}
	
	public String getcoursename(int code){//傳課名稱
		return coursename[code];
	}
	////////////////////////////
	
	
	public void rewitreFavorate() {//修改我的最愛
		while (loop) {
			System.out.println("是否需要修改y/n");
			choose = scanner.nextLine();
			if (choose.equalsIgnoreCase("y")) {
				display_favorate();
				System.out.println("選擇想刪除號碼:");
				pick = scanner.nextInt();
				if (getremind() >= pick && pick > 0) {
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
		loop = true;
	}

	public boolean getFavorate(String coursuename) {//加我的最愛過程
		if (remind < 5) {
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
			System.out.println(getremind());
			favorate[getremind()] = coursuename;
			setaddremind();
			System.out.println(getremind());
			System.out.println("成功加入我的最愛");
			return true;
		} else {
			System.out.println("我的最愛已滿");
			rewitreFavorate();
			return false;
		}
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
		int j = 1;
		System.out.println(getremind());
		for (int i = 0; i < getremind(); i++) {
			System.out.println(j + "." + favorate[i]);
			j++;
		}
	}
}