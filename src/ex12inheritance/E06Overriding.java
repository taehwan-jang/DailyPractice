package ex12inheritance;

class Speaker {
	
	private int volumnRate;
	
	public void setVolumn(int vol) {
		volumnRate = vol;
	}
	public void showState() {
		System.out.println("스피커 볼륨의 크기: "+ volumnRate);
	}
}
class BaseSpeaker extends Speaker {
	
	private int baseRate;
	public void setBase(int base) {
		baseRate = base;
	}
	@Override
	public void showState() {
		super.showState();
		System.out.println("스피커 베이스 볼륨의 크기: "+ baseRate);
	}
}



public class E06Overriding {

	public static void main(String[] args) {

		BaseSpeaker baseSpeaker = new BaseSpeaker();
		baseSpeaker.setVolumn(10);
		baseSpeaker.setBase(20);
		baseSpeaker.showState();
		
		System.out.println();
		
		//sup클래스에서 상속된 클래스에 접근할수 있으나
		//범위가 한정적임
		Speaker speaker = new BaseSpeaker();
		speaker.setVolumn(30);
		speaker.showState();
		//근데 왜 여기엔 생성자메소드가 없는지 ? 생성자로 초기화가 없어서?
		
	}

}
