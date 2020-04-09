package com.jse.member;

public class MemberService {
	private Member[] members;
	private int count;
	
	public MemberService() {
		members = new Member[3];
	}
	public void setMembers(Member[] members) {
		this.members = members;
	}
	public Member[] getMembers() {
		return members;
	}
	public void add(Member member) {
		members[0] = member;
		count++;
	}
}
