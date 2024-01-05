package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		Goods cup = new Goods("머그컵", 2000);
				
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		cup.showInfo();
	}

}

/*생성자를 지정함으로써 디폴트 생성자가 없어졌기 때문에
  디폴트 생성자를 이용하고자 한다면 새로 생성자를 지정해줘야 한다.
  setName 메소드가 동작하지 않는 이유는 혼자 private로 설정되어 있기 때문에
  GoodsApp 클래스에는 보이지 않는 것이므로 public 으로 바꿔줘야 한다.
 */

