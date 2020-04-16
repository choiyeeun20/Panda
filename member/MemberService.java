package com.jse.member;

public interface MemberService {

	public void add(Member member); //Create
	public Member[] list();
	public Member[] searchByName(String name); // Read
	// CRUD 중에 Read : []all []some one int
	public Member[] searchByGender(String gender);
	
	public Member detail(String userid);//detail은 객체가아니라 받은값에따라서 
	public int Count();
	public int count(String name);
	public Member login(Member member);
	public void update(Member member);
	public void delete(Member member);
	
}
