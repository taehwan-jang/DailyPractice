package ex17collection;

class Orange {
	int sugar;
	public Orange(int sugar) {
		this.sugar = sugar;
	}
	public void showInfo() {
		System.out.println("오렌지의 당도:"+sugar);
	}
}
class OrangeBox{
	Orange item;
	public void store(Orange item) {
		this.item = item;
	}
	public Orange pullOut() {
		return item;
	}
}
class FruitBox {
	Object item;
	public FruitBox(Object item) {
		this.item = item;
	}
	public void store(Orange item) {
		this.item = item;
	}
	public Object pullOut() {
		return item;
	}
}
public class E01GenericBasic {

	public static void main(String[] args) {
		
		OrangeBox oBox1 = new OrangeBox();
		Orange orange1 = new Orange(10);
		oBox1.store(orange1);
		orange1 = oBox1.pullOut();
		orange1.showInfo();
		
		FruitBox fBox1 = new FruitBox(new Orange(20));
		Orange orange3 = (Orange)fBox1.pullOut();
		orange3.showInfo();
		
		FruitBox fBox2 = new FruitBox("당도30오렌지");//런탐에러
		Orange orange4 = (Orange)fBox2.pullOut();
		orange4.showInfo();
		
	}
}
