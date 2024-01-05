package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member jws = new Member("정우성", "jws", 50000);
		Member yjs = new Member("유재석", "yjs", 30000);
		Member lhr = new Member("이효리", "lhr", 40000);
		
		jws.showInfo();
		yjs.showInfo();
		lhr.showInfo();
		
		
	}

}
