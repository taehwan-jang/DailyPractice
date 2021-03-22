package ex12inheritance;

class Box {
	public void boxWrap() {
		System.out.println("Box로 포장");
	}
}
class PaperBox extends Box {
	public void paperBoxWrap() {
		System.out.println("paperBox로 포장");
	}
}
class GoldPaperBox extends PaperBox {
	public void goldPaperBoxWrap() {
		System.out.println("GoldPaperBox로 포장");
	}
}


public class E09InstatnceOf {
	//왜 static으로 적었는지 공부해볼것
	//main함수에 static이 포함되어있어서 메소드 호출?
	//그럼 왜 Box를 매개변수로 불러오는거엔 static이 가능한지?
	static void wrapBox(Box b) {
		int num1 = (int)1.0;
		double num2 = 1;
		
		if(b instanceof GoldPaperBox) {
			((GoldPaperBox)b).goldPaperBoxWrap();
		}
		else if(b instanceof PaperBox) {
			((PaperBox)b).paperBoxWrap();
		}
		else if(b instanceof Box) {
			b.boxWrap();
		}
	}

	public static void main(String[] args) {

		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
		
		
		

	}

}
