package oop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Coursecode code = new Coursecode();
		Favorate favorate = new Favorate();
		String coursecode, choose;
		String course = "�꨾";
		boolean found;
		coursecode = scanner.nextLine();// ��J��ҥN�X
		if (code.getcoursecode(coursecode)) {
			System.out.println("��ܽҵ{��T....");// �o�̭n��X�۹������ҵ{
			System.out.println("�O�_�[�J�ڪ��̷R y/n");// ��h�O�_�n�[�J�ڪ��̷R
			choose = scanner.nextLine();
			if (choose.equalsIgnoreCase("y")) {//�ˬd�O�_�[�J
				if(favorate.getFavorate(course)){//��
					favorate.setaddremind();//�̷R+1
				}
				else{
					
				}
			}
		} else {
			System.out.println("�L���N�X�Э��s��J  http://�d�߿�Һ��}");
		}
	}

}
