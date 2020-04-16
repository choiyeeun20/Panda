package com.jse.member;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemberView extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Container container;
	private JLabel title, nameLabel, useridLabel, passwordLabel, ssnLabel, addrLabel;
	private JTextField nameText, useridText, passwordText, ssnText, addrText;
	private JTextArea resultText;
	private JButton submitButton, listButton, loginButton, detailButton, nameButton, genderButton, countButton, updateButton, deleteButton ;
	public MemberService memberService;

	public void open() {
		memberService = new MemberServiceImpl();
		setTitle("Swing Exercise");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		container = getContentPane();
		container.setLayout(null);

		title = new JLabel("Swing Form");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		container.add(title);

		nameLabel = new JLabel("Name");
		nameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		nameLabel.setSize(100, 20);
		nameLabel.setLocation(100, 100);
		container.add(nameLabel);

		nameText = new JTextField();
		nameText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		nameText.setSize(190, 20);
		nameText.setLocation(200, 100);
		container.add(nameText);

		useridLabel = new JLabel("Userid");
		useridLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		useridLabel.setSize(100, 20);
		useridLabel.setLocation(100, 150);
		container.add(useridLabel);

		useridText = new JTextField();
		useridText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		useridText.setSize(150, 20);
		useridText.setLocation(200, 150);
		container.add(useridText);

		passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		passwordLabel.setSize(100, 20);
		passwordLabel.setLocation(100, 200);
		container.add(passwordLabel);

		passwordText = new JTextField();
		passwordText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		passwordText.setSize(150, 20);
		passwordText.setLocation(200, 200);
		container.add(passwordText);

		ssnLabel = new JLabel("SSN");
		ssnLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		ssnLabel.setSize(100, 20);
		ssnLabel.setLocation(100, 250);
		container.add(ssnLabel);

		ssnText = new JTextField();
		ssnText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		ssnText.setSize(150, 20);
		ssnText.setLocation(200, 250);
		container.add(ssnText);

		addrLabel = new JLabel("Address");
		addrLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		addrLabel.setSize(100, 20);
		addrLabel.setLocation(100, 300);
		container.add(addrLabel);

		addrText = new JTextField();
		addrText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		addrText.setSize(150, 20);
		addrText.setLocation(200, 300);
		container.add(addrText);

		submitButton = new JButton("submit");
		submitButton.setFont(new Font("Arial", Font.PLAIN, 15));
		submitButton.setSize(100, 20);
		submitButton.setLocation(100, 400);
		container.add(submitButton);
		submitButton.addActionListener(this);

		listButton = new JButton("list");
		listButton.setFont(new Font("Arial", Font.PLAIN, 15));
		listButton.setSize(100, 20);
		listButton.setLocation(220, 400);
		container.add(listButton);
		listButton.addActionListener(this);

		loginButton = new JButton("login");
		loginButton.setFont(new Font("Arial", Font.PLAIN, 15));
		loginButton.setSize(100, 20);
		loginButton.setLocation(340, 400);
		container.add(loginButton);
		loginButton.addActionListener(this);
		
		detailButton = new JButton("datail");
		detailButton.setFont(new Font("Arial", Font.PLAIN, 15));
		detailButton.setSize(100, 20);
		detailButton.setLocation(100, 440);
		container.add(detailButton);
		detailButton.addActionListener(this);

		nameButton = new JButton("name");
		nameButton.setFont(new Font("Arial", Font.PLAIN, 15));
		nameButton.setSize(100, 20);
		nameButton.setLocation(220, 440);
		container.add(nameButton);
		nameButton.addActionListener(this);

		genderButton = new JButton("gender");
		genderButton.setFont(new Font("Arial", Font.PLAIN, 15));
		genderButton.setSize(100, 20);
		genderButton.setLocation(340, 440);
		container.add(genderButton);
		genderButton.addActionListener(this);
		
		countButton = new JButton("count");
		countButton.setFont(new Font("Arial", Font.PLAIN, 15));
		countButton.setSize(100, 20);
		countButton.setLocation(100, 480);
		container.add(countButton);
		countButton.addActionListener(this);
		
		updateButton = new JButton("udpate");
		updateButton.setFont(new Font("Arial", Font.PLAIN, 15));
		updateButton.setSize(100, 20);
		updateButton.setLocation(220,480);
		container.add(updateButton);
		updateButton.addActionListener(this);
		
		deleteButton = new JButton("delete");
		deleteButton.setFont(new Font("Arial", Font.PLAIN, 15));
		deleteButton.setSize(100, 20);
		deleteButton.setLocation(340, 480);
		container.add(deleteButton);
		deleteButton.addActionListener(this);
		
		resultText = new JTextArea();
		resultText.setFont(new Font("맑은고딕", Font.PLAIN, 15));
		resultText.setSize(300, 400);
		resultText.setLocation(500, 100);
		resultText.setLineWrap(true);
		resultText.setEditable(false);
		container.add(resultText);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == submitButton) {
			JOptionPane.showMessageDialog(this, "test");
			nameText.setText("홍길동,유관순,이순신,신사임당,이도");
			useridText.setText("hong,you,lee,shin,lee");
			passwordText.setText("1,1,1,1,1");
			ssnText.setText("900101-1,900101-2,900101-3,900101-4,900101-5,");
			addrText.setText("서울,서울,서울,부산,부산");
			String data = String.format("%s /%s /%s /%s /%s", 
					nameText.getText(),
					useridText.getText(),
					passwordText.getText(),
					ssnText.getText(),
					addrText.getText());
			String []arr = data.split("/");
			String [] names = arr[0].split(",");
			String [] userids = arr[1].split(",");
			String [] passwords = arr[2].split(",");
			String [] ssns = arr[3].split(",");
			String [] addrs = arr[4].split(",");
			Member member = null;
			for(int i=0;i<names.length;i++) {
				member = new Member();
				member.setName(names[i]);
				member.setUserid(userids[i]);
				member.setPassword(passwords[i]);
				member.setSsn(ssns[i]);
				member.setAddr(addrs[i]);
				memberService.add(member);
			}
		}else if (e.getSource() == listButton) {
			Member[] members = memberService.list();
			String result ="";
			for(int i=0;i<members.length;i++) {
				result +=(members[i]+"\n");
			}
			nameText.setText("");
			useridText.setText("");
			passwordText.setText("");
			ssnText.setText("");
			addrText.setText("");
			resultText.setText(result);
		}else if(e.getSource() == loginButton) {
			JOptionPane.showMessageDialog(this, "LogIn : " + useridText.getText()
			+ "," + passwordText.getText());
			Member member = new Member(); // parameter의 Member 타입
			member.setUserid(useridText.getText()); // parameter의 타입이 Member. useridText.getText.(보안)
			member.setPassword(passwordText.getText());
			Member returnMember = memberService.login(member);
			if(returnMember != null) {
				resultText.setText(returnMember.toString());
				
			}else {
				resultText.setText("로그인실패");
			}
		}else if(e.getSource() == detailButton) {
			JOptionPane.showMessageDialog(this, "Detail : " + useridText.getText());
			String userid =useridText.getText(); //userid에 사용자가입력한 useridText.getText 대입
			Member returnUserid =memberService.detail(userid); 
			if(returnUserid != null) {
				resultText.setText(returnUserid.toString());
			}else {
				resultText.setText("해당 아이디를 찾을 수 없습니다");
			}
			
		}else if(e.getSource() == nameButton) {
			JOptionPane.showMessageDialog(this, "Name : " + nameText.getText());
			Member[] returnName = memberService.searchByName(nameText.getName());
			if(returnName != null) {
			String result ="";
			for(int i=0;i<returnName.length;i++) {
				result += returnName[i].toString()+"\n";
			} 
			resultText.setText(result);
			}else {
				resultText.setText("해당 이름을 찾을 수 없습니다");
			}
	
		}else if(e.getSource() == genderButton) {
			memberService.searchByGender(ssnText.getText());
			
			
		}else if(e.getSource() == countButton) {
			
		}else if(e.getSource() == updateButton) {
			String userid = useridText.getText();
			String newPassword = passwordText.getText();
			Member updateMember = new Member();
			updateMember.setUserid(userid);
			updateMember.setPassword(newPassword);
			memberService.update(updateMember);
		}else if(e.getSource() == deleteButton) {
	
}
}
		

}


