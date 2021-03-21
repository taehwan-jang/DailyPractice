package ex12inheritance;

class Computer {
	String owner;
	
	public Computer(String name) {
		owner = name;
	}
	private void keyboardTouch() {
		System.out.println("키보드를 통해서 입력한 ");
	}
	private void calculator() {
		System.out.println("요청된 내용을 계산한다.");
	}
	public void calculatorFunc() {
		keyboardTouch();
		calculator();
	}
}

class NoteBookComputer extends Computer {
	int bettery;
	
	public NoteBookComputer(String name, int bettery) {
		super(name);
		this.bettery = bettery;
	}
	public void charging() {
		bettery += 5;
	}
	public void movigCal() {
		if(bettery<0) {
			System.out.println("베터리가 부족하여 방전됨");
			return;
		}
		System.out.println("이동하면서"); 
		calculatorFunc();
		bettery -= 1;
	}
}

class TabletNoteBook extends NoteBookComputer {
	String registPencil;
	
	public TabletNoteBook(String name, int bettery, String pen) {
		super(name,bettery);
		registPencil = pen;
	}
	public void write(String penInfo) {
		if(bettery<0) {
			System.out.println("베터리 부족하여 방전됨");
			return;
		}
		if(registPencil.compareTo(penInfo)!=0) {
			System.out.println("등록된 펜이 아닙니다.");
			return;
		}
		System.out.println("스크린에 펜으로 그림을 그린다.");
		movigCal();
		bettery -= 1;
	}
}


public class E04IsAInheritance {

	public static void main(String[] args) {

		NoteBookComputer noteBook = new 
				NoteBookComputer("공유", 5);
		TabletNoteBook tablet = new 
				TabletNoteBook("이동욱", 5, "ISE-1234");
		
		System.out.println("====노트북 사용====");
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		
		System.out.println("ISE-1234 펜으로 테블릿 사용==");
		tablet.write("ISE-1234");
		System.out.println("XYZ-1234 펜으로 테블릿 사용==");
		tablet.write("XYZ-1234");		
		
	}

}
