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

	public void rewitreFavorate() {// �ק�ڪ��̷R��k
		while (loop) {
			System.out.println("�O�_�ݭק�y/n");
			choose = scanner.nextLine();
			if (choose.equalsIgnoreCase("y")) {
				display_favorate();
				System.out.println("��ܨɧR�����X:");
				pick = scanner.nextInt();
				if (getremind() > pick && pick > 0) {
					for (int i = pick - 1; i < getremind(); i++) {
						favorate[i] = favorate[i + 1];
						setsubremind();
						loop = false;
					}

				} else {
					System.out.println("��J���X���~");
				}
			} else {
				loop = false;
			}
		}
	}

	public boolean getFavorate(String coursuename) {//�[�ڪ��̷R�L�{
		if (remind != 5) {
			for (int i = 0; i < remind; i++) {
				if (!(coursuename.equals(favorate[i]))) {
					if (remind == i) {
						break;
					} else {
						continue;
					}
				} else {
					System.out.println("�w�[�L���ҵ{");
					return false;
				}
			}
			System.out.println("���\�[�J�ڪ��̷R");
			return true;
		} else {
			System.out.println("�ڪ��̷R�w��");
			rewitreFavorate();
		}
		return false;
	}

	public void setaddremind() {// ����W��
		remind++;
	}

	public void setsubremind() {// ����W��
		remind--;
	}

	public int getremind() {// ����W��
		return remind;
	}

	public void display_favorate() {// �L�X�ڪ��̷R
		for (int i = 0; i < getremind(); i++) {
			int j = 1;
			System.out.println(j + "." + favorate[i]);
			j++;
		}
	}

}
