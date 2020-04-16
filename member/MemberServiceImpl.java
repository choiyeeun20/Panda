
package com.jse.member;


public class MemberServiceImpl implements MemberService {
	private Member[] members;
	private int count;
	
	public MemberServiceImpl() {
		members = new Member[5];
		count =0;
	}


	@Override
	public void add(Member member) { //Create

		members[count] = member;
		count++;
	}



	@Override
	public Member[] list() { //Read
		return members;
	}


	@Override
	public int Count() { //Read
		return count;
	}

	@Override
	public int count(String name) {
		int returnCount = 0;
		for(int i=0;i<members.length;i++) {
			if(name.equals(members[i].getName())){
				returnCount++;
				
			}
		}
		return returnCount;
	}


	@Override
	public void update(Member member) { //Update
		for(int i=0;i<count;i++) {
			if(member.getUserid().equals(members[i].getUserid())){	
				members[i].setPassword(member.getPassword());
				break;
			}
				
			}
			}


	@Override
	public void delete(Member member) { //Delete
		Member returnDelete = null;
		for(int i=0;i<count;i++) { //length만큼 돌면 손해이다.length는 구성원수만큼 도는것인데, 
								//항상 전체 구성원수만큼 채워진다는 보장이없으므로 count로 바꿔야함
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPassword().equals(members[i].getPassword())) {
				members[i] = members[count-1];//회원탈퇴
				members[members.length-1]=null; //맨끝값도 null값줘서 초기화
				count--;
			}
				
		}
	}
		
	

		
	

	@Override
	public Member login(Member member) { //Read
		Member returnMember = null;
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())
					&& member.getPassword().equals(members[i].getPassword())) {
				returnMember = new Member();//new Member();는 공간이 생긴것.생략가능함.
				returnMember = members[i]; //[i]를 할당하면 공간이 생기기때문에 위에서 공간을 넣을필요없음.
				break;
			}
		}
		return returnMember;
	}

	


	@Override
	public Member detail(String userid) {
		Member returnUserid = null; //return타입의 객체를 만듦
		for(int i=0;i<count;i++) {
			if(userid.equals(members[i].getUserid())){
				returnUserid = members[i];
				break;
			}
		}
		return returnUserid;
	}


	@Override
	public Member[] searchByName(String name) {
	
	Member[] returnNames = null;
		int searchCount = count(name);
		if(searchCount !=0) {
			returnNames = new Member[searchCount]; // return타입의 객체.초기화해줘야함
			//객체 만든다하면 무조건! new Member();
			// parameter를 넣으면 method를 추가해야함 오버리딩
			int j =0; //[j]만큼만 증가
			for(int i=0;i<count;i++) {
				if(name.equals(members[i].getName())) { //if는 [j]상관없이 돌아감
					returnNames[j] = members[i]; //배열의 타입을 맞춰야해서 [i]로 동일하게줘야함
					j++;
					if(searchCount == j) {
						break;
					}
				}
			}
		}
		return returnNames;
	}


	@Override
	public Member[] searchByGender(String gender) {
		Member [] returnGender = null;
		int searchCount = count(gender);
		if(searchCount !=0) {
			returnGender = new Member[searchCount];
			int j =0;
			for(int i=0;i<count;i++) {
				if(gender.equals(members[i].getSsn())) {
					returnGender[j] = members[i];
					j++;
					if(searchCount == j) {
						
						
						break;
					}
				}
			}
		}
		
		return returnGender;
	}
}