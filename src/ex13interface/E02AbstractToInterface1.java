package ex13interface;

abstract class PersonalNumberStorageAbs {
	public abstract void addPersonalInfo(String juminNum, String name);
	public abstract String searchPersonlInfo(String juminNum);
}

class PersonalInfoDTO {
	private String name;
	private String juminNum;
	//왜 private인가? 고민해볼것.fuitSale 참조 혹은 접근지정자
	public PersonalInfoDTO(String name, String juminNum) {
		this.name = name;
		this.juminNum = juminNum;
	}
	public String getName() {
		return name;
	}
	public String getJuminNum() {
		return juminNum;
	}
}
class PersonalNumberStorageExt extends PersonalNumberStorageAbs {
	
	PersonalInfoDTO[] personalArr;
	int numOfPerInfo;
	
	public PersonalNumberStorageExt(int num) {
		personalArr = new PersonalInfoDTO[num];
		numOfPerInfo = 0;
	}
	@Override
	public void addPersonalInfo(String juminNum, String name) {
		personalArr[numOfPerInfo++] = new PersonalInfoDTO(name,juminNum);
	}
	@Override
	public String searchPersonlInfo(String juminNum) {
		for(int i=0 ; i<numOfPerInfo ; i++) {
			if(juminNum.equals(personalArr[i].getJuminNum())==true) {
				return personalArr[i].getName();
			}
		}
		return null;
	}
}
public class E02AbstractToInterface1 {

	public static void main(String[] args) {
		
		PersonalNumberStorageExt storage =
				new PersonalNumberStorageExt(100);
		
		storage.addPersonalInfo("123456-123456", "장태환");
		storage.addPersonalInfo("123456-223456", "장태바리");
		
		System.out.println(storage.searchPersonlInfo("123456-123456"));

	}

}
