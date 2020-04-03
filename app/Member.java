package com.jse.app;

public class Member {
	private String id;//참조주소 = reference; 메모리 차지안함
	public Member() {
		
	}
	public void setId(String id) {
		System.out.println("지역변수 들어옴:"+id);
		this.id = id;
		System.out.println("인스턴스변수에 저장됨:"+id);
	}
	public String getId() {
		return this.id; 
	}
	
}
//Dynamic Method = method