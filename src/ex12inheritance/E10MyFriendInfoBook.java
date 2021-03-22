package ex12inheritance;

import java.util.Scanner;

class Friend {
	String name;
	String phone;
	String addr;
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	public void showAllData() {
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+phone);
		System.out.println("주소: "+addr);
	}
	public void showBasicData() {}
}
class HighFriend extends Friend {
	String nickName;
	public HighFriend(String name, String phone, String addr,String nickName) {
		super(name,phone,addr);
		this.nickName = nickName;
	}
	@Override
	public void showAllData() {
		super.showAllData();
		System.out.println("별명: "+nickName); 
	}
	@Override
	public void showBasicData() {
		System.out.println("==고등친구기본정보==");
		System.out.println("별명: "+nickName);
		System.out.println("전화번호: "+phone);
	}
}
class UnivFriend extends Friend {
	String major;
	public UnivFriend(String name, String phone, String addr,String major) {
		super(name,phone,addr);
		this.major = major;
	}
	@Override
	public void showAllData() {
		super.showAllData();
		System.out.println("전공: "+major); 
	}
	@Override
	public void showBasicData() {
		System.out.println("==대학친구기본정보==");
		System.out.println("전공: "+major);
		System.out.println("전화번호: "+phone);
	}
}
public class E10MyFriendInfoBook {
	
	public static void menuShow() {
		System.out.println("**메뉴를 선택하세요**");
		System.out.println("1.고등친구 입력");
		System.out.println("2.대학친구 입력");
		System.out.println("3.전체정보 출력");
		System.out.println("4.기본정보 출력");
		System.out.println("5.친구정보 검색");
		System.out.println("6.친구정보 삭제");
		System.out.println("7.프로그램 종료");
		System.out.print("입력>>>");
	}

	public static void main(String[] args) {

		FriendInfoHandler handler = new
				FriendInfoHandler(100);
		
		while(true) {
			//return과 break의 차이!!! 다시 공부해 애매하다
			menuShow();
			
			Scanner scan = new Scanner(System.in);
			int inputNum = scan.nextInt();
			
			switch(inputNum) {
			case 1: case 2:
				handler.addFriend(inputNum);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showBasicData();
				break;
			case 5:
				handler.searchInfo();
				break;
			case 6:
				handler.deleteInfo();
				break;
			case 7:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
		}
	}
}
class FriendInfoHandler {
	private Friend[] myFriends;
	private int numOfFriends;
	public FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
	}
	public void addFriend(int inputNum) {
		Scanner scan = new Scanner(System.in);
		String iName,iPhone,iAddr,iNickName,iMajor;
		
		System.out.print("이름 :");
		iName = scan.nextLine();
		System.out.print("\n전화번호 :");
		iPhone = scan.nextLine();
		System.out.print("\n주소 :");
		iAddr = scan.nextLine();
		
		if(inputNum==1) {
			System.out.print("\n별명 :");
			iNickName = scan.nextLine();
			myFriends[numOfFriends++]= new HighFriend
					(iName, iPhone, iAddr, iNickName);
		}
		else if(inputNum==2) {
			System.out.print("\n전공 :");
			iMajor = scan.nextLine();
			myFriends[numOfFriends++]= new UnivFriend
					(iName, iPhone, iAddr, iMajor);
		}
		System.out.println("입력이 완료되었습니다.");
	}
	public void showAllData() {
		for(int i=0 ; i<numOfFriends ; i++) {
			myFriends[i].showAllData();
		}
		System.out.println("==전체 정보가 출력되었습니다.==");
	}
	public void showBasicData() {
		for(int i=0 ; i<numOfFriends ; i++) {
			myFriends[i].showBasicData();
		}
		System.out.println("==기본 정보가 출력되었습니다.==");
	}
	public void searchInfo() {
		boolean isFind=false;
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요: ");
		String sName = scan.nextLine();
		
		for(int i=0 ; i<numOfFriends ; i++) {
			if(sName.equals(myFriends[i].name)==true) {
				System.out.println(sName+"의 정보입니다.");
				myFriends[i].showAllData();
				isFind=true;
			}
		}
		if(isFind=false) {
			System.out.println("입력한 정보를 찾을 수 없습니다.");
		}
	}
	public void deleteInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 이름을 입력하세요: ");
		String sName = scan.nextLine();
		int deIndex = -1;
		
		for(int i=0 ; i<numOfFriends ; i++) {
			if(sName.equals(myFriends[i].name)==true) {
				deIndex = i;
				myFriends[i] = null;
				numOfFriends--;
				break;
			}
		}		
			
		if(deIndex!=-1) {
			for(int j=deIndex ; j<numOfFriends ; j++) {
				myFriends[j] = myFriends[j+1];
			}
			System.out.println("삭제가 완료되었습니다.");
		}
		else {
			System.out.println("입력한 정보를 찾을 수 없습니다.");
		}
		
	}
	
	
	
}
