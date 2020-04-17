
package com.jse.member;


public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int count;
	
	public MemberServiceImpl() {
		members = new Member[5];
		count =0;
	}

	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
		
	}

	@Override
	public Member[] list() {
		return members;
	}

	@Override
	public Member[] searchByName(String name) {
		Member[] returnNames =null;
		int searchCount = count(name);
		if(searchCount !=0) {
			returnNames = new Member[searchCount];
			int j =0;
			for(int i=0;i<count;i++) {
				if(name.equals(members[i].getName())) {
					returnNames[j] = members[i];
					j++;
				if(searchCount ==j) {
					break;
				}
				}
			}
		}
		return returnNames;
	}

	@Override
	public Member detail(String userid) {
		Member returnUserid =null;
		for(int i=0;i<count;i++) {
			if(userid.equals(members[i].getUserid())) {
				returnUserid = members[i];
				break;
			}
		}
		return returnUserid;
	}

	@Override
	public int Count() {
		return count;
	}

	@Override
	public int count(String name) {
		int returnCount = 0;
		for(int i=0;i<count;i++) {
			if(name.equals
					(members[i].getName())) {
				returnCount++;
			}
		}
		return returnCount;
	}

	@Override
	public Member login(Member member) {
		Member returnMember = null;
		for(int i=0; i<count;i++) {
			if(member.getUserid().equals(members[i].getUserid())
					&& member.getPassword().equals(members[i].getPassword())) {
				returnMember = members[i];
				break;
			}
		}
			
		return returnMember;
	}

	@Override
	public void update(Member member) {
		for(int i=0;i<count;i++) {
			if(member.getUserid().equals(members[i].getUserid())) {
				members[i].setPassword(member.getPassword());
				break;
			}
		}
		
	}

	@Override
	public void delete(Member member) {
		for(int i=0; i<count;i++) {
			if(member.getUserid().equals(members[i].getUserid())
					&& member.getPassword().equals(members[i].getPassword())) {
				members[i] = members[count-1];
				members[count-1] =null;
				count--;
			}
	}


	

	}

	
}