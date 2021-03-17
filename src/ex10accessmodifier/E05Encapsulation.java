package ex10accessmodifier;


class MemberRegist{
	void doMemberRegist() {
		System.out.println("1.회원가입 진행");
	}
}
class CongratulationPoint{
	void doCongratulationPoint() {
		System.out.println("3.가입축하 10포인트 지급");
	}
}
class AutoLogin{
	void doAutoLogin() {
		System.out.println("2.자동 로그인");
	}
}
class FirstLoginEvent{
	void doFirstLoginEvent() {
		System.out.println("4.첫 로그인 이벤트 페이지 이동");
	}
}
class Encapsultaion{
	MemberRegist memberRegist = new MemberRegist();
	FirstLoginEvent firstLoginEvent = new FirstLoginEvent();
	AutoLogin autoLogin = new AutoLogin();
	CongratulationPoint congratulationPoint = 
			new CongratulationPoint();
	
	void doProcess() {
		memberRegist.doMemberRegist();
		autoLogin.doAutoLogin();
		congratulationPoint.doCongratulationPoint();
		firstLoginEvent.doFirstLoginEvent();
	}
}




public class E05Encapsulation {

	public static void main(String[] args) {

		MemberRegist memberRegist = new MemberRegist();
		FirstLoginEvent firstLoginEvent = new FirstLoginEvent();
		AutoLogin autoLogin = new AutoLogin();
		CongratulationPoint congratulationPoint = 
				new CongratulationPoint();
		
		
		memberRegist.doMemberRegist();
		autoLogin.doAutoLogin();
		congratulationPoint.doCongratulationPoint();
		firstLoginEvent.doFirstLoginEvent();
		
		System.out.println("==========================");
		
		System.out.println("캡슐화 이후 코드");
		new Encapsultaion().doProcess();
		
		//캡슐화하면 한방에 끝나버림!!
		
		
		
		
		
	}

}
