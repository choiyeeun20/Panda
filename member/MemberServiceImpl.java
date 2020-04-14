
package com.jse.member;

public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int count;
	boolean ok;

	public MemberServiceImpl() {
		members = new Member[5];
	}

	@Override
	public void setMembers(Member[] members) {
		this.members = members;
	}

	@Override
	public Member[] getMembers() {
		return members;
	}

	@Override
	public void add(Member member) {

		members[count] = member;
		count++;
	}

	@Override
	public Member login(Member member) {
		Member returnMember = null;
		for (int i = 0; i < members.length; i++) {
			if (member.getUserid().equals(members[i].getUserid())
				&& member.getPassword().equals(members[i].getPassword())) {
				returnMember = new Member();
				returnMember = members[i];
				break;
			}
			
		}
		return returnMember;
	}
		
	
	

}