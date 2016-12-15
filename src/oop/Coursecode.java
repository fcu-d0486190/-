package oop;

public class Coursecode {
	private String[] coursecode = {"1","2","3","4","5"};//選課代碼
	
	public boolean getcoursecode(String code){
		boolean found = false;
		for(String coursecode : coursecode){
			if(code.equals(coursecode)){
				found = true;
			}
		}
		return found;
	}
	
}
