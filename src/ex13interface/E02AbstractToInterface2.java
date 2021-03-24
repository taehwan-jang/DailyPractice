package ex13interface;

/*
추상클래스를 인터페이스로 변경하기
	abstract class -> interface
	메소드인 경우 public abstract 제거
	멤버상수인 경우 public static final 제거
 */
interface PersonalNumberStorageImpl {//왜 이미 정의됐다고 하는걸까?->패키지 안에
	//정보 저장용							같은이름의 클래스파일이 이미 존재하기때문
    void addPersonalInfo(String juminNum, String name);
    //정보 검색용 
    String searchPersonalInfo(String juminNum);
}
//DTO는 정보를 저장하는 용도이므로 변경없음
class PersonalInfoVO {	
	private String name;
	private String juminNum;
	
	public PersonalInfoVO(String name, String juminNum) {
		this.name = name;
		this.juminNum = juminNum;
	}
	//private멤버를 반환하기 위한 getter 메소드 정의
	public String getName() {
		return name;
	}
	public String getJuminNum() {
		return juminNum;
	}
}
/*
클래스가 클래스를 상속할때 -> extends
클래스가 인터페이스를 상속할때 -> implements
인터페이스가 인터페이스를 상속할때 -> extends를 사용한다.

extends는'상속'이라 표현하고 implements는'구현'이라 표현한다.
 */
class PersonalNumberStorage implements PersonalNumberStorageImpl {
	
	PersonalInfoVO[] personalArr;//정보저장용 객체배열
	int numOfPerInfo;//입력정보 카운트
	
	public PersonalNumberStorage(int arrSize) {
		personalArr = new PersonalInfoVO[arrSize];
		numOfPerInfo = 0;
		
	}
	/*
	상속을 통해 추상메소드를 포함하게 되었으므로 반드시 아래와 같이
	오버라이딩 해야한다. 필수사항이며 하지 않을경우 에러가 발생한다.
	 */
	
	//전달받은 인자를 통해 DTO객체를 생성한 후 객체배열에 추가한다.
	@Override
	public void addPersonalInfo(String juminNum, String name) {
		personalArr[numOfPerInfo++] =
				new PersonalInfoVO(name, juminNum);
	}
	//주민번호를 인자로 객체배열을 검색한 후 일치한 정보가 있을경우 이름을 반환한다.
	@Override
	public String searchPersonalInfo(String juminNum) {
		for(int i=0;i<numOfPerInfo;i++) {
			if(juminNum.equals(personalArr[i].getJuminNum())==true) {
				return personalArr[i].getName();
			}
		}
		//검색결과가 없을때는 null을 반환한다.
		return null;
	}
}
public class E02AbstractToInterface2 {

	public static void main(String[] args) {
		//객체 생성
		PersonalNumberStorage storage =
				new PersonalNumberStorage(10);
		
		//정보추가
		storage.addPersonalInfo("123456-2231231", "개똥이");
		storage.addPersonalInfo("123456-1231232", "소똥이");
		
		//주민번호를 통해 정보 검색
		System.out.println(storage.searchPersonalInfo("123456-1231232"));
		System.out.println(storage.searchPersonalInfo("123456-1231231"));
		System.out.println(storage.searchPersonalInfo("123456-2231231"));
	}

}
