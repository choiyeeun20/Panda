package com.jse.swing;

public class MemberService {
	private MemberBean[] members;
	private int count;
	
	public MemberService() {
		members = new MemberBean[3];
	}
	public void setMembers(MemberBean[] members) {
		this.members = members;
	}
	public MemberBean[] getMembers() {
		return members;
	}
	public void add(MemberBean member) {
		members[0] = member;
		count++;
	}
}
